package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 4/6/2020
 * Time: 11:45 PM
 */
class InsertIntervalTest {

    @Test
    fun example1Test() {
        evaluateInsertInterval(
            arrayOf(intArrayOf(1, 5), intArrayOf(6, 9)),
            arrayOf(intArrayOf(1, 3), intArrayOf(6, 9)), intArrayOf(2, 5)
        )
    }

    @Test
    fun example2Test() {
        evaluateInsertInterval(
            arrayOf(intArrayOf(1, 2), intArrayOf(3, 10), intArrayOf(12, 16)),
            arrayOf(intArrayOf(1, 2), intArrayOf(3, 5), intArrayOf(6, 7), intArrayOf(8, 10), intArrayOf(12, 16)),
            intArrayOf(4, 8)
        )
    }
    
    @Test
    fun fullIntervalTest() {
        evaluateInsertInterval(
            arrayOf(intArrayOf(1, 16)),
            arrayOf(intArrayOf(1, 2), intArrayOf(3, 5), intArrayOf(6, 7), intArrayOf(8, 10), intArrayOf(12, 16)),
            intArrayOf(2, 13)
        )
    }

    fun evaluateInsertInterval(expected: Array<IntArray>, intervals: Array<IntArray>, newInterval: IntArray) {
        Assert.assertArrayEquals(expected, InsertInterval.insert(intervals, newInterval))
    }

}