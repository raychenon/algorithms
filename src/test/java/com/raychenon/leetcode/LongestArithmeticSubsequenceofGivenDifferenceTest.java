package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 2019-10-08
 * https://leetcode.com/problems/longest-arithmetic-subsequence-of-given-difference/
 */
public class LongestArithmeticSubsequenceofGivenDifferenceTest {


    private static LongestArithmeticSubsequenceofGivenDifference instance;

    @BeforeClass
    public static void setUp() {
        instance = new LongestArithmeticSubsequenceofGivenDifference();
    }

    @Test
    public void example1Test() {
        int input[] = {1, 2, 3, 4};
        assertEquals(4, instance.longestSubsequence(input, 1));
    }

    @Test
    public void example2Test() {
        int input[] = {1, 3, 5, 7};
        assertEquals(1, instance.longestSubsequence(input, 1));
    }

    @Test
    public void example3Test() {
        int input[] = {1, 5, 7, 8, 5, 3, 4, 2, 1};
        assertEquals(4, instance.longestSubsequence(input, -2));
    }
}
