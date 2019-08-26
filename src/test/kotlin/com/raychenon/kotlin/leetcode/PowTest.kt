package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-08-26
 * https://leetcode.com/problems/powx-n/
 */
class PowTest {

    @Test
    fun testPowExample1() {
        Assert.assertEquals("test example 1", 1024.0, Pow.myPow(2.0, 10), 0.001)
    }

    @Test
    fun testPowExample2() {
        Assert.assertEquals("test example 2", 9.261, Pow.myPow(2.10, 3), 0.001)
    }

    @Test
    fun testPowerNegativeExponent() {
        Assert.assertEquals("test negative exponent", 0.25, Pow.myPow(2.0, -2), 0.001)
    }
}