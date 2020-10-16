package com.raychenon.kotlin.leetcode.matrix

/**
 * User: raychenon
 * Date: 16/10/2020
 * https://leetcode.com/problems/search-a-2d-matrix/
 */
object Search2DMatrix {

    /**
     * Consider the matrix (2D array) as a 1D array.
     * Time complexity: O( log2(row * col))
     * Space complexity: O(1)
     */
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val row = matrix.size
        if (row == 0) return false
        val col = matrix[0].size
        if (col == 0) return false

        var l = 0
        var r = col * row - 1
        while (l < r) {
            val mid = l + (r - l) / 2 // (l + r - 1) / 2
            if (matrix[mid / col][mid % col] < target) {
                l = mid + 1
            } else {
                r = mid
            }
        }

        return matrix[r / col][r % col] == target
    }


    /**
     * Time complexity: O(row + col)
     * Space complexity: O(1)
     */
    fun searchMatrixOriginal(matrix: Array<IntArray>, target: Int): Boolean {
        val row = matrix.size
        if (row == 0) return false
        val col = matrix[0].size
        if (col == 0) return false

        // find row
        var r = 0
        while (r < row &&
            !(target >= matrix[r][0]
                    && target <= matrix[r][col - 1])
        ) {
            r++
        }
        if (r == row) return false

        // find col
        var c = 0
        while (c < col) {
            if (target == matrix[r][c]) {
                return true
            }
            c++
        }

        return false
    }
}