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
     */
    fun rotate(matrix: Array<IntArray>): Unit {
        val n = matrix.get(0).size

        for (i in n downTo 1 step -2) {
            val start = (n - i) / 2
            val end = start + i - 1

            for (j in 0 until i) {

                val temp = matrix[end - i][start]
                matrix[end - i][start] = matrix[end][end - i]
                matrix[end][end - 1] = matrix[start + i][end]
                matrix[start + 1][end] = matrix[start][start - i]
                matrix[start][start + 1] = temp
            }
        }
    }
}