package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 30/6/2020
 * https://leetcode.com/problems/unique-paths/
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * How many possible unique paths are there?
 */
object UniquePaths {

    /**
     * Since the movement is only either right or bottom
     * Recurrence relation:
     * uniquePaths(m, n) = uniquePaths(m - 1, n) + uniquePaths(m, n - 1).
     * <p>
     * Time complexity: O(m*n)
     * Space complexity: O(m*n)
     */
    fun uniquePathsDP(m: Int, n: Int): Int {
        val dp = Array(m) { IntArray(n) }

        for (r in 0 until m) {
            dp[r][0] = 1
        }
        for (c in 0 until n) {
            dp[0][c] = 1
        }

        for (r in 1 until m) {
            for (c in 1 until n) {
                dp[r][c] = dp[r - 1][c] + dp[r][c - 1]
            }
        }

        return dp[m - 1][n - 1]
    }

    /**
     * Recurrence relation:
     * uniquePaths(m, n) = uniquePaths(m - 1, n) + uniquePaths(m, n - 1).
     * tailrec avoids the stack overflow, it doesn't memoize intermediary results
     * Note: tailrec replaces the recursion by an iteration, but instructs the compiler to store the accumulator of the result in the stack
     */
    tailrec fun uniquePathsRecursive(m: Int, n: Int): Int {
        return if (m == 1 || n == 1) 1 else uniquePathsRecursive(m - 1, n) + uniquePathsRecursive(m, n - 1)
    }
}