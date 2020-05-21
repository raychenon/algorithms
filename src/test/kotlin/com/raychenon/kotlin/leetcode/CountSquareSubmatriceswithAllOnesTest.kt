package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 21/5/2020
 * https://leetcode.com/problems/count-square-submatrices-with-all-ones/
 */
class CountSquareSubmatriceswithAllOnesTest {

    @Test
    fun example1Test() {
        val matrix =
            arrayOf(intArrayOf(0, 1, 1, 1), intArrayOf(1, 1, 1, 1), intArrayOf(0, 1, 1, 1))
        TestCase.assertEquals(
            15,
            CountSquareSubmatriceswithAllOnes.countSquares(
                matrix
            )
        )
    }

    @Test
    fun example2Test() {
        val matrix =
            arrayOf(intArrayOf(1, 0, 1), intArrayOf(1, 1, 0), intArrayOf(1, 1, 0))
        TestCase.assertEquals(
            7,
            CountSquareSubmatriceswithAllOnes.countSquares(
                matrix
            )
        )
    }
}