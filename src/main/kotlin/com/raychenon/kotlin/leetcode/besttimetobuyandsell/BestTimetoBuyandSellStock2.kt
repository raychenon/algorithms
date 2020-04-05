package com.raychenon.kotlin.leetcode.besttimetobuyandsell

/**
 * User: raychenon
 * Date: 5/4/2020
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
object BestTimetoBuyandSellStock2 {

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
    fun maxProfit(prices: IntArray): Int {
        var profit = 0
        for (i in 0 until (prices.size - 1)) {
            if (prices[i + 1] - prices[i] > 0) {
                profit += prices[i + 1] - prices[i]
            }
        }
        return profit
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
    fun maxProfitPeakValleyApproach(prices: IntArray): Int {
        if (prices.isEmpty()) {
            return 0
        }

        var profit = 0
        var i = 0
        var low = prices.get(0)
        var high = prices.get(0)

        while (i < prices.size - 1) {

            while (i < prices.size - 1 && prices[i] >= prices[i + 1]) {
                i++
            }
            low = prices.get(i)

            while (i < prices.size - 1 && prices[i] <= prices[i + 1]) {
                i++
            }
            high = prices.get(i)
            profit += high - low
        }
        return profit
    }
}