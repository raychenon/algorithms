package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 7/6/2020
 * https://leetcode.com/problems/queue-reconstruction-by-height
 */
class QueueReconstructionbyHeightTest {

    @Test
    fun reconstructQueueExample1Test() {
        testQueueReconstructionbyHeight(
            arrayOf(
                intArrayOf(5, 0),
                intArrayOf(7, 0),
                intArrayOf(5, 2),
                intArrayOf(6, 1),
                intArrayOf(4, 4),
                intArrayOf(7, 1)
            ),
            arrayOf(
                intArrayOf(7, 0),
                intArrayOf(4, 4),
                intArrayOf(7, 1),
                intArrayOf(5, 0),
                intArrayOf(6, 1),
                intArrayOf(5, 2)
            )
        )
    }

    private fun testQueueReconstructionbyHeight(expected: Array<IntArray>, people: Array<IntArray>) {
        Assert.assertArrayEquals(expected, QueueReconstructionbyHeight.reconstructQueue(people))
    }
}