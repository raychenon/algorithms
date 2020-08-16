package com.raychenon.leetcode.besttimetobuyandsell;

/**
 * User: raychenon
 * Date: 17/8/2020
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
 */
public class BestTimetoBuyandSellStock3 {

    /**
     * https://www.youtube.com/watch?v=0FKn0FSIQYE
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n < 2) return 0;

        int p1 = prices[0];
        int p2 = prices[n - 1];
        int[] profit1 = new int[n];
        int[] profit2 = new int[n];

        for (int i = 1; i < n; i++) {
            // -->
            profit1[i] = Math.max(profit1[i - 1], prices[i] - p1);
            p1 = Math.min(prices[i], p1);

            // <--
            int j = n - 1 - i;
            profit2[j] = Math.max(profit2[j + 1], prices[j] - p2);
            p2 = Math.max(prices[j], p2);
        }

        int profit = 0 ;
        for (int i = 1; i < n; i++) {
            profit = Math.max(profit, profit1[i] + profit2[i]);
        }
        
        return profit;
    }
}
