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