package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-08-26
 * https://leetcode.com/problems/reverse-integer
 */
class ReverseIntegerTest {

    @Test
    fun testReversePositiveInteger() {
        Assert.assertEquals(321, ReverseInteger.reverse(123))
    }

    @Test
    fun testReverseNegativeInteger() {
        Assert.assertEquals(-321, ReverseInteger.reverse(-123))
    }

    @Test
    fun testReverseInteger() {
        Assert.assertEquals(21, ReverseInteger.reverse(120))
    }

    @Test
    fun testReverseLargeInteger() {
        Assert.assertEquals(2147483641, ReverseInteger.reverse(1463847412))
    }

    @Test
    fun testReverseLargeNegativeInteger() {
        Assert.assertEquals(-2147483641, ReverseInteger.reverse(-1463847412))
    }
}