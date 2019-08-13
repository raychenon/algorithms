package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-08-08
 * https://leetcode.com/problems/valid-sudoku/
 */
object ValidSudoku {

    /**

     * The key in this Solution is to save in String the following conditions :
     * - Each row must contain the digits 1-9 without repetition. ex : "(5) in row 1"
     * - Each column must contain the digits 1-9 without repetition. ex : "(7) in row 3"
     * - Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
     *  ex: "(6) in sub-grid 2 , 0"
     *  |_|_|x|  col=2, row=0
     *  |_|_|_|
     *  |_|_|_|
     */
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val rowSet = HashSet<String>()
        val colSet = HashSet<String>()
        val subgridSet = HashSet<String>()
        val size = board.size
        val smallBoardSize = Math.sqrt(size.toDouble()).toInt()
        for (i in 0 until size) {
            for (j in 0 until size) {
                val element = board[i][j]
                if (element != '.') {
                    val b = String.format("(%c)", element)
                    if (!rowSet.add("$b in row $i") ||
                        !colSet.add("$b in column $j") ||
                        !subgridSet.add("$b in sub-grid ${i / smallBoardSize} , ${j / smallBoardSize}")
                    )
                        return false
                }
            }
        }
        return true
    }

    /**
     * Each row must contain the digits 1-9 without repetition.
     * Each column must contain the digits 1-9 without repetition.
     * Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
     */
//    fun isValidSudokuBruteForce(board: Array<CharArray>): Boolean {
//        val column = board.size
//        val row = board.get(0).size
//
//        // Each row must contain the digits 1-9 without repetition.
//        for (i in 0 until column) {
//            var set = HashSet<Char>()
//            for (j in 0 until row) {
//                val element = board.get(i).get(j)
//                if (!'.'.equals(element)) {
//                    if (set.contains(element)) {
//                        return false
//                    } else {
//                        set.add(element)
//                    }
//                }
//            }
//        }
//
//        // Each column must contain the digits 1-9 without repetition.
//        for (j in 0 until row) {
//            var set = HashSet<Char>()
//            for (i in 0 until column) {
//                val element = board.get(i).get(j)
//                if (!'.'.equals(element)) {
//                    if (set.contains(element)) {
//                        return false
//                    } else {
//                        set.add(element)
//                    }
//                }
//            }
//        }
//
//        // Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
//        val subSquareSize = Math.sqrt(board.size.toDouble()).toInt()
//        for (i in 0 until row step subSquareSize) {
//            for (j in 0 until column step subSquareSize) {
//                val result = isSubBoardValid(board, i, i + subSquareSize - 1, j, j + subSquareSize - 1)
//                if (!result) {
//                    return false
//                }
//            }
//        }
//        return true
//    }
//
//    private fun isSubBoardValid(
//        board: Array<CharArray>,
//        rowStart: Int,
//        rowEnd: Int,
//        colStart: Int,
//        colEnd: Int
//    ): Boolean {
//        val hashSet = HashSet<Char>()
//        for (i in rowStart..rowEnd) {
//            for (j in colStart..colEnd) {
//                val element = board.get(i).get(j)
//                if (!'.'.equals(element) && hashSet.contains(element)) {
//                    print("Grid , row = $i, col = $j , cell = $element , contained ${hashSet.contains(element)} , $hashSet \n")
//                    return false
//                } else {
//                    hashSet.add(element)
//                }
//            }
//        }
//        return true
//    }
}
