package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-08-08
 * https://leetcode.com/problems/valid-sudoku/
 */
object ValidSudoku {

    /**
     * Each row must contain the digits 1-9 without repetition.
     * Each column must contain the digits 1-9 without repetition.
     * Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
     */
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val column = board.size - 1
        val row = board.get(0).size - 1

        // Each row must contain the digits 1-9 without repetition.
        for (i in 0..column) {
            var set = HashSet<Char>()
            for (j in 0..row) {
                val element = board.get(i).get(j)
                if (!'.'.equals(element)) {
                    if (set.contains(element)) {
                        return false
                    } else {
                        set.add(element)
                    }
                }
            }
        }

        // Each column must contain the digits 1-9 without repetition.
        for (j in 0..row) {
            var set = HashSet<Char>()
            for (i in 0..column) {
                val element = board.get(i).get(j)
                if (!'.'.equals(element)) {
                    if (set.contains(element)) {
                        return false
                    } else {
                        set.add(element)
                    }
                }
            }
        }

        // Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
        val subSquareSize = Math.sqrt(board.size.toDouble()).toInt()
        for (i in 0..row step subSquareSize) {
            for (j in 0..column step subSquareSize) {
                val result = isSubBoardValid(board, i, j)
                if (!result) {
                    return false
                }
            }
        }
        return true
    }

    private fun isSubBoardValid(board: Array<CharArray>, iStart: Int, jStart: Int): Boolean {
        val subSquareSize = Math.sqrt(board.size.toDouble()).toInt() - 1
        var set = HashSet<Char>()
        for (i in iStart..iStart + subSquareSize) {
            for (j in jStart..jStart + subSquareSize) {
                val element = board.get(i).get(j)

                if (!'.'.equals(element)) {
                    print("Grid , i = $i, j = $j , cell = $element , contained ${set.contains(element)} \n")
                    if (set.contains(element)) {
                        return false
                    } else {
                        set.add(element)
                    }
                }
            }
        }

        return true
    }
}
