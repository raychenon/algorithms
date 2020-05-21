package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 21/5/2020
 * https://leetcode.com/problems/count-square-submatrices-with-all-ones/
 */
object CountSquareSubmatriceswithAllOnes {
    /**
     * Time complexity: O(row * col) :
     * Space complexity: O(1) : the matrix itself is used to store the dynamic programming data
     */
    fun countSquares(matrix: Array<IntArray>): Int {
        var res = 0
        for (row in 0 until matrix.size) {
            for (col in 0 until matrix[0].size) {
                if (matrix[row][col] > 0 && row > 0 && col > 0) {
                    matrix[row][col] =
                        minOf(matrix[row - 1][col], matrix[row][col - 1], matrix[row - 1][col - 1]) + 1
                }
                res += matrix[row][col]
            }
        }

        return res
    }
}