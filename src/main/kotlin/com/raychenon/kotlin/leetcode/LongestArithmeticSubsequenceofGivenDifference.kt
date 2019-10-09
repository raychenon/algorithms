package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-10-08
 * https://leetcode.com/problems/longest-arithmetic-subsequence-of-given-difference
 */
object LongestArithmeticSubsequenceofGivenDifference {

    /**
     *  time complexity: O(n)
     *  space complexity: O(n)
     *  TODO need more explanation on thought process on this Dynamic Programming
     */
    fun longestSubsequence(arr: IntArray, difference: Int): Int {
        var las = mutableMapOf<Int, Int>() //  longest arithmetic subsequence(LAS)
        var longest: Int = 0
        for (a in arr) {
            las.put(a, las.getOrDefault(a - difference, 0) + 1)
            longest = Math.max(longest, las.getOrDefault(a, 0))
        }
        return longest
    }
}