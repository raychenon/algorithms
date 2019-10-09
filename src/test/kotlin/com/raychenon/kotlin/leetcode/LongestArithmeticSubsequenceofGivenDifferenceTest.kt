package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-10-08
 * https://leetcode.com/problems/longest-arithmetic-subsequence-of-given-difference/
 */
class LongestArithmeticSubsequenceofGivenDifferenceTest {

    @Test
    fun example1Test() {
        Assert.assertEquals(
            4,
            LongestArithmeticSubsequenceofGivenDifference.longestSubsequence(intArrayOf(1, 2, 3, 4), 1)
        )
    }

    @Test
    fun example2Test() {
        Assert.assertEquals(
            1,
            LongestArithmeticSubsequenceofGivenDifference.longestSubsequence(intArrayOf(1, 3, 5, 7), 1)
        )
    }

    @Test
    fun example3Test() {
        Assert.assertEquals(
            4,
            LongestArithmeticSubsequenceofGivenDifference.longestSubsequence(intArrayOf(1, 5, 7, 8, 5, 3, 4, 2, 1), -2)
        )
    }
}