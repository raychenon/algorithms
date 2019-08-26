package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-08-26
 * https://leetcode.com/problems/reverse-integer
 */
internal object ReverseInteger {
    fun reverse(x: Int): Int {
        var reversed = 0
        var remainder = x
        while (remainder != 0) {
            val rest = remainder % 10
            remainder = remainder / 10
            reversed = reversed * 10 + rest
        }

        return reversed
    }
}
