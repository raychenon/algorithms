package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 27/4/2020
 * https://leetcode.com/problems/subarray-sum-equals-k
 */
public class SubarraySumEqualsKTest {

    private static SubarraySumEqualsK subarraySumEqualsK;

    @BeforeClass
    public static void setUp() {
        subarraySumEqualsK = new SubarraySumEqualsK();
    }

    @Test
    public void expect2Test() {
        evaluateMethods(2, new int[]{1, 1, 1}, 2);
    }

    @Test
    public void expect12Test() {
        evaluateMethods(12, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 2);
    }

    @Test
    public void negativeNumbersTest() {
        evaluateMethods(2, new int[]{1, -2, 3, 1, 2, -3, 1}, -1);
    }

    void evaluateMethods(int expected, int[] nums, int k) {
        assertEquals(expected, subarraySumEqualsK.subarraySumBruteForce(nums, k));
        assertEquals(expected, subarraySumEqualsK.subarraySumDP(nums, k));
    }

}
