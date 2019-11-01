package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-11-01
 * https://leetcode.com/problems/climbing-stairs
 */
object ClimbingStairs {

    fun climbStairsDynamic(n: Int): Int {
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
}