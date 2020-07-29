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
        int low = prices[0];
        int high = prices[0];
        int length = prices.length - 1;
        while (i < length) {
            while (i < length && prices[i] >= prices[i + 1]) {
                i++;
            }
            low = prices[i];

            while (i < length && prices[i] <= prices[i + 1]) {
                i++;
            }
            high = prices[i];

            profit += high - low;

            i++; // cooldown
        }
        return profit - 1;
    }
}
