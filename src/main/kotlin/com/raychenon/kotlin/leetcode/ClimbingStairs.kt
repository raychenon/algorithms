package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-11-01
 * https://leetcode.com/problems/climbing-stairs
 */
object ClimbingStairs {

    /**
     * Dynamic Programming
     * Time complexity : O(log(n))
     * Space complexity : O(1)
     */
    fun climbStairsFibonacciFormula(n: Int): Int {
        val sqrt5 = Math.sqrt(5.0)
        val fibn = Math.pow((1 + sqrt5) / 2, (n + 1).toDouble()) - Math.pow((1 - sqrt5) / 2, (n + 1).toDouble())
        return (fibn / sqrt5).toInt()
    }

    /**
     * Dynamic Programming
     * Time complexity : O(n)
     * Space complexity : O(n)
     *
     * @param n
     * @return
     */
    fun climbStairsDynamic(n: Int): Int {
        if (n == 1) return 1
        var arr = IntArray(n) { it -> 0 }
        arr[0] = 1
        arr[1] = 2
        for (i in 2 until n) {
            arr[i] = arr[i - 1] + arr[i - 2]
        }
        return arr[n - 1]
    }

    /**
     * Dynamic Programming
     * Time complexity : O(n)
     * Space complexity : O(1)
     */
    fun climbStairsFibonacci(n: Int): Int {
        if (n == 1) return 1
        var first = 1
        var second = 2
        for (i in 3..n) {
            val res = first + second
            first = second
            second = res
        }
        return second
    }

    /**
     * Recursion with Memoization
     * Time complexity : O(n)
     * Space complexity : O(n)
     *
     * @param n
     * @return
     */
    fun climbStairsRec(n: Int): Int {
        val memo = IntArray(n + 1)
        return climbStairsRec(0, n, memo)
    }

    private fun climbStairsRec(i: Int, n: Int, memo: IntArray): Int {
        if (i == n) return 1
        if (i > n) return 0
        memo[i] = climbStairsRec(i + 1, n, memo) + climbStairsRec(i + 2, n, memo)
        return memo[i]
    }
}