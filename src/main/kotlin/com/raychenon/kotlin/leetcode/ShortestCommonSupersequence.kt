package com.raychenon.kotlin.leetcode

import java.util.*


/**
 * User: raychenon
 * Date: 13/6/2020
 * https://leetcode.com/problems/shortest-common-supersequence/
 *
 * This problem is NP-hard
 */
object ShortestCommonSupersequence {

    fun shortestCommonSupersequence(str1: String, str2: String): String? {
        val lcs = longestCommonSubSeq(str1, str2)
        var p1 = 0
        var p2 = 0
        var sb = StringBuffer()
        for (i in 0 until lcs!!.length) {
            while (p1 < str1.length && str1[p1] != lcs[i]) {
                sb.append(str1[p1++])
            }
            while (p2 < str2.length && str2[p2] != lcs[i]) {
                sb.append(str2[p2++])
            }
            sb.append(lcs[i])
            p1++
            p2++
        }
        sb.append(str1.substring(p1)).append(str2.substring(p2))
        return sb.toString()
    }

    private fun longestCommonSubSeq(str1: String, str2: String): String? {
        val dp = Array(
            str1.length + 1
        ) { arrayOfNulls<String>(str2.length + 1) }
        for (i in dp.indices) {
            Arrays.fill(dp[i], "")
        }
        for (i in 1..str1.length) {
            for (j in 1..str2.length) {
                if (str1[i - 1] == str2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + str1[i - 1]
                } else {
                    dp[i][j] =
                        if (dp[i - 1][j]!!.length > dp[i][j - 1]!!.length) dp[i - 1][j] else dp[i][j - 1]
                }
            }
        }
        return dp[str1.length][str2.length]
    }
}