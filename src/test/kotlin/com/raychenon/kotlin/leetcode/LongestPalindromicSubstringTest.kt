package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-10-01
 * https://leetcode.com/problems/longest-palindromic-substring/
 */
class LongestPalindromicSubstringTest {

    @Test
    fun palindromeLengthIsOddTest() {
        Assert.assertEquals("aba", LongestPalindromicSubstring.longestPalindrome("babad"))
    }

    @Test
    fun palindromeLengthIsEvenTest() {
        Assert.assertEquals("abba", LongestPalindromicSubstring.longestPalindrome("babbad"))
    }

    @Test
    fun twoSameLengthPalindromeTest() {
        // aba and ada are two possible palindromes
        // the one returned will be "ada", because all the string has to be traversed from left to right.
        Assert.assertEquals("ada", LongestPalindromicSubstring.longestPalindrome("babada"))
    }

    @Test
    fun emptyStringTest() {
        Assert.assertEquals("", LongestPalindromicSubstring.longestPalindrome(""))
    }
}