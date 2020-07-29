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
}
