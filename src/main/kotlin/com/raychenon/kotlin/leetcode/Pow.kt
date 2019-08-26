package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-08-26
 * https://leetcode.com/problems/powx-n/
 */
object Pow {
    fun myPow(x: Double, n: Int): Double {
        var res = x
        for (i in 1 until Math.abs(n)) {
            res = res * x
        }
        if (n < 0) {
            res = 1 / res
        }
        return res
    }
}
