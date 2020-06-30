package com.raychenon.kotlin.leetcode;

/**
 * User: raychenon
 * Date: 30/6/2020
 * https://leetcode.com/problems/unique-paths/
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * How many possible unique paths are there?
 */
public class UniquePaths {

    /**
     * Since the movement is only either right or bottom
     * Recurrence relation:
     * uniquePaths(m, n) = uniquePaths(m - 1, n) + uniquePaths(m, n - 1).
     * 
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for( int i=0;i<m;i++){
            dp[i][0]=1;
        }
        for( int i=0;i<n;i++){
            dp[0][i]=1;
        }

        for( int i=1;i<m;i++){
            for( int j=1;j<n;j++){
                dp[i][j]= dp[i-1][j] + dp[i][j-1];

            }
        }

        return dp[m-1][n-1];
    }
}
