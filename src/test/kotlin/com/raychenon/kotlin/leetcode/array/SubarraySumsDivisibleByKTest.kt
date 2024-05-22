package com.raychenon.kotlin.leetcode.array

import junit.framework.TestCase
import org.junit.Test

class SubarraySumsDivisibleByKTest {


    @Test
    fun assertTest1() {
        val array = intArrayOf(4, 5, 0, -2, -3, 1)
        TestCase.assertEquals(7, SubarraySumsDivisibleByK.subarraysDivByK(array, 5))
    }

    @Test
    fun assertWithOneElement() {
        val array = intArrayOf(5)
        TestCase.assertEquals(0, SubarraySumsDivisibleByK.subarraysDivByK(array, 9))
    }

    @Test
    fun assertWithOneElementRightDivider() {
        val array = intArrayOf(5)
        TestCase.assertEquals(1, SubarraySumsDivisibleByK.subarraysDivByK(array, 5))
    }

}