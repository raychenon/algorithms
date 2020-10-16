package com.raychenon.kotlin.leetcode.matrix

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 16/10/2020
 * https://leetcode.com/problems/search-a-2d-matrix/
 */
class Search2DMatrixTest {


    @Test
    fun `Example 1 test`() {
        val matrix = arrayOf(
            intArrayOf(1, 3, 5, 7),
            intArrayOf(10, 11, 16, 20),
            intArrayOf(23, 30, 34, 50),
        )
        assertSearch2DMatrix(matrix, 1, true)
    }

    @Test
    fun `Example 2 test`() {
        val matrix = arrayOf(
            intArrayOf(1, 3, 5, 7),
            intArrayOf(10, 11, 16, 20),
            intArrayOf(23, 30, 34, 50),
        )
        assertSearch2DMatrix(matrix, 13, false)
    }

    @Test
    fun `Example 3 test`() {
        val matrix = arrayOf(
            intArrayOf()
        )
        assertSearch2DMatrix(matrix, 0, false)
    }

    @Test
    fun `Test empty column matrix`() {
        val matrix = arrayOf<IntArray>()
        assertSearch2DMatrix(matrix, 1, false)
    }

    @Test
    fun `Target is at the end of matrix`() {
        val matrix = arrayOf(
            intArrayOf(1, 3, 5, 7),
            intArrayOf(10, 11, 16, 20),
            intArrayOf(23, 30, 34, 50),
        )
        assertSearch2DMatrix(matrix, 50, true)
    }

    @Test
    fun `Target is higher than max of matrix`() {
        val matrix = arrayOf(
            intArrayOf(1, 3, 5, 7),
            intArrayOf(10, 11, 16, 20),
            intArrayOf(23, 30, 34, 50),
        )
        assertSearch2DMatrix(matrix, 100, false)
    }

    @Test
    fun `Target is lower than min of matrix`() {
        val matrix = arrayOf(
            intArrayOf(1, 3, 5, 7),
            intArrayOf(10, 11, 16, 20),
            intArrayOf(23, 30, 34, 50),
        )
        assertSearch2DMatrix(matrix, 0, false)
    }


    fun assertSearch2DMatrix(matrix: Array<IntArray>, target: Int, expected: Boolean) {
        TestCase.assertEquals(expected, Search2DMatrix.searchMatrix(matrix, target))
        TestCase.assertEquals(expected, Search2DMatrix.searchMatrixBinarySearchTemplate1(matrix, target))
        TestCase.assertEquals(expected, Search2DMatrix.searchMatrixOriginal(matrix, target))
    }
}