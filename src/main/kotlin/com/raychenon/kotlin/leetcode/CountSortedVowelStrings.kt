package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 21/1/2021
 * https://leetcode.com/problems/count-sorted-vowel-strings/
 */
object CountSortedVowelStrings {

    /**
     * dynamic programming Bottom Up with 2D array
     * Time complexity: O(n*k)
     * Space complexity: O(nk)
     *
     * @param n
     * @ return
     */
    fun countVowelStringsDPBottomUp(n: Int): Int {
        val dp = Array(n + 1) { IntArray(6) }
        for (i in 1..n) {
            for (k in 1..5) {
                dp[i][k] = dp[i][k - 1] + if (i > 1) dp[i - 1][k] else 1
            }
        }
        return dp[n][5]
    }

    /**
     * dynamic programming Bottom Up with 1D array
     * Time complexity: O(n*k)
     * Space complexity: O(k)
     *
     * @param n
     * @return
     */
    fun countVowelStringsDPBottomUp1D(n: Int): Int {
        val dp = intArrayOf(0, 1, 1, 1, 1, 1)
        for (i in 1..n) {
            for (k in 1..5) {
                dp[k] += dp[k - 1]
            }
        }
        return dp[5]
    }
}