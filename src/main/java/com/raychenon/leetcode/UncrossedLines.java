package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 26/5/2020
 * https://leetcode.com/problems/uncrossed-lines/
 */
public class UncrossedLines {

    /**
     * Best explanations: https://www.youtube.com/watch?v=duCx_62nMOA
     * Time complexity: O(len_A * len_B)
     * Space complexity: O(len_A * len_B)
     *
     * @param A
     * @param B
     * @return
     */
    public int maxUncrossedLines(int[] A, int[] B) {

        int lenA = A.length;
        int lenB = B.length;
        int[][] dp = new int[lenA + 1][lenB + 1];

        for (int r = 0; r < lenA; r++) {
            for (int c = 0; c < lenB; c++) {
                if (r == 0 || c == 0) {
                    dp[r][c] = 0;
                } else if (A[r] == B[c]) {
                    dp[r + 1][c + 1] = 1 + dp[r][c];
                } else {
                    dp[r + 1][c + 1] = Math.max(dp[r + 1][c], dp[r][c + 1]);
                }
            }
        }
        return dp[lenA][lenB];
    }

}
