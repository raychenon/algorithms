package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test
import java.util.Arrays

/**
 * User: raychenon
 * Date: 2020-01-30
 * https://leetcode.com/problems/merge-intervals/
 */
class MergeIntervalsTest {

    @Test
    fun example1Test() {
        val input = arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18))
        TestCase.assertTrue(
            Arrays.deepEquals(
                arrayOf(intArrayOf(1, 6), intArrayOf(8, 10), intArrayOf(15, 18)),
                MergeIntervals.merge(input)
            )
        )
    }

    @Test
    fun example2Test() {
        val input = arrayOf(intArrayOf(1, 4), intArrayOf(4, 5))
        TestCase.assertTrue(Arrays.deepEquals(arrayOf(intArrayOf(1, 5)), MergeIntervals.merge(input)))
    }

    @Test
    fun example3Test() {
        val input = arrayOf(intArrayOf(1, 4), intArrayOf(0, 4))
        TestCase.assertTrue(Arrays.deepEquals(arrayOf(intArrayOf(0, 4)), MergeIntervals.merge(input)))
    }

    @Test
    fun example4Test() {
        val input = arrayOf(intArrayOf(1, 4), intArrayOf(0, 1))
        TestCase.assertTrue(Arrays.deepEquals(arrayOf(intArrayOf(0, 4)), MergeIntervals.merge(input)))
    }

    @Test
    fun example5Test() {
        val input = arrayOf(intArrayOf(1, 4), intArrayOf(0, 0))
        val expectedResult = arrayOf(intArrayOf(0, 0), intArrayOf(1, 4))
        TestCase.assertTrue(Arrays.deepEquals(expectedResult, MergeIntervals.merge(input)))
    }

    @Test
    fun emptyArray_test() {
        TestCase.assertTrue(Arrays.deepEquals(emptyArray<IntArray>(), MergeIntervals.merge(emptyArray<IntArray>())))
    }
}