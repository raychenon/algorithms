package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-11-07
 * https://leetcode.com/problems/game-of-life/
 */
object GameOfLife {

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