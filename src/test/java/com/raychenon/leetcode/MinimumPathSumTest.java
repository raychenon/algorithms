package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 21/4/2020
 * https://leetcode.com/problems/minimum-path-sum/
 */
public class MinimumPathSumTest {

    private static MinimumPathSum instance;

    @BeforeClass
    public static void setUp() {
        instance = new MinimumPathSum();
    }

    @Test
    public void example1Test() {
        int input[][] = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        assertMinimumPathSumMethods(7, input);
    }

    private void assertMinimumPathSumMethods(int expected, int[][] input) {
        assertEquals(expected, instance.minPathSumBruteForce(input));
    }

}
