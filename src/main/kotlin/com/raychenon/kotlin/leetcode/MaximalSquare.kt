package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 23/5/2020
 * https://leetcode.com/problems/maximal-square/
 */
object MaximalSquare {

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
        val cols = matrix[0].size
        var maxLength = 0
        val dp = Array(rows + 1) { IntArray(cols + 1) }

        for (r in 1..rows) {
            for (c in 1..cols) {
                if (matrix[r - 1][c - 1] == '1') {
                    dp[r][c] = minOf(dp[r - 1][c - 1], dp[r - 1][c], dp[r][c - 1]) + 1
                }
                maxLength = maxOf(dp[r][c], maxLength)
            }
        }

        return maxLength * maxLength
    }
}