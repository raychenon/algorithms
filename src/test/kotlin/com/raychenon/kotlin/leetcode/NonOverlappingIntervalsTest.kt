package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 2/9/2020
 * https://leetcode.com/problems/non-overlapping-intervals/
 */
class NonOverlappingIntervalsTest {

    @Test
    fun example1Test() {
        val input = arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4), intArrayOf(1, 3))
        assertNonOverlappingIntervals(1, input)
    }

    @Test
    fun example2Test() {
        val input = arrayOf(intArrayOf(1, 2), intArrayOf(1, 2), intArrayOf(1, 2))
        assertNonOverlappingIntervals(2, input)
    }

    @Test
    fun example3Test() {
        val input = arrayOf(intArrayOf(1, 2), intArrayOf(2, 3))
        assertNonOverlappingIntervals(0, input)
    }

    @Test
    fun example4Test() {
        val array = arrayOf(intArrayOf(1, 100), intArrayOf(11, 22), intArrayOf(1, 11), intArrayOf(2, 12))
        assertNonOverlappingIntervals(2, array)
    }

    private fun assertNonOverlappingIntervals(expected: Int, arr: Array<IntArray>) {
        TestCase.assertEquals(expected, NonOverlappingIntervals.eraseOverlapIntervals(arr))
    }

}