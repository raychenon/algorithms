package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-11-07
 * https://leetcode.com/problems/game-of-life/
 */
object GameOfLife {

    /**
     * time complexity: O(R*C) R number of rows, C number of columns
     * space complexity: O(1)
     *
     * @param board
     */
    fun gameOfLifeCS(board: Array<IntArray>): Unit {

        val dir = arrayOf(
            intArrayOf(1, -1),
            intArrayOf(1, 0),
            intArrayOf(1, 1),
            intArrayOf(0, -1),
            intArrayOf(0, 1),
            intArrayOf(-1, -1),
            intArrayOf(-1, 0),
            intArrayOf(-1, 1)
        )

        // 0 -> 00 dead stays dead
        // 1 -> 01 dead cell becomes live
        // 2 -> 10 live cell becomes dead
        // 3 -> 11 live cell stays alive
        for (row in board.indices) {
            for (col in board[0].indices) {
                var countLive = 0
                for (d in dir) {
                    if (d[0] + row < 0 || d[0] + row >= board.size
                        || d[1] + col < 0 || d[1] + col >= board[0].size
                    ) {
                        continue
                    }

                    if (board[d[0] + row][d[1] + col] == 1 || board[d[0] + row][d[1] + col] == 2) {
                        countLive++
                    }
                }
                // Rule 1: Any live cell with fewer than two live neighbors dies, as if caused by under-population.
                // Rule 3: Any live cell with more than three live neighbors dies, as if by over-population.
                if (board[row][col] == 1 && (countLive < 2 || countLive > 3)) {
                    board[row][col] = 2
                }

                // Rule 4: Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
                if (board[row][col] == 0 && countLive == 3) {
                    board[row][col] = 3
                }
            }
        }
        for (row in board.indices) {
            for (col in 0 until board[0].size) {
                board[row][col] %= 2
            }
        }

    }

    /**
     * time complexity : O(R*C) R number of rows, C number of columns
     * space complexity : O(R*C) R number of rows, C number of columns
     *
     * @param board
     */
    fun gameOfLife(board: Array<IntArray>): Unit {

        // copy board
        var boardCopy = Array(board.size, { IntArray(board.get(0).size) })
        for (row in 0 until board.size) {
            for (col in 0 until board.get(0).size) {
                boardCopy[row][col] = board[row][col]
            }
        }

        for (row in board.indices) {
            for (col in board[0].indices) {
                var curr = boardCopy[row][col]
                val countLiveCell = (countNumberLiveCell(boardCopy, row, col))
                if (curr == 1) {
                    val cellNextState = when (countLiveCell) {
                        // 2. Any live cell with two or three live neighbors lives on to the next generation.
                        2 -> 1
                        3 -> 1
                        // 1. Any live cell with fewer than two live neighbors dies, as if caused by under-population.
                        // 3. Any live cell with more than three live neighbors dies, as if by over-population..
                        else -> 0
                    }
                    board[row][col] = cellNextState
                } else {
                    // 4. Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
                    if (countLiveCell == 3) {
                        board[row][col] = 1
                    }
                }
            }
        }
    }

    private fun countNumberLiveCell(board: Array<IntArray>, row: Int, col: Int): Int {
        var count = 0
        val width = board.get(0).size
        val height = board.size

        val dir = arrayOf(
            intArrayOf(1, -1),
            intArrayOf(1, 0),
            intArrayOf(1, 1),
            intArrayOf(0, -1),
            intArrayOf(0, 1),
            intArrayOf(-1, -1),
            intArrayOf(-1, 0),
            intArrayOf(-1, 1)
        )

        for (d in dir) {
            // outer limit
            if (d[0] + row < 0 || d[0] + row >= height
                || d[1] + col < 0 || d[1] + col >= width
            ) {
                continue
            }

            // || board[d[0] + row][d[1] + col] == 2
            if (board[d[0] + row][d[1] + col] == 1) {
                count++
            }
        }

        return count
    }

}