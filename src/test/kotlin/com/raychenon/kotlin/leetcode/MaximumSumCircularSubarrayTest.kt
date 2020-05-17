package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 16/5/2020
 * https://leetcode.com/problems/maximum-sum-circular-subarray/
 */
class MaximumSumCircularSubarrayTest {

    @Test
    fun example1Test() {
        assertMaximumSumCircularSubarray(intArrayOf(1, -2, 3, -2), 3)
    }

    @Test
    fun example2Test() {
        // 5 + 5 = 10
        assertMaximumSumCircularSubarray(intArrayOf(5, -3, 5), 10)
    }

    @Test
    fun example3Test() {
        // |3, -1, 2|, -1
        //  == 4
        assertMaximumSumCircularSubarray(intArrayOf(3, -1, 2, -1), 4)
    }

    @Test
    fun example4Test() {
        // |3|, -2, 2, -3
        assertMaximumSumCircularSubarray(intArrayOf(3, -2, 2, -3), 3)
    }

    @Test
    fun example5Test() {
        // -2, -3, |-1|
        assertMaximumSumCircularSubarray(intArrayOf(-2, -3, -1), -1)
    }

    private fun assertMaximumSumCircularSubarray(A: IntArray, expected: Int) {
        TestCase.assertEquals(
            expected,
            MaximumSumCircularSubarray.maxSubarraySumCircular(A)
        )
        TestCase.assertEquals(
            expected,
            MaximumSumCircularSubarray.maxSubarraySumCircular1stSubmission(A)
        )
    }
}