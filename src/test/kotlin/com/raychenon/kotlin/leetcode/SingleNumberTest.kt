package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 11/4/2020
 * https://leetcode.com/problems/single-number/
 */
class SingleNumberTest {

    @Test
    fun example1Test() {
        Assert.assertEquals(1, SingleNumber.singleNumber(intArrayOf(2, 2, 1)))
    }

    @Test
    fun example2Test() {
        Assert.assertEquals(4, SingleNumber.singleNumber(intArrayOf(4, 1, 2, 1, 2)))
    }

}