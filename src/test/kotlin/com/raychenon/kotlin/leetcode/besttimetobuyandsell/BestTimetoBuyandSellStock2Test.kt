package com.raychenon.kotlin.leetcode.besttimetobuyandsell

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 5/4/2020
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii
 */
class BestTimetoBuyandSellStock2Test {

    @Test
    fun example1Test() {
        val nums = intArrayOf(7, 1, 5, 3, 6, 4)
        assertWithVariousMethods(7, nums)
    }

    @Test
    fun example2Test() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        assertWithVariousMethods(4, nums)
    }

    @Test
    fun example3Test() {
        val nums = intArrayOf(7, 6, 4, 3, 1)
        assertWithVariousMethods(0, nums)
    }

    @Test
    fun example4Test() {
        val nums = intArrayOf(7, 6, 4, 3, 1, 1, 7, 1, 9)
        assertWithVariousMethods(14, nums)
    }

    @Test
    fun exampleEmptyTest() {
        val nums = intArrayOf()
        assertWithVariousMethods(0, nums)
    }

    fun assertWithVariousMethods(expectedDuplicate: Int, array: IntArray) {
        TestCase.assertEquals(
            expectedDuplicate,
            BestTimetoBuyandSellStock2.maxProfit(array)
        )

    }

}