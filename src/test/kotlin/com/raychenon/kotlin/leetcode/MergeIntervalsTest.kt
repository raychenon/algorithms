package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 2020-01-30
 * https://leetcode.com/problems/merge-intervals/
 */
class MergeIntervalsTest {
    
    @Test
    fun example1Test() {
        val input = arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18))
        Assert.assertEquals(
            arrayOf(intArrayOf(1, 6), intArrayOf(8, 10), intArrayOf(15, 18)),
            MergeIntervals.merge(input)
        )
    }

    @Test
    fun example2Test() {
        val input = arrayOf(intArrayOf(1, 4), intArrayOf(4, 5))
        Assert.assertEquals(
            arrayOf(intArrayOf(1, 5)),
            MergeIntervals.merge(input)
        )
    }
}