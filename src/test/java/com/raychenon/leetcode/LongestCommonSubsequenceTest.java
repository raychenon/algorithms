package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 9/5/2020
 * https://leetcode.com/problems/longest-common-subsequence/
 */
public class LongestCommonSubsequenceTest {

    private static LongestCommonSubsequence instance;

    @BeforeClass
    public static void setUp() {
        instance = new LongestCommonSubsequence();
    }

    @Test
    public void example1Test() {
        //  The longest common subsequence is "ace"
        assertLongestCommonSubsequenceMethods(3, "abcde", "ace");
    }

    @Test
    public void example2Test() {
        // The longest common subsequence is "abc"
        assertLongestCommonSubsequenceMethods(3, "abc", "abc");
    }

    @Test
    public void example3Test() {
        // There is no such common subsequence,
        assertLongestCommonSubsequenceMethods(0, "abc", "def");
    }

    private void assertLongestCommonSubsequenceMethods(int expected, String text1, String text2) {
        assertEquals(expected, instance.longestCommonSubsequenceDP(text1, text2));
        assertEquals(expected, instance.longestCommonSubsequenceDPreverse(text1, text2));
        assertEquals(expected, instance.longestCommonSubsequenceDPSpaceOptimized(text1, text2));
        assertEquals(expected, instance.longestCommonSubsequenceRecursive(text1, text2));
    }
}
