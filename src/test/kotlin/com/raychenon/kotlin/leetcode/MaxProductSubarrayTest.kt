package com.raychenon.kotlin.leetcode

import junit.framework.Assert.assertEquals
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-11-11
 * https://leetcode.com/problems/maximum-product-subarray
 */
class MaxProductSubarrayTest {

    @Test
    fun example1Test() {
        val nums = floatArrayOf(2f, 3f, -2f, 4f)
        assertMaxProduct(6f, nums)
    }

    @Test
    fun example2Test() {
        val nums = floatArrayOf(2f, 3f, 3f, -2f, 4f)
        assertMaxProduct(18f, nums)
    }

    @Test
    fun productSize2Test() {
        val nums = floatArrayOf(0f, 2f)
        assertMaxProduct(2f, nums)
    }

    @Test
    fun productSize3Test() {
        val nums = floatArrayOf(-2f, 0.1f, -1f)
        assertMaxProduct(0.2f, nums)
    }

    @Test
    fun onlyPositiveFloatTest() {
        val nums = floatArrayOf(0.1f, 0.9f, 0.5f)
        assertMaxProduct(0.9f, nums)
    }

    @Test
    fun intNFloatTest() {
        val nums = floatArrayOf(-50f, -0.1f, 0.9f, -0.8f, 0.5f)
        assertMaxProduct(5f, nums)
    }

    @Test
    fun emptyArrayTest() {
        val nums = floatArrayOf()
        assertMaxProduct(0f, nums)
    }

    fun assertMaxProduct(expected: Float, nums: FloatArray) {
        assertEquals(expected, MaxProductSubarray.maxProduct(nums))
        assertEquals(expected, MaxProductSubarray.maxProductBrute1(nums))
        assertEquals(expected, MaxProductSubarray.maxProductBrute2(nums))
        //assertEquals(expected, MaxProductSubarray.maxProductOptimal(nums))
    }
}