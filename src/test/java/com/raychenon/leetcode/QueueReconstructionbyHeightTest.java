package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * User: raychenon
 * Date: 7/6/2020
 * https://leetcode.com/problems/queue-reconstruction-by-height
 */
public class QueueReconstructionbyHeightTest {

    private static QueueReconstructionbyHeight queueReconstructionbyHeight;

    @BeforeClass
    public static void setUp() {
        queueReconstructionbyHeight = new QueueReconstructionbyHeight();
    }

    @Test
    public void reconstructQueueExample1Test() {
        testQueueReconstructionbyHeight(
                new int[][]{{5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}},
                new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}});
    }

    private void testQueueReconstructionbyHeight(int[][] expected, int[][] people) {
        assertArrayEquals(expected, queueReconstructionbyHeight.reconstructQueue(people));
    }
}
