package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 16/5/2020
 * https://leetcode.com/problems/maximum-sum-circular-subarray/
 */
public class MaximumSumCircularSubarrayTest {

    private static MaximumSumCircularSubarray maximumSumCircularSubarray;

    @BeforeClass
    public static void setUp() {
        maximumSumCircularSubarray = new MaximumSumCircularSubarray();
    }

    @Test
    public void example1Test() {
        assertMaximumSumCircularSubarray(new int[]{1, -2, 3, -2}, 3);
    }

    @Test
    public void example2Test() {
        assertMaximumSumCircularSubarray(new int[]{5, -3, 5}, 10);
    }

    @Test
    public void example3Test() {
        assertMaximumSumCircularSubarray(new int[]{3, -1, 2, -1}, 4);
    }

    @Test
    public void example4Test() {
        assertMaximumSumCircularSubarray(new int[]{3, -2, 2, -3}, 3);
    }

    @Test
    public void example5Test() {
        assertMaximumSumCircularSubarray(new int[]{-2, -3, -1}, -1);
    }

    private void assertMaximumSumCircularSubarray(int[] A, int expected) {
        assertEquals(expected, maximumSumCircularSubarray.maxSubarraySumCircular(A));
    }

}
