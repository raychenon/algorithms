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
                val result = isSubBoardValid(board, i, i + subSquareSize - 1, j, j + subSquareSize - 1)
                if (!result) {
                    return false
                }
            }
        }
        return true
    }

    private fun isSubBoardValid(
        board: Array<CharArray>,
        rowStart: Int,
        rowEnd: Int,
        colStart: Int,
        colEnd: Int
    ): Boolean {
        val hashSet = HashSet<Char>()
        for (i in rowStart..rowEnd) {
            for (j in colStart..colEnd) {
                val element = board.get(i).get(j)
                if (!'.'.equals(element) && hashSet.contains(element)) {
                    print("Grid , row = $i, col = $j , cell = $element , contained ${hashSet.contains(element)} , $hashSet \n")
                    return false
                } else {
                    hashSet.add(element)
                }
            }
        }
        return true
    }
}
