package com.raychenon.leetcode.besttimetobuyandsell;

/**
 * User: raychenon
 * Date: 5/4/2020
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class BestTimetoBuyandSellStock2 {

    /**
     * same with
     * @see #maxProfitPeakValleyApproach
     * except that the cumulative difference is summed
     *                                  x
     *                              x---|
     *              x           x---|
     *          x---|   x   x---|
     *      x---|
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] - prices[i] > 0) {
                profit += prices[i + 1] - prices[i];
            }
        }
        return profit;
    }

    /**
     * Peak Valley Approach
     *  Sum the differences with low and high
     * <p>
     *          high (peak) x
     *                      |   x                x
     *                      |       x       x    |
     *                      |           x--------|
     *     low (valley) x --|
     * <p>
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param prices
     * @return
     */
    public int maxProfitPeakValleyApproach(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int i = 0;
        int low = prices[0];
        int high = prices[0];
        int maxprofit = 0;
        while (i < prices.length - 1) {
            while (i < (prices.length - 1) && prices[i] >= prices[i + 1]) {
                i++;
            }
            low = prices[i];
            while (i < (prices.length - 1) && prices[i] <= prices[i + 1]) {
                i++;
            }
            high = prices[i];
            maxprofit += high - low;
        }
        return maxprofit;
    }
}
