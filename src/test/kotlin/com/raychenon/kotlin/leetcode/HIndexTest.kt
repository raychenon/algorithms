package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 11/8/2020
 * https://leetcode.com/problems/h-index/
 */
class HIndexTest {

    @Test
    fun example1Test() {
        evaluateHIndex(3, intArrayOf(3, 0, 6, 1, 5))
    }

    @Test
    fun only0Test() {
        evaluateHIndex(0, intArrayOf(0, 0, 0))
    }

    @Test
    fun hIndexEqualLengthTest() {
        evaluateHIndex(6, intArrayOf(12, 7, 8, 9, 10, 11))
    }

    @Test
    fun hIndexValueNotInCitations() {
        evaluateHIndex(5, intArrayOf(12, 7, 8, 9, 10, 3))
    }

    private fun evaluateHIndex(expected: Int, citations: IntArray) {
        TestCase.assertEquals(expected, HIndex.hIndex(citations))
        TestCase.assertEquals(expected, HIndex.hIndexCountingSort(citations))
    }

}