package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-11-07
 * https://leetcode.com/problems/game-of-life/
 */
object GameOfLife {

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

    fun gameOfLife(board: Array<IntArray>): Unit {
        val count = countNumberLiveCell(board, 3, 1)
        print("count  = $count")
        val length = board.size
        val height = board.get(0).size
        var boardCopy = Array(length, { IntArray(height) })
        for (x in 0 until length) {
            boardCopy[x] = board.get(x)
        }

        for (x in 0 until length) {
            for (y in 0 until height) {
                var curr = boardCopy[x][y]
                if (curr == 1) {
                    val liveRes = when (countNumberLiveCell(boardCopy, x, y)) {
                        // 1. Any live cell with fewer than two live neighbors dies, as if caused by under-population.
                        0 -> 0
                        1 -> 0
                        // 2. Any live cell with two or three live neighbors lives on to the next generation.
                        2 -> 1
                        3 -> 1
                        // 3. Any live cell with more than three live neighbors dies, as if by over-population..
                        else -> 0
                    }
                    println("x=$y , y=$x , $curr ,res = $liveRes")
                    board[x][y] = liveRes
                } else {
                    // 4. Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
                    if (countNumberLiveCell(boardCopy, x, y) == 3) {
                        board[x][y] = 1
                    }
                }
            }
        }

    }

    private fun countNumberLiveCell(board: Array<IntArray>, y: Int, x: Int): Int {
        var count = 0
        val width = board.get(0).size
        val height = board.size
        // top
        if ((y - 1) >= 0) {
            if (board.get(y - 1).get(x) == 1) ++count
            if (x - 1 >= 0 && board.get(y - 1).get(x - 1) == 1) ++count
            if (x + 1 < width && board.get(y - 1).get(x + 1) == 1) ++count
        }

        // bottom
        if ((y + 1) < height) {
            if (board.get(y + 1).get(x) == 1) ++count
            if (x - 1 >= 0 && board.get(y + 1).get(x - 1) == 1) ++count
            if (x + 1 < width && board.get(y + 1).get(x + 1) == 1) ++count
        }
        // left
        if (x - 1 >= 0 && board.get(y).get(x - 1) == 1) ++count
        // right
        if (x + 1 < width && board.get(y).get(x + 1) == 1) ++count

        return count
    }

}