package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 2019-10-31
 * https://leetcode.com/problems/climbing-stairs
 */
public class ClimbingStairs {

    /**
     * Recursion with Memoization
     * Time complexity : O(n)
     * Space complexity : O(n)
     * @param n
     * @return
     */
    public int climbStairsRec(int n) {
        int memo[] = new int[n+1];
        return climbStairsRec(0,n,memo);
    }

    private int climbStairsRec(int i, int n, int memo[]){
        if(i>n) return 0;
        if(i == n) return 1;
        memo[i] = climbStairsRec(i+1,n,memo) + climbStairsRec(i+2,n,memo);
        return memo[i];
    }

}
