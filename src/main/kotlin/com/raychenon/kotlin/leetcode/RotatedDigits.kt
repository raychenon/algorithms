package com.raychenon.kotlin.leetcode


/**
 * User: raychenon
 * Date: 2019-11-24
 * https://leetcode.com/problems/rotated-digits
 */
object RotatedDigits {

    /**
     * Time complexity: O(log10(N))
     * Space complexity: O(log10(N))
     */
    fun rotatedDigitsDP(N: Int): Int {
        val A = N.toString().toCharArray()
        val K = A.size

        val memo = Array(K + 1) { Array(2) { IntArray(2) } }
        memo[K][0][1] = 1
        memo[K][1][1] = 1

        for (i in K - 1 downTo 0) {
            for (eqf in 0..1) {
                for (invf in 0..1) {
                    var ans = 0
                    // We will compute ans = memo[i][eqf][invf],
                    // the number of good numbers with respect to N = A[i:].
                    // If eqf is true, we must stay below N, otherwise
                    // we can use any digits.
                    // Invf becomes true when we write a 2569, and it
                    // must be true by the end of our writing as all
                    // good numbers have a digit in 2569.
                    var d = '0'
                    while (d <= if (eqf === 1) A[i] else '9') {
                        if (d == '3' || d == '4' || d == '7') {
                            ++d
                            continue
                        }
                        val invo = d == '2' || d == '5' || d == '6' || d == '9'
                        ans += memo[i + 1][if (d == A[i]) eqf else 0][if (invo) 1 else invf]
                        ++d
                    }
                    memo[i][eqf][invf] = ans
                }
            }
        }
        return memo[0][1][0]
    }


    /**
     * Time complexity: O(N* log10(n))
     * Space complexity: O(log10(N))
     */
    fun rotatedDigits(N: Int): Int {
        var count = 0
        for (i in 1..N) {
            if (isValid(i)) ++count
        }
        return count
    }


    // 0->0
    // 1->1
    // 8->8

    // 2<->5
    // 6<->9
    /**
     * Time complexity: O(log10(n)) length the number. ex : log10(1000) = 3
     * Space complexity: O(log10(n)) for the String
     */
    internal fun isValid(n: Int): Boolean {
        var nb = n
        var rotated = 0
        var str = StringBuffer()
        while (nb != 0) {
            var modulo = nb % 10
            // invalid digits: 3,4,7
            if (modulo == 3 || modulo == 4 || modulo == 7) {
                return false
            }
            modulo = when (modulo) {
                2 -> 5
                5 -> 2
                6 -> 9
                9 -> 6
                else -> modulo
            }
            rotated = rotated * 10 + modulo
            str.append(modulo)
            nb = nb / 10
        }

        str.reverse()
        val res = !Integer.toString(n).equals(str.toString())
        //println("n = $n , rotated = $rotated , ${str.toString()} , ${res} ")
        return res
    }
}