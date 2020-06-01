package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 1/6/2020
 * https://leetcode.com/problems/edit-distance/
 */
object EditDistance {

    fun minDistance(word1: String, word2: String): Int {
        val n1 = word1.length
        val n2 = word2.length


        val dp = Array(n1 + 1) { IntArray(n2 + 1) }

        for (i1 in 1 until n1 + 1) dp[i1][0] = i1
        for (i2 in 1 until n2 + 1) dp[0][i2] = i2

        for (i1 in 1 until n1 + 1) {
            for (i2 in 1 until n2 + 1) {
                if (word1[i1 - 1] == word2[i2 - 1]) {
                    dp[i1][i2] = dp[i1 - 1][i2 - 1]
                } else {
                    dp[i1][i2] = 1 + minOf(dp[i1 - 1][i2 - 1], dp[i1 - 1][i2], dp[i1][i2 - 1])
                }
            }
        }

        return dp[n1][n2]
    }
}