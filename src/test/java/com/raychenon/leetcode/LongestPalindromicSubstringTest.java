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
    public void test1() {
        assertEquals("aba", instance.longestPalindrome("babad"));
    }

}
