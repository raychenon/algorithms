package com.raychenon.kotlin.leetcode

import java.lang.Integer.max

/**
 * User: raychenon
 * Date: 26/5/2020
 * https://leetcode.com/problems/uncrossed-lines/
 *
 * We write the integers of A and B (in the order they are given) on two separate horizontal lines.
 * Now, we may draw connecting lines: a straight line connecting two numbers A[i] and B[j] such that:
 * A[i] == B[j];
 * The line we draw does not intersect any other connecting (non-horizontal) line.
 */
object UncrossedLines {

    /**
     * Best explanations: https://www.youtube.com/watch?v=duCx_62nMOA
     * Time complexity: O(len_A * len_B)
     * Space complexity: O(len_A * len_B)
     */
    fun maxUncrossedLines(A: IntArray, B: IntArray): Int {

        val lenA = A.size
        val lenB = B.size
        val dp = Array(lenA + 1) { IntArray(lenB + 1) }

        for (iA in 0..lenA) {
            for (iB in 0..lenB) {
                if (iB == 0 || iA == 0) {
                    dp[iA][iB] = 0
                } else if (A[iA - 1] == B[iB - 1]) {
                    dp[iA][iB] = 1 + dp[iA - 1][iB - 1]
                } else {
                    dp[iA][iB] = max(dp[iA - 1][iB], dp[iA][iB - 1])
                }
            }
        }
        return dp[lenA][lenB]
    }
}