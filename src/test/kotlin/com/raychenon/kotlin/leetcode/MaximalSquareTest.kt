package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 23/5/2020
 * https://leetcode.com/problems/maximal-square/
 */
class MaximalSquareTest {

    @Test
    fun example1Test() {
        val matrix = arrayOf(
            charArrayOf('1', '0', '1', '0', '0'),
            charArrayOf('1', '0', '1', '1', '1'),
            charArrayOf('1', '1', '1', '1', '1'),
            charArrayOf('1', '0', '0', '1', '0')
        )
        evaluateMaximalSquareOriginal(4, matrix)
    }

    @Test
    fun biggerMatrixTest() {

        // 2 matrix of size 9
        val matrix = arrayOf(
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('1', '1', '1', '1', '0'),
            charArrayOf('1', '1', '1', '1', '1'),
            charArrayOf('1', '1', '1', '1', '0')
        )
        evaluateMaximalSquareOriginal(9, matrix)
    }

    fun evaluateMaximalSquareOriginal(expected: Int, matrix: Array<CharArray>) {
        TestCase.assertEquals(
            expected,
            MaximalSquare.maximalSquareDP2Darray(matrix)
        )
    }
}