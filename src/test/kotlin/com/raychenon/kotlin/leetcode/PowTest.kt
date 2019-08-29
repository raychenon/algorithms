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
        assertPowerMethods(1024.0, 2.0, 10, "test example 1")
    }

    @Test
    fun testPowExample2() {
        assertPowerMethods(9.261, 2.10, 3, "test example 2")
    }

    @Test
    fun testPowerNegativeExponent() {
        assertPowerMethods(0.25, 2.0, -2, "test negative exponent")
    }

    @Test
    fun testPowerofZero() {
        assertPowerMethods(1.0, 0.44528, 0, "test power of zero")
    }

    @Test
    fun testPowerofBigExponent() {
        assertPowerMethods(1.0, 1.0, 2147483647, "test power of big exponent")
    }

    @Test
    fun testPowerofBigNegativeExponent() {
        assertPowerMethods(0.0, 2.0, -2147483647, "test power of big negative exponent")
    }

    private val delta = 0.001

    private fun assertPowerMethods(expected: Double, x: Double, n: Int, msg: String = "") {
        Assert.assertEquals(msg, expected, Pow.myPow(x, n), delta)
        Assert.assertEquals(msg, expected, Pow.myPowRecursive(x, n), delta)
    }
}