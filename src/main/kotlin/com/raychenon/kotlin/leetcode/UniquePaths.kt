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
     * Recurrence relation:
     * uniquePaths(m, n) = uniquePaths(m - 1, n) + uniquePaths(m, n - 1).
     *
     * Note: tailrec avoids the stack overflow, it doesn't memoize intermediary results
     */
    tailrec fun uniquePathsRecursive(m: Int, n: Int): Int {
        return if (m == 1 || n == 1) 1 else uniquePathsRecursive(m - 1, n) + uniquePathsRecursive(m, n - 1)
    }
}