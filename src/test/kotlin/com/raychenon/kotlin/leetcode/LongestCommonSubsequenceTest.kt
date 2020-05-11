package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 11/5/2020
 * https://leetcode.com/problems/longest-common-subsequence/
 */
class LongestCommonSubsequenceTest {


    @Test
    fun example1Test() {
        //  The longest common subsequence is "ace"
        assertLongestCommonSubsequenceMethods(3, "abcde", "ace")
    }

    @Test
    fun example2Test() {
        // The longest common subsequence is "abc"
        assertLongestCommonSubsequenceMethods(3, "abc", "abc")
    }

    @Test
    fun example3Test() {
        // There is no such common subsequence,
        assertLongestCommonSubsequenceMethods(0, "abc", "def")
    }

    @Test
    fun exampleDNA1Test() {
        // The longest common subsequence is "ttg"
        assertLongestCommonSubsequenceMethods(3, "ttag", "gtgatcg")
    }

    @Test
    fun exampleDNA2Test() {
        assertLongestCommonSubsequenceMethods(5, "actgattag", "gtgtgatcg")
    }

    private fun assertLongestCommonSubsequenceMethods(
        expected: Int,
        text1: String,
        text2: String
    ) {
        TestCase.assertEquals(
            expected,
            LongestCommonSubsequence.longestCommonSubsequenceDPreverse(text1, text2)
        )
    }
}