package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 19/1/2021
 * Time: 11:18 PM
 * https://leetcode.com/problems/count-sorted-vowel-strings/
 */
public class CountSortedVowelStrings {

    /**
     * dynamic programming Bottom Up with 2D array
     * Time complexity: O(n*k)
     * Space complexity: O(nk)
     *
     * @param n
     * @return
     */
    public int countVowelStringsDPBottomUp(int n) {
        int[][] dp = new int[n + 1][6];
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= 5; k++) {
                dp[i][k] = dp[i][k - 1] + (i > 1 ? dp[i - 1][k] : 1);
            }
        }
        return dp[n][5];
    }

    /**
     * dynamic programming Bottom Up with 1D array
     * Time complexity: O(n*k)
     * Space complexity: O(k)
     *
     * @param n
     * @return
     */
    public int countVowelStringsDPBottomUp1D(int n) {
        int[] dp = new int[]{0, 1, 1, 1, 1, 1};
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= 5; k++) {
                dp[k] += dp[k - 1];
            }
        }
        return dp[5];
    }
}
