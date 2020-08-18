package com.raychenon.kotlin.leetcode.besttimetobuyandsell

/**
 * User: raychenon
 * Date: 18/8/2020
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
 */
object BestTimetoBuyandSellStock3 {

    /**
     * https://www.youtube.com/watch?v=0FKn0FSIQYE
     *
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * @param prices
     * @return
     */
    fun maxProfit(prices: IntArray): Int {
        val n = prices.size
        if (n < 2) return 0
        var p1 = prices[0]
        var p2 = prices[n - 1]
        val profit1 = IntArray(n)
        val profit2 = IntArray(n)
        for (i in 1 until n) {
            // -->
            profit1[i] = Math.max(profit1[i - 1], prices[i] - p1)
            p1 = Math.min(prices[i], p1)

            // <--
            val j = n - 1 - i
            profit2[j] = Math.max(profit2[j + 1], p2 - prices[j])
            p2 = Math.max(prices[j], p2)
        }
        var profit = 0
        for (i in 1 until n) {
            profit = Math.max(profit, profit1[i] + profit2[i])
        }
        return profit
    }
}