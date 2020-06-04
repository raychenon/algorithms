package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * User: raychenon
 * Date: 4/6/2020
 * https://leetcode.com/problems/insert-interval/
 */
public class InsertIntervalTest {

    private static InsertInterval insertInterval;

    @BeforeClass
    public static void setUp() {
        insertInterval = new InsertInterval();
    }

    @Test
    public void example1Test() {
        evaluateInsertInterval(
                new int[][]{{1, 5}, {6, 9}},
                new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5}
        );
    }

    @Test
    public void example2Test() {
        evaluateInsertInterval(
                new int[][]{{1, 2}, {3, 10}, {12, 16}},
                new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8}
        );
    }

    @Test
    public void fullIntervalTest() {
        evaluateInsertInterval(
                new int[][]{{1, 16}},
                new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{2, 13}
        );
    }

    void evaluateInsertInterval(int[][] expected, int[][] intervals, int[] newInterval) {
        assertArrayEquals(expected, insertInterval.insert(intervals, newInterval));
    }
}
