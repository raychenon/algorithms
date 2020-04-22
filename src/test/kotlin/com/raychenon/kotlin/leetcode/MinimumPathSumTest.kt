package com.raychenon.kotlin.leetcode

import org.junit.Test

/**
 * User: raychenon
 * Date: 21/4/2020
 * https://leetcode.com/problems/minimum-path-sum/
 */
class MinimumPathSumTest {

    @Test
    fun example1Test() {
        val input =
            arrayOf(intArrayOf(1, 3, 1), intArrayOf(1, 5, 1), intArrayOf(4, 2, 1))
        assertMinimumPathSumMethods(7, input)
    }

    @Test
    fun example2Test() {
        val input = arrayOf(
            intArrayOf(3, 8, 6, 0, 5, 9, 9, 6, 3, 4, 0, 5, 7, 3, 9, 3),
            intArrayOf(0, 9, 2, 5, 5, 4, 9, 1, 4, 6, 9, 5, 6, 7, 3, 2),
            intArrayOf(8, 2, 2, 3, 3, 3, 1, 6, 9, 1, 1, 6, 6, 2, 1, 9),
            intArrayOf(1, 3, 6, 9, 9, 5, 0, 3, 4, 9, 1, 0, 9, 6, 2, 7),
            intArrayOf(8, 6, 2, 2, 1, 3, 0, 0, 7, 2, 7, 5, 4, 8, 4, 8),
            intArrayOf(4, 1, 9, 5, 8, 9, 9, 2, 0, 2, 5, 1, 8, 7, 0, 9),
            intArrayOf(6, 2, 1, 7, 8, 1, 8, 5, 5, 7, 0, 2, 5, 7, 2, 1),
            intArrayOf(8, 1, 7, 6, 2, 8, 1, 2, 2, 6, 4, 0, 5, 4, 1, 3),
            intArrayOf(9, 2, 1, 7, 6, 1, 4, 3, 8, 6, 5, 5, 3, 9, 7, 3),
            intArrayOf(0, 6, 0, 2, 4, 3, 7, 6, 1, 3, 8, 6, 9, 0, 0, 8),
            intArrayOf(4, 3, 7, 2, 4, 3, 6, 4, 0, 3, 9, 5, 3, 6, 9, 3),
            intArrayOf(2, 1, 8, 8, 4, 5, 6, 5, 8, 7, 3, 7, 7, 5, 8, 3),
            intArrayOf(0, 7, 6, 6, 1, 2, 0, 3, 5, 0, 8, 0, 8, 7, 4, 3),
            intArrayOf(0, 4, 3, 4, 9, 0, 1, 9, 7, 7, 8, 6, 4, 6, 9, 5),
            intArrayOf(6, 5, 1, 9, 9, 2, 2, 7, 4, 2, 7, 2, 2, 3, 7, 2),
            intArrayOf(7, 1, 9, 6, 1, 2, 7, 0, 9, 6, 6, 4, 4, 5, 1, 0),
            intArrayOf(3, 4, 9, 2, 8, 3, 1, 2, 6, 9, 7, 0, 2, 4, 2, 0),
            intArrayOf(5, 1, 8, 8, 4, 6, 8, 5, 2, 4, 1, 6, 2, 2, 9, 7)
        )
        assertMinimumPathSumMethods(83, input)
    }


    fun assertMinimumPathSumMethods(expected: Int, grid: Array<IntArray>) {
        assert(expected == MinimumPathSum.minPathSum(grid))
    }

}