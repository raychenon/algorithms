package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 23/5/2020
 * https://leetcode.com/problems/maximal-square/
 */
object MaximalSquare {

    /**
     * Dynamic programming with 1D array storage
     * Remember this formula for matrix
     * dp(i) = min(dp(i−1),dp(i),prev)+1.
     * ****   prev | dp[i]
     * --------------------
     * **  dp[i-1] | next dp[i]
     *
     * <p>
     * time complexity: O(row * col)
     * space complexity: O(col)
     */
    fun maximalSquareDP1Darray(matrix: Array<CharArray>): Int {
        val rows = matrix.size
        val cols = if (rows > 0) matrix[0].size else 0
        var maxsqlen = 0
        var prev = 0
        val dp = IntArray(cols + 1)
        for (r in 1 until rows + 1) {
            for (c in 1 until cols + 1) {
                val temp = dp[c]
                if (matrix[r - 1][c - 1] == '1') {
                    dp[c] = minOf(prev, dp[c], dp[c - 1]) + 1
                    maxsqlen = maxOf(dp[c], maxsqlen)
                } else {
                    dp[c] = 0
                }
                prev = temp
            }
        }
        return maxsqlen * maxsqlen
    }

    /**
     * Dynamic programming  with 2D array storage
     * Remember this formula for matrix
     * dp(i,j) = min(dp(i−1,j),dp(i−1,j−1),dp(i,j−1))+1.
     * * dp[i-1][j-1] | dp[i-1][j]
     * ---------------------------
     * *** dp[i][j-1] | dp[i][j]
     * <p>
     * time complexity: O(row * col)
     * space complexity: O(row * col)
     */
    fun maximalSquareDP2Darray(matrix: Array<CharArray>): Int {

        val rows = matrix.size
        val cols = if (rows > 0) matrix[0].size else 0
        var maxsqlen = 0
        val dp = Array(rows + 1) { IntArray(cols + 1) }

        for (r in 1 until rows + 1) {
            for (c in 1 until cols + 1) {
                if (matrix[r - 1][c - 1] == '1') {
                    dp[r][c] = minOf(dp[r - 1][c - 1], dp[r - 1][c], dp[r][c - 1]) + 1
                    maxsqlen = maxOf(dp[r][c], maxsqlen)
                }
            }
        }

        return maxsqlen * maxsqlen
    }
}