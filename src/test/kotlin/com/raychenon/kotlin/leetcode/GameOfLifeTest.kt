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

        GameOfLife.gameOfLifeCS(board)

        compareBoards(expected, board)
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