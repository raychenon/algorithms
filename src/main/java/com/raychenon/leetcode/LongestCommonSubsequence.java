package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 8/5/2020
 * https://leetcode.com/problems/longest-common-subsequence/
 * <p>
 * Given two strings text1 and text2, return the length of their longest common subsequence.
 * A subsequence of a string is a new string generated from the original string with some characters(can be none)
 * deleted without changing the relative order of the remaining characters. (eg, "ace" is a subsequence of "abcde"
 * while "aec" is not). A common subsequence of two strings is a subsequence that is common to both strings.
 */
public class LongestCommonSubsequence {

    public int longestCommonSubsequenceDP(String text1, String text2) {

        int l1 = text1.length();
        int l2 = text2.length();
        int[][] dp = new int[l1 + 1][l2 + 1];

        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {
                dp[i + 1][j + 1] = text1.charAt(i) == text2.charAt(j) ? dp[i][j] + 1 : Math.max(dp[i][j + 1], dp[i + 1][j]);
            }
        }

        return dp[l1][l2];
    }


    private final static int INIT_VALUE = -1;

    /**
     * Memoization and recursive
     * Time complexity : O(M⋅N)
     * Space complexity : O(M⋅N)
     *
     * @param text1
     * @param text2
     * @return
     */
    public int longestCommonSubsequenceRecursive(String text1, String text2) {
        int[][] memo = new int[text1.length() + 1][text2.length() + 1];

        // init 2D array to INIT_VALUE1 different than 0.
        // Because 0 can be a value for LongestCommonSubsequence (LCS)
        for (int i = 0; i < text1.length(); i++) {
            for (int j = 0; j < text2.length(); j++) {
                memo[i][j] = INIT_VALUE;
            }
        }

        return memoSolve(memo, text1, text2, 0, 0);
    }

    private int memoSolve(int[][] memo, String text1, String text2, int p1, int p2) {
        if (memo[p1][p2] != INIT_VALUE) return memo[p1][p2];  // already filled

        int answer = 0;
        if (text1.charAt(p1) == text2.charAt(p2)) {
            answer = 1 + memoSolve(memo, text1, text2, p1 + 1, p2 + 1);
        } else {
            answer = Math.max(memoSolve(memo, text1, text2, p1, p2 + 1),
                    memoSolve(memo, text1, text2, p1 + 1, p2));
        }

        memo[p1][p2] = answer;
        return answer;
    }
}
