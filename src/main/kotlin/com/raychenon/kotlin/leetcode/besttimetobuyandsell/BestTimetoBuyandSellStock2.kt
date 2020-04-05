package com.raychenon.kotlin.leetcode.besttimetobuyandsell

/**
 * User: raychenon
 * Date: 5/4/2020
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
object BestTimetoBuyandSellStock2 {

    fun maxProfit(prices: IntArray): Int {
        var profit = 0
        for(i in 0 until (prices.size-1)){
            if(prices[i+1] - prices[i] > 0){
                profit += prices[i+1] - prices[i]
            }
        }
        return profit
    }
}