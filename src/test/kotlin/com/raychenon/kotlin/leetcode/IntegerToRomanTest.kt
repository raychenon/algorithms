package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-09-12
 * https://leetcode.com/problems/integer-to-roman
 */
class IntegerToRomanTest {

    @Test
    fun test1() {
        Assert.assertEquals("I", IntegerToRoman.intToRoman(1))
    }

    @Test
    fun test9() {
        Assert.assertEquals("IX", IntegerToRoman.intToRoman(9))
    }

    @Test
    fun test48() {
        Assert.assertEquals("XLVIII", IntegerToRoman.intToRoman(48))
    }

    @Test
    fun test58() {
        Assert.assertEquals("LVIII", IntegerToRoman.intToRoman(58))
    }

    @Test
    fun test1994() {
        Assert.assertEquals("MCMXCIV", IntegerToRoman.intToRoman(1994))
    }

    @Test
    fun test3999() {
        Assert.assertEquals("MMMCMXCIX", IntegerToRoman.intToRoman(3999))
    }
}