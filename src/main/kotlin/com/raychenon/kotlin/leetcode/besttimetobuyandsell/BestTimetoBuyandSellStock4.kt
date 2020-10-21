package com.raychenon.kotlin.leetcode.besttimetobuyandsell

/**
 * User: raychenon
 * Date: 19/10/2020
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv
 */
object BestTimetoBuyandSellStock4 {

    fun maxProfit(k: Int, prices: IntArray): Int {
        val n = prices.size
        if (k > n / 2) {
            var res = 0
            for (i in 1 until n) {
                res += Math.max(0, prices[i] - prices[i - 1])
            }
            return res
        }
        val dp = Array(k + 1) { IntArray(n) }
        for (i in 1..k) {
            var profit = 0 - prices[0]
            for (j in 1 until n) {
                dp[i][j] = Math.max(dp[i][j - 1], profit + prices[j])
                profit = Math.max(profit, dp[i - 1][j - 1] - prices[j])
            }
        }
        return dp[k][n - 1]
    }
}