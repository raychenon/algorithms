package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-09-13
 * https://leetcode.com/problems/roman-to-integer/
 */
class RomanToIntegerTest {

    @Test
    fun testIII() {
        Assert.assertEquals(3, RomanToInteger.romanToInt("III"))
    }

    @Test
    fun testIV() {
        Assert.assertEquals(4, RomanToInteger.romanToInt("IV"))
    }

    @Test
    fun testIX() {
        Assert.assertEquals(9, RomanToInteger.romanToInt("IX"))
    }

    @Test
    fun testLVIII() {
        Assert.assertEquals(58, RomanToInteger.romanToInt("LVIII"))
    }

    @Test
    fun testMCMXCIV() {
        Assert.assertEquals(1994, RomanToInteger.romanToInt("MCMXCIV"))
    }
}