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
        val nums = intArrayOf(2, 3, -2, 4)
        assertEquals(6, MaxProductSubarray.maxProductBrute1(nums))
    }

    @Test
    fun example2Test() {
        val nums = intArrayOf(2, 3, -2, 4)
        assertEquals(6, MaxProductSubarray.maxProductBrute1(nums))
    }


    @Test
    fun productSize2Test() {
        val nums = intArrayOf(0, 2)
        assertEquals(2, MaxProductSubarray.maxProductBrute1(nums))
    }

    @Test
    fun productSize3Test() {
        val nums = intArrayOf(-2, 0, -1)
        assertEquals(0, MaxProductSubarray.maxProductBrute1(nums))
    }

    @Test
    fun emptyArray3Test() {
        val nums = intArrayOf()
        assertEquals(0, MaxProductSubarray.maxProductBrute1(nums))
    }
}