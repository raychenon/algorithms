package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-10-08
 * https://leetcode.com/problems/longest-arithmetic-subsequence-of-given-difference
 */
object LongestArithmeticSubsequenceofGivenDifference {

    fun longestSubsequence(arr: IntArray, difference: Int): Int {
        var map = mutableMapOf<Int, Int>()
        var max: Int = 0
        for (a in arr) {
            map.put(a, map.getOrDefault(a - difference, 0) + 1)
            max = Math.max(max, map.getOrDefault(a, 0))
        }
        return max
    }
}