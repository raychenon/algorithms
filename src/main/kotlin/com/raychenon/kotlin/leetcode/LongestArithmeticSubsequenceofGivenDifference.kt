package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-10-08
 * https://leetcode.com/problems/longest-arithmetic-subsequence-of-given-difference
 */
object LongestArithmeticSubsequenceofGivenDifference {

    fun longestSubsequence(arr: IntArray, difference: Int): Int {
        var map = mutableMapOf<Int, Int>()
        var longest: Int = 0
        for (a in arr) {
            map.put(a, map.getOrDefault(a - difference, 0) + 1)
            longest = Math.max(longest, map.getOrDefault(a, 0))
        }
        return longest
    }
}