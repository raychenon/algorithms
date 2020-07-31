package com.raychenon.kotlin.leetcode.besttimetobuyandsell

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 31/7/2020
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
 */
class BestTimetoBuyandSellStockWithCooldownTest {

    @Test
    fun example1Test() {
        val nums = intArrayOf(1, 2, 3, 0, 2)
        // (-1+2) + (-0+2) = 3
        evaluteMaxProfit(3, nums)
    }

    @Test
    fun example3Test() {
        val nums = intArrayOf(1, 2, 3, 0, 2, 5, 6)
        // (-1+2) + (-0+6) = 1+6 = 7
        evaluteMaxProfit(7, nums)
    }


    fun evaluteMaxProfit(expected: Int, array: IntArray) {
        TestCase.assertEquals(expected, BestTimetoBuyandSellStockWithCooldown.maxProfitDPWithStateMachine(array))
        TestCase.assertEquals(expected, BestTimetoBuyandSellStockWithCooldown.maxProfitDP(array))
    }
}