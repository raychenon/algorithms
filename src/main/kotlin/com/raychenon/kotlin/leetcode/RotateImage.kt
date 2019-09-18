package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-09-17
 * https://leetcode.com/problems/rotate-image
 */
object RotateImage {

    /**
     *
     * The basic idea is that we process the matrix from outer to inner.
     * First we process the outer circle of the matrix,
     * and then the inner circle until the side length of the last inner circle is smaller than 2
     * (meaning there is only one center element left).
     *
     * Time  complexity: O(n^2)
     * Space complexity: O(1)
     *
     */
    fun rotate(matrix: Array<IntArray>): Unit {
        val n = matrix.size

        for (i in 0 until (n) / 2) {
            // one of the loop has to round up if the size of Matrix is an odd number
            for (j in 0 until (n + 1) / 2) {
                val temp = matrix[n - 1 - j][i]
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1]   // bottom left = bottom right
                matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 - i]   // bottom right = top right
                matrix[j][n - 1 - i] = matrix[i][j]                   // top right = top left
                matrix[i][j] = temp                                   // top left = bottom left
            }
        }
    }

}