package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 2019-09-30
 * https://leetcode.com/problems/longest-palindromic-substring
 */
public class LongestPalindromicSubstringTest {

    private static LongestPalindromicSubstring instance;

    @BeforeClass
    public static void setUp() {
        instance = new LongestPalindromicSubstring();
    }

    @Test
    public void palindromeLengthIsOddTest() {
        assertEquals("aba", instance.longestPalindrome("babad"));
    }

    @Test
    public void palindromeLengthIsEvenTest() {
        assertEquals("abba", instance.longestPalindrome("babbad"));
    }

    @Test
    public void twoSameLengthPalindromeTest() {
        // aba and ada are two possible palindromes
        // the one returned will be "ada", because all the string has to be traversed from left to right.
        assertEquals("ada", instance.longestPalindrome("babada"));
    }

    @Test
    public void emptyStringTest() {
        assertEquals("", instance.longestPalindrome(""));
        assertEquals("", instance.longestPalindrome(null));
    }

}
