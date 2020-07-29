package com.raychenon.leetcode.besttimetobuyandsell;

/**
 * User: raychenon
 * Date: 29/7/2020
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
 */
public class BestTimetoBuyandSellStockWithCooldown {

    public int maxProfit(int[] prices) {

        int profit = 0;
        int i = 0;
        while (i < prices.length) {
            if (prices[i + 1] > prices[i]) {
                profit += prices[i + 1] - prices[i];
                i++;
            }
            i++;
        }
        return profit;
    }
}
