package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 2/9/2020
 * https://leetcode.com/problems/non-overlapping-intervals/
 */
public class NonOverlappingIntervalsTest {

    private static NonOverlappingIntervals instance;

    @BeforeClass
    public static void setUp() {
        instance = new NonOverlappingIntervals();
    }

    @Test
    public void example1Test() {
        int[][] input = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        assertNonOverlappingIntervals(1, input);
    }

    @Test
    public void example2Test() {
        int[][] input = {{1, 2}, {1, 2}, {1, 2}};
        assertNonOverlappingIntervals(2, input);
    }

    @Test
    public void example3Test() {
        int[][] input = {{1, 2}, {2, 3}};
        assertNonOverlappingIntervals(0, input);
    }

    @Test
    public void example4Test() {
        int[][] array = {{1, 100}, {11, 22}, {1, 11}, {2, 12}};
        assertNonOverlappingIntervals(2, array);
    }

    private void assertNonOverlappingIntervals(int expected, int[][] arr) {
        assertEquals(expected, instance.eraseOverlapIntervals(arr));
    }

}
