package com.raychenon.leetcode.coin;

/**
 * User: raychenon
 * Date: 8/6/2020
 * https://leetcode.com/problems/coin-change-2/
 */
public class CoinChange2 {

    /**
     * best explanation https://www.youtube.com/watch?v=jaNZ83Q3QGc
     * <p>
     * Time complexity: O(nb coins * amount)
     * Space complexity: O(amount)
     *
     * @param amount
     * @param coins
     * @return
     */
    public int change(int amount, int[] coins) {
        int[] combinations = new int[amount + 1];

        combinations[0] = 1;
        for (int coin : coins) {
            for (int i = 1; i < combinations.length; i++) {
                if (i >= coin) {
                    combinations[i] += combinations[i - coin];
                }
            }

        }

        return combinations[amount];
    }
}
