package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 26/4/2020
 * https://leetcode.com/problems/bitwise-and-of-numbers-range/
 */
class BitwiseANDofNumbersRangeTest {

    @Test
    fun and1Test() {
        assertBitwiseANDWithVariousMethods(5, 7, 4)
    }

    @Test
    fun and2Test() {
        assertBitwiseANDWithVariousMethods(0, 1, 0)
    }

    @Test
    fun and3Test() {
        assertBitwiseANDWithVariousMethods(9, 12, 8)
    }

    @Test
    fun ANbigRangeTest() {
        assertBitwiseANDWithVariousMethods(0, 2147483647, 0)
    }

    @Test
    fun ANbigRange2Test() {
        assertBitwiseANDWithVariousMethods(2147483646, 2147483647, 2147483646)
    }

    fun assertBitwiseANDWithVariousMethods(m: Int, n: Int, expected: Int) {
        TestCase.assertEquals(expected, BitwiseANDofNumbersRange.rangeBitwiseAndShift(m, n))
        TestCase.assertEquals(expected, BitwiseANDofNumbersRange.rangeBitwiseAndKernighan(m, n))
    }
}