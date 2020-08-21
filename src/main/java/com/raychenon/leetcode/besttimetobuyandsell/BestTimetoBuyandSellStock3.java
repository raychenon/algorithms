package com.raychenon.leetcode.besttimetobuyandsell;

/**
 * User: raychenon
 * Date: 17/8/2020
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
 */
public class BestTimetoBuyandSellStock3 {

    /**
     * https://www.youtube.com/watch?v=0FKn0FSIQYE
     * <p>
     * Time complexity: O(n)
     * Space complexity: O(n)
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
            profit2[j] = Math.max(profit2[j + 1], p2 - prices[j]);
            p2 = Math.max(prices[j], p2);
        }

        int profit = 0;
        for (int i = 1; i < n; i++) {
            profit = Math.max(profit, profit1[i] + profit2[i]);
        }

        return profit;
    }

    /**
     * Leetcode solution similar to above
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * @param prices
     * @return
     */
    public int maxProfitBidirectionalDP(int[] prices) {
        int length = prices.length;
        if (length <= 1) return 0;

        int leftMin = prices[0];
        int rightMax = prices[length - 1];
        int[] leftProfits = new int[length];
        int[] rightProfits = new int[length + 1];

        for (int leftIndex = 1; leftIndex < length; ++leftIndex) {
            leftProfits[leftIndex] = Math.max(leftProfits[leftIndex - 1], prices[leftIndex] - leftMin);
            leftMin = Math.min(leftMin, prices[leftIndex]);

            int rightIndex = length - 1 - leftIndex;
            rightProfits[rightIndex] = Math.max(rightProfits[rightIndex + 1], rightMax - prices[rightIndex]);
            rightMax = Math.max(rightMax, prices[rightIndex]);
        }

        int maxProfit = 0;
        for (int i = 0; i < length; ++i) {
            maxProfit = Math.max(maxProfit, leftProfits[i] + rightProfits[i + 1]);
        }
        return maxProfit;
    }

    /**
     * Super intuitive solution
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param prices
     * @return
     */
    public int maxProfitOnePass(int[] prices) {
        int t1Cost = Integer.MAX_VALUE;
        int t2Cost = Integer.MAX_VALUE;

        int t1Profit = 0, t2Profit = 0;

        for (int price : prices) {
            // 1st transaction: the maximum profit if only one transaction is allowed
            t1Cost = Math.min(t1Cost, price);
            t1Profit = Math.max(t1Profit, price - t1Cost);

            // 2nd transaction: reinvest the gained profit
            t2Cost = Math.min(t2Cost, price - t1Profit);
            t2Profit = Math.max(t2Profit, price - t2Cost);
        }

        return t2Profit;
    }
}
