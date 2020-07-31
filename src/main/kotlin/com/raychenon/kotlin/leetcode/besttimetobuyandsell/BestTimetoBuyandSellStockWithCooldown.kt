package com.raychenon.kotlin.leetcode.besttimetobuyandsell

/**
 * User: raychenon
 * Date: 31/7/2020
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
 */
object BestTimetoBuyandSellStockWithCooldown {

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param prices
     * @return
     */
    fun maxProfitDPWithStateMachine(prices: IntArray): Int {
        var sold = Int.MIN_VALUE
        var held = Int.MIN_VALUE
        var reset = 0
        for (price in prices) {
            val preSold = sold
            sold = held + price
            held = Math.max(held, reset - price)
            reset = Math.max(reset, preSold)
        }
        return Math.max(sold, reset)
    }

    fun maxProfitDP(prices: IntArray): Int {
        val MP = IntArray(prices.size + 2)
        for (i in prices.indices.reversed()) {
            var C1 = 0
            // Case 1). buy and sell the stock
            for (sell in i + 1 until prices.size) {
                val profit = prices[sell] - prices[i] + MP[sell + 2]
                C1 = Math.max(profit, C1)
            }

            // Case 2). do no transaction with the stock p[i]
            val C2 = MP[i + 1]

            // wrap up the two cases
            MP[i] = Math.max(C1, C2)
        }
        return MP[0]
    }
}