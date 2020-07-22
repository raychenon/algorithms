package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 22/7/2020
 * https://leetcode.com/problems/word-search/
 */
object WordSearch {

    private var board: Array<CharArray> = arrayOf(charArrayOf())
    private var ROWS = 0
    private var COLS = 0

    fun exist(grid: Array<CharArray>, word: String): Boolean {
        board = grid
        this.ROWS = board.size
        this.COLS = board[0].size
        for (row in 0 until this.ROWS) for (col in 0 until this.COLS) if (backtrack(row, col, word, 0)) return true
        return false
    }

    fun backtrack(row: Int, col: Int, word: String, index: Int): Boolean {
        /* Step 1). check the bottom case. */
        if (index >= word.length) return true

        /* Step 2). Check the boundaries. */if (row < 0 || row == this.ROWS || col < 0 || col == this.COLS || this.board.get(
                row
            ).get(col) !== word[index]
        ) return false

        /* Step 3). explore the neighbors in DFS */
        var ret = false
        // mark the path before the next exploration
        board[row][col] = '#'
        val rowOffsets = intArrayOf(0, 1, 0, -1)
        val colOffsets = intArrayOf(1, 0, -1, 0)
        for (d in 0..3) {
            ret = backtrack(row + rowOffsets[d], col + colOffsets[d], word, index + 1)
            if (ret) break
        }

        /* Step 4). clean up and return the result. */
        board[row][col] = word[index]
        return ret
    }
}