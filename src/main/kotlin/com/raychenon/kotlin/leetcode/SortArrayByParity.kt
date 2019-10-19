package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-10-19
 * https://leetcode.com/problems/sort-array-by-parity
 */
object SortArrayByParity {

    fun sortArrayByParity(A: IntArray): IntArray {
        var res = IntArray(A.size) { 0 }
        var p: Int = 0  // pointer

        // even numbers
        for (v in A) {
            if (v % 2 == 0) res[p++] = v
        }

        // odd numbers
        for (v in A) {
            if (v % 2 == 1) res[p++] = v
        }
        return res
    }
}