package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-08-26
 * https://leetcode.com/problems/reverse-integer
 */
internal object ReverseInteger {

    /**
     * Time Complexity: O(N) ~ log10(n), N is the size of Array
     * Space Complexity: O(1)
     */
    fun reverse(x: Int): Int {
        var reversed = 0
        var remainder = x
        while (remainder != 0) {
            val pop = remainder % 10

            remainder = remainder / 10
            reversed = reversed * 10 + pop
        }

        return reversed
    }
}
