package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-11-07
 * https://leetcode.com/problems/game-of-life/
 */
class GameOfLifeTest {

    @Test
    fun gameofLifeTest() {
        val board = arrayOf(
            intArrayOf(0, 1, 0),
            intArrayOf(0, 0, 1),
            intArrayOf(1, 1, 1),
            intArrayOf(0, 0, 0)
        )
        val expected = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(1, 0, 1),
            intArrayOf(0, 1, 1),
            intArrayOf(0, 1, 0)
        )

        compareMethods(expected, board)
    }

    fun compareMethods(expected: Array<IntArray>, grid: Array<IntArray>) {
        val grid1 = Array(grid.size) { IntArray(grid[0].size) }
        val grid2 = Array(grid.size) { IntArray(grid[0].size) }
        for (r in grid.indices) {
            for (c in grid[0].indices) {
                grid1[r][c] = grid[r][c]
                grid2[r][c] = grid[r][c]
            }
        }
        GameOfLife.gameOfLife(grid1)
        compareBoards(expected, grid1)
        GameOfLife.gameOfLifeCS(grid2)
        compareBoards(expected, grid2)
    }

    fun compareBoards(expected: Array<IntArray>, actual: Array<IntArray>) {
        TestCase.assertEquals(expected.size, actual.size)
        TestCase.assertEquals(expected[0].size, actual[0].size)
        for (i in expected.indices) {
            for (j in 0 until expected[0].size) {
                TestCase.assertEquals(expected[i][j], actual[i][j])
            }
        }
    }
}