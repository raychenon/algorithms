package com.raychenon.leetcode.besttimetobuyandsell;

/**
 * User: raychenon
 * Date: 29/7/2020
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
 */
public class BestTimetoBuyandSellStockWithCooldown {

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param prices
     * @return
     */
    public int maxProfitDPWithStateMachine(int[] prices) {

        int sold = Integer.MIN_VALUE;
        int held = Integer.MIN_VALUE;
        int reset = 0;

        for (int price : prices) {
            int preSold = sold;

            sold = held + price;
            held = Math.max(held, reset - price);
            reset = Math.max(reset, preSold);
        }

        return Math.max(sold, reset);
    }

    public int maxProfitDP(int[] prices) {
        int[] MP = new int[prices.length + 2];

        for (int i = prices.length - 1; i >= 0; i--) {
            int C1 = 0;
            // Case 1). buy and sell the stock
            for (int sell = i + 1; sell < prices.length; sell++) {
                int profit = (prices[sell] - prices[i]) + MP[sell + 2];
                C1 = Math.max(profit, C1);
            }

            // Case 2). do no transaction with the stock p[i]
            int C2 = MP[i + 1];

            // wrap up the two cases
            MP[i] = Math.max(C1, C2);
        }
        return MP[0];
    }
}
