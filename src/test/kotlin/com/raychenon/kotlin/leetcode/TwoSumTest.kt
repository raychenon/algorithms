package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 14/4/2020
 * https://leetcode.com/problems/two-sum/
 */
class TwoSumTest {

    @Test
    fun example1Test() {
        Assert.assertArrayEquals(
            intArrayOf(0, 1),
            TwoSum.twoSum(intArrayOf(2, 7, 11, 15), 9)
        )
    }

    @Test
    fun example2Test() {
        Assert.assertArrayEquals(
            intArrayOf(2, 4),
            TwoSum.twoSum(intArrayOf(1, 5, 2, 3, 7, 11, 15), 9)
        )
    }

    @Test
    fun twoSumNotFoundTest() {
        Assert.assertArrayEquals(
            intArrayOf(),
            TwoSum.twoSum(intArrayOf(2, 7, 11, 15), 0)
        )
    }

}