package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 21/4/2020
 * https://leetcode.com/problems/minimum-path-sum/
 */
object MinimumPathSum {

    /**
     * Time complexity: O(W * H) , width * height of matrix
     * Space complexity: O(W * H)
     */
    fun minPathSum(grid: Array<IntArray>): Int {
        val W = grid.size
        val H = grid[0].size
        val dp = Array(W) { IntArray(H) }

        for (i in 0 until W) {
            for (j in 0 until H) {
                dp[i][j] = grid[i][j]
                if (i > 0 && j > 0) {
                    dp[i][j] += Math.min(dp[i - 1][j], dp[i][j - 1])
                } else if (i > 0) {
                    dp[i][j] += dp[i - 1][j]
                } else if (j > 0) {
                    dp[i][j] += dp[i][j - 1]
                }
            }
        }
        return dp[W - 1][H - 1]
    }

}