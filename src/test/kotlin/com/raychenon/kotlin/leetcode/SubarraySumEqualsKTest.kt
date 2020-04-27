package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 27/4/2020
 * https://leetcode.com/problems/subarray-sum-equals-k/
 */
class SubarraySumEqualsKTest {

    @Test
    fun expect2Test() {
        evaluateMethods(2, intArrayOf(1, 1, 1), 2)
    }

    @Test
    fun expect12Test() {
        evaluateMethods(12, intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1), 2)
    }

    @Test
    fun negativeNumbersTest() {
        evaluateMethods(2, intArrayOf(1, -2, 3, 1, 2, -3, 1), -1)
    }

    fun evaluateMethods(expected: Int, nums: IntArray, k: Int) {
        TestCase.assertEquals(
            expected, SubarraySumEqualsK.subarraySumBruteForce(nums, k)
        )
        TestCase.assertEquals(
            expected, SubarraySumEqualsK.subarraySumDP(nums, k)
        )
    }
}