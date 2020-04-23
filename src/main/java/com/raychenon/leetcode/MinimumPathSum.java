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


    /**
     * Find the optimal path from top left to bottom right
     * <p>
     * Time complexity: O(m * n)
     * Space complexity: O(m * n)
     *
     * @param grid
     * @return
     */
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

    /**
     * Find the optimal path from arrival (bottom right) to start point(top left)
     * <p>
     * Time complexity: O(m * n)
     * Space complexity: O(1)
     *
     * @param grid
     * @return
     */
    public int minPathSumDPWithoutExtraSpace(int[][] grid) {
        int nbRows = grid.length - 1;
        int nbCols = grid[0].length - 1;

        for (int i = nbRows; i >= 0; i--) {
            for (int j = nbCols; j >= 0; j--) {
                // cannot just += to current values because it is reused
                //        | x1 |
                //     x2 | xnn|
                //
                // where  x1 = x1 + xnn ,  x2 = x2 + xnn
                if (i == nbRows && j != nbCols)
                    grid[i][j] = grid[i][j] + grid[i][j + 1];
                else if (j == nbCols && i != nbRows)
                    grid[i][j] = grid[i][j] + grid[i + 1][j];
                else if (j != nbCols && i != nbRows)
                    grid[i][j] = grid[i][j] + Math.min(grid[i + 1][j], grid[i][j + 1]);
            }
        }
        return grid[0][0];
    }

}
