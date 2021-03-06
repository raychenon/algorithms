package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 16/2/2020
 * https://leetcode.com/problems/rotting-oranges/
 */
class RottingOrangesTest {

    @Test
    fun example1Test() {
        val matrix =
            arrayOf(intArrayOf(2, 1, 1), intArrayOf(1, 1, 0), intArrayOf(0, 1, 1))
        evaluateRottingOranges(4, matrix)
    }

    @Test
    fun example2Test() {
        val matrix =
            arrayOf(intArrayOf(2, 1, 1), intArrayOf(0, 1, 1), intArrayOf(1, 0, 1))
        evaluateRottingOranges(-1, matrix)
    }

    @Test
    fun example3Test() {
        val matrix = arrayOf(intArrayOf(0, 2))
        evaluateRottingOranges(0, matrix)
    }

    fun evaluateRottingOranges(expectedMinutes: Int, grid: Array<IntArray>): Unit {
        // does not modify the grid
        TestCase.assertEquals(expectedMinutes, RottingOranges.orangesRottingBFS(grid))
        // modifies the grid in-place
        TestCase.assertEquals(expectedMinutes, RottingOranges.orangesRotting(grid))
    }

}