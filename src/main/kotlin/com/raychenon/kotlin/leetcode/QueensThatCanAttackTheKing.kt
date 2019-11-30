package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-12-01
 * https://leetcode.com/problems/queens-that-can-attack-the-king/
 */
object QueensThatCanAttackTheKing {

    fun queensAttacktheKing(queens: Array<IntArray>, king: IntArray): List<List<Int>> {

        // From the King position, see who can attack horizontally,vertically,diagonally
        // any Queens on these coordinates is on the answer list.
        val dir = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, -1),
            intArrayOf(1, 0),
            intArrayOf(-1, 0),
            intArrayOf(1, 1),
            intArrayOf(1, -1),
            intArrayOf(-1, 1),
            intArrayOf(-1, -1)
        )
        var isVisitedArr = BooleanArray(dir.size)
        val table = Array(8) { BooleanArray(8) }

        // copy the queens positions in the 8x8 chessboard
        for (i in queens.indices) {
            table[queens[i][0]][queens[i][1]] = true
        }
        val list = mutableListOf<List<Int>>()


        for (p in 0 until dir.size) {
            for (step in 0 until 8) {
                val row = king[0] + dir[p][0] * step
                val col = king[1] + dir[p][1] * step
                if (col >= 0 && col < 8 && row >= 0 && row < 8 && table[row][col] && !isVisitedArr[p]) {
                    isVisitedArr[p] = true

                    val validQueen = intArrayOf(row, col).toList()
                    list.add(validQueen)
                }
            }
        }

        return list
    }

}