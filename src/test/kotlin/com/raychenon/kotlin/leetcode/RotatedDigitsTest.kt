package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-11-24
 * https://leetcode.com/problems/rotated-digits/
 */
class RotatedDigitsTest {

    @Test
    fun test10() {
        evaluateRotatedDigits(4, 10)
    }

    @Test
    fun test20() {
        evaluateRotatedDigits(9, 20)
    }

    @Test
    fun test1000() {
        evaluateRotatedDigits(316, 1000)
    }

    fun evaluateRotatedDigits(expected: Int, N: Int) {
        Assert.assertEquals(expected, RotatedDigits.rotatedDigits(N))
    }
}