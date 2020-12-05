package com.raychenon.kotlin.leetcode

import java.util.*

/**
 * User: raychenon
 * Date: 5/12/2020
 * https://leetcode.com/problems/the-kth-factor-of-n/
 */
object KthFactor {

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param n
     * @param k
     * @return
     */
    fun kthFactorLinear(n: Int, k: Int): Int {
        var count = 0
        for (i in 1..n) {
            if (n % i == 0) {
                count++
                if (count == k) {
                    return i
                }
            }
        }
        return -1
    }

    /**
     * Time complexity: O(sqrt(n))
     * Space complexity: O(sqrt(n))
     *
     * @param n
     * @param k
     * @return
     */
    fun kthFactorSqrt(n: Int, k: Int): Int {
        var count = 0
        val list: MutableList<Int> = ArrayList()
        var i = 1
        while (i * i <= n) {
            if (n % i == 0) {
                if (i * i != n) list.add(n / i)
                if (++count == k) return i
            }
            i++
        }
        return if (list.size + count < k) -1 else list[list.size - (k - count)]
    }
}