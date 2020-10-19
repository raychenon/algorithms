package com.raychenon.kotlin.leetcode.besttimetobuyandsell

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 19/10/2020
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv
 */
class BestTimetoBuyandSellStock4Test {

    @Test
    fun example1Test() {
        val prices = intArrayOf(2, 4, 1)
        assertBestTimetoBuyandSellStock4(2, prices, 2)
    }

    @Test
    fun example2Test() {
        val prices = intArrayOf(3, 2, 6, 5, 0, 3)
        assertBestTimetoBuyandSellStock4(2, prices, 7)
    }

    @Test
    fun noTransationTest() {
        val prices = intArrayOf(3, 2, 6, 5, 0, 3)
        assertBestTimetoBuyandSellStock4(0, prices, 0)
    }

    fun assertBestTimetoBuyandSellStock4(k: Int, prices: IntArray, expectedProfit: Int) {
        TestCase.assertEquals(expectedProfit, BestTimetoBuyandSellStock4.maxProfit(k, prices))
    }
}