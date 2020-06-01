package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 1/6/2020
 * https://leetcode.com/problems/edit-distance
 */
public class EditDistance {


    /**
     * Levenshtein distance
     * Code rewritten 2 times after watching explanations without code
     * Intuitive dynamic programming https://www.youtube.com/watch?v=MiqoA-yF-0M
     * <p>
     * Time Complexity: O(len_word1 * len_word2)
     * Space Complexity: O(len_word1 * len_word2)
     *
     * @param word1
     * @param word2
     * @return
     */
    public int minDistance(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        int[][] dp = new int[n1 + 1][n2 + 1];

        for (int i = 0; i <= n1; i++) {
            dp[i][0] = i;
        }

        for (int i = 0; i <= n2; i++) {
            dp[0][i] = i;
        }

        for (int r = 1; r <= n1; r++) {
            for (int c = 1; c <= n2; c++) {
                int replace = dp[r - 1][c - 1];
                int delete = dp[r][c - 1];
                int insert = dp[r - 1][c];
                if (word1.charAt(r - 1) == word2.charAt(c - 1)) {
                    dp[r][c] = replace;
                } else {
                    dp[r][c] = 1 + Math.min(delete, Math.min(insert, replace));
                }
            }
        }

        return dp[n1][n2];
    }
}
