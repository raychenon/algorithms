package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 7/7/2020
 * https://leetcode.com/problems/island-perimeter/
 */
class IslandPerimeterTest {
    @Test
    fun example1Test() {
        evaluateIslandParameter(
            16,
            arrayOf(
                intArrayOf(0, 1, 0, 0),
                intArrayOf(1, 1, 1, 0),
                intArrayOf(0, 1, 0, 0),
                intArrayOf(1, 1, 0, 0)
            )
        )
    }

    fun evaluateIslandParameter(expected: Int, grid: Array<IntArray>) {
        Assert.assertEquals(expected, IslandPerimeter.islandPerimeter(grid))
    }

}