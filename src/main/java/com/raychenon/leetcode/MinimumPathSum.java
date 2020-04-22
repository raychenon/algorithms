package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 21/4/2020
 * https://leetcode.com/problems/minimum-path-sum/
 * <p>
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.
 * Note: You can only move either down or right at any point in time.
 */
public class MinimumPathSum {

    /**
     * Time complexity: O(2^(m+n))
     * Space complexity: O(m+n)
     *
     * @param grid
     * @return
     */
    public int minPathSumBruteForce(int[][] grid) {
        return minPathSumBruteForce(grid, 0, 0);
    }

    private int minPathSumBruteForce(int[][] grid, int i, int j) {
        if (i == grid.length || j == grid[0].length) return Integer.MAX_VALUE;
        // reach bottom right
        if (i == grid.length - 1 && j == grid[0].length - 1) return grid[i][j];

        // move from top left to bottom right
        return grid[i][j] + Math.min(minPathSumBruteForce(grid, i + 1, j), minPathSumBruteForce(grid, i, j + 1));
    }


    public int minPathSumDP(int[][] grid) {
        int nbRows = grid.length;
        int nbCols = grid[0].length;
        int[][] dp = new int[nbRows][nbCols];

        for (int i = 0; i < nbRows; i++) {
            for (int j = 0; j < nbCols; j++) {
                dp[i][j] = grid[i][j];
                if (i > 0 && j > 0) {
                    dp[i][j] += Math.min(dp[i - 1][j], dp[i][j - 1]);
                } else if (i > 0) {
                    dp[i][j] += dp[i - 1][j];
                } else if (j > 0) {
                    dp[i][j] += dp[i][j - 1];
                }
            }
        }

        return dp[nbRows - 1][nbCols - 1];
    }

}
