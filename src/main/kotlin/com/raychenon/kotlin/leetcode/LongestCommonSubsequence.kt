package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 11/5/2020
 * https://leetcode.com/problems/longest-common-subsequence/
 *
 * Longest Common Subsequence(LCS) Dynamic Programming In O(N) Space
 * https://youtu.be/DuikFLPt8WQ
 */
object LongestCommonSubsequence {

    /**
     * Dynamic programming with 2D array
     *
     * Time complexity : O(M⋅N)
     * Space complexity : O(M⋅N)
     *
     * ex : LCS(javaaid,javaid)
     *
     *         j  a  v  a  i  d
     *     --------------------
     *    | 0  0  0  0  0  0  0
     *  j | 0  1  1  1  1  1  1
     *  a | 0  1  2  2  2  2  2
     *  v | 0  1  2  3  3  3  3
     *  a | 0  1  2  3  4  4  4
     *  a | 0  1  2  3  4  4  4
     *  i | 0  1  2  3  4  5  5
     *  d | 0  1  2  3  4  5  6
     *
     */
    fun longestCommonSubsequenceDP(text1: String, text2: String, displayMatrix: Boolean = false): Int {
        val memo = Array(text1.length + 1) { IntArray(text2.length + 1) }
        val nbCol = text1.length
        val nbRow = text2.length

        for (i in 0..nbCol) {
            for (j in 0..nbRow) {
                if (i == 0 || j == 0) {
                    memo[i][j] = 0
                } else if (text1[i - 1] == text2[j - 1]) {
                    memo[i][j] = memo[i - 1][j - 1] + 1
                } else {
                    memo[i][j] = Math.max(memo[i - 1][j], memo[i][j - 1])
                }
            }
        }

        if (displayMatrix) {
            displayMatrix(memo)
        }

        return memo[nbCol][nbRow]
    }

    private fun displayMatrix(matrix: Array<IntArray>): Unit {
        for (line in matrix) {
            for (e in line) {
                print("${e.toString()}  ")
            }
            print("\n")
        }
    }


    /**
     * Dynamic programming with reverse grid
     * <p>
     * Time complexity : O(M⋅N)
     * Space complexity : O(M⋅N)
     */
    fun longestCommonSubsequenceDPreverse(text1: String, text2: String): Int {

        // make a grid with columns +1 and rows + 1
        val dp = Array(text1.length + 1) { IntArray(text2.length + 1) }
        for (col in text2.length - 1 downTo 0) {
            for (row in text1.length - 1 downTo 0) {
                /**
                 * 2 cases
                 * - The first letter of each string is the same, remove the first letter from each, and add 1.
                 * Add diagonal immediately down and right + 1
                 * - The first letter of each string is different,
                 * 1) remove the first letter off the first word,
                 * 2) remove the first letter off the second word,
                 * grid[row][col] = max(grid[row + 1][col], grid[row][col + 1])
                 */
                // If the corresponding characters for this cell are the same...
                if (text1[row] == text2[col]) {
                    dp[row][col] = 1 + dp[row + 1][col + 1]
                } else {
                    dp[row][col] = Math.max(dp[row + 1][col], dp[row][col + 1])
                }
            }
        }

        // The original problem's answer is in dp_grid[0][0]
        return dp[0][0]
    }
}