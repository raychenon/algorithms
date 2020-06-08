package com.raychenon.kotlin.leetcode.coin

/**
 * User: raychenon
 * Date: 8/6/2020
 * https://leetcode.com/problems/coin-change-2/
 */
object CoinChange2 {

    /**
     * Best explanation https://www.youtube.com/watch?v=jaNZ83Q3QGc
     * <p>
     * Time complexity: O(nb coins * amount)
     * Space complexity: O(amount)
     */
    fun change(amount: Int, coins: IntArray): Int {
        var dp = IntArray(amount + 1)
        dp[0] = 1 // always 1 combination to make the amount to 0

        for (coin in coins) {
            for (i in 1 until coins.size) {
                if (i >= coin) {
                    dp[i] += dp[i - coin]
                }
            }
        }
        return dp[amount]
    }

}