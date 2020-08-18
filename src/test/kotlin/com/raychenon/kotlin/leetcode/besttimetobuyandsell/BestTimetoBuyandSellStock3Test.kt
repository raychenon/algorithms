package com.raychenon.kotlin.leetcode.besttimetobuyandsell

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 18/8/2020
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
 */
class BestTimetoBuyandSellStock3Test {


    @Test
    fun example1Test() {
        val prices = intArrayOf(3, 3, 5, 0, 0, 3, 1, 4)
        assertBestTimetoBuyandSellStock3(6, prices)
    }

    @Test
    fun example2Test() {
        val prices = intArrayOf(1, 2, 3, 4, 5)
        assertBestTimetoBuyandSellStock3(4, prices)
    }

    @Test
    fun example3Test() {
        val prices = intArrayOf(7, 6, 4, 3, 1)
        assertBestTimetoBuyandSellStock3(0, prices)
    }

    fun assertBestTimetoBuyandSellStock3(expected: Int, prices: IntArray) {
        TestCase.assertEquals(
            expected,
            BestTimetoBuyandSellStock3.maxProfit(prices)
        )
    }
}