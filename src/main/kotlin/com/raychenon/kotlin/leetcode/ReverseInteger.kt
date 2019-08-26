package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-08-26
 * https://leetcode.com/problems/reverse-integer
 */
internal object ReverseInteger {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    fun reverse(x: Int): Int {
        var reversed = 0
        var remainder = x
        while (remainder != 0) {
            val pop = remainder % 10
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) return 0
            if (reversed < Integer.MIN_VALUE / 10 || reversed == Integer.MIN_VALUE / 10 && pop < -8) return 0

            remainder = remainder / 10
            reversed = reversed * 10 + pop
        }

        return reversed
    }
}
