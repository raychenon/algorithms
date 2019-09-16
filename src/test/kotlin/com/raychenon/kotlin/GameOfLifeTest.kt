package com.raychenon.kotlin

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-09-16
 * https://leetcode.com/problems/game-of-life/
 */
class GameOfLifeTest {

    @Test
    fun validGridTest() {
        val grid = arrayOf(
            intArrayOf(0, 1, 0),
            intArrayOf(0, 0, 1),
            intArrayOf(1, 1, 1),
            intArrayOf(0, 0, 0)
        )

        val result = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 1),
            intArrayOf(0, 1, 1),
            intArrayOf(0, 0, 0)
        )

        Assert.assertEquals(result, GameOfLife.gameOfLife(grid))
    }

}