package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-08-19
 * https://leetcode.com/problems/product-of-array-except-self
 */
class ProductofArrayExceptSelfTest {
    
    @Test
    fun testProductArray() {
        val input = intArrayOf(1, 2, 3, 4)
        val output = intArrayOf(24, 12, 8, 6)
        Assert.assertArrayEquals(output, ProductofArrayExceptSelf.productExceptSelf(input))
    }

    @Test
    fun testProductEmptyArray() {
        val input = intArrayOf()
        val output = intArrayOf()
        Assert.assertArrayEquals(output, ProductofArrayExceptSelf.productExceptSelf(input))
    }

    @Test
    fun testProductArrayContainsZero() {
        val input = intArrayOf(1,0)
        val output = intArrayOf(0,1)
        Assert.assertArrayEquals(output, ProductofArrayExceptSelf.productExceptSelf(input))
    }
}