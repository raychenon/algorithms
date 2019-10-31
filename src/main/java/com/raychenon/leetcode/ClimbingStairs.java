package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 2019-10-31
 * https://leetcode.com/problems/climbing-stairs
 * <p>
 * nb of way to climb stairs
 * nb(n) = nb(n-1) + nb(n-2)
 */
public class ClimbingStairs {

    /**
     * Dynamic Programming
     * Time complexity : O(n)
     * Space complexity : O(1)
     */
    public int climbStairsFibonacci(int n) {
        if (n == 1) return 1;
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int res = first + second;
            first = second;
            second = res;
        }
        return second;
    }

    /**
     * Dynamic Programming
     * Time complexity : O(n)
     * Space complexity : O(n)
     *
     * @param n
     * @return
     */
    public int climbStairsDynamic(int n) {

        if (n == 1) return 1;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    /**
     * Recursion with Memoization
     * Time complexity : O(n)
     * Space complexity : O(n)
     *
     * @param n
     * @return
     */
    public int climbStairsRec(int n) {
        int memo[] = new int[n + 1];
        return climbStairsRec(0, n, memo);
    }

    private int climbStairsRec(int i, int n, int memo[]) {
        if (i > n) return 0;
        if (i == n) return 1;
        memo[i] = climbStairsRec(i + 1, n, memo) + climbStairsRec(i + 2, n, memo);
        return memo[i];
    }

}
