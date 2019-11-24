package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-11-24
 * https://leetcode.com/problems/rotated-digits
 */
object RotatedDigits {

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