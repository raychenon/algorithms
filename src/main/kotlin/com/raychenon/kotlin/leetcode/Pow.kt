package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-08-26
 * https://leetcode.com/problems/powx-n/
 */
object Pow {
    //
    /**
     * Exponentiation by squaring
     * https://en.wikipedia.org/wiki/Exponentiation_by_squaring
     *
     *Time Complexity: O(log(n)), where 'n' is the exponent
     * Space Complexity: O(1)
     */
    fun myPow(base: Double, exp: Int): Double {
        if (exp == 0) return 1.0
        var n = exp
        var x = base
        var res = 1.0

        if (n < 0) {
            x = 1 / x
            n = -n
        }

        while (n > 1) {
            // if n is odd
            if ((n % 2) == 1) {
                res = res * x
                x = x * x
                n = (n - 1) / 2
            } else {
                x = x * x
                n = n / 2
            }
        }

        return res * x
    }

    fun myPowRecursive(x: Double, n: Int): Double {
        if (n == 0) return 1.0

        val temp = myPowRecursive(x, n / 2)
        // n is even,  x ^ n = x^(n/2) * x^(n/2)
        return if (n % 2 == 0) {
            temp * temp
        } else {
            // n is odd,  x ^ n = x * x^(n/2) * x^(n/2)
            if (n > 0)
                x * temp * temp
            else
                temp * temp / x
        }
    }
}
