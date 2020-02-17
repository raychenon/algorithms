package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 16/2/2020
 * https://leetcode.com/problems/rotting-oranges/
 */
class RottingOrangesTest {

    @Test
    fun example1Test() {
        val matrix =
            arrayOf(intArrayOf(2, 1, 1), intArrayOf(1, 1, 0), intArrayOf(0, 1, 1))
        TestCase.assertEquals(4, RottingOranges.orangesRotting(matrix))
    }

    @Test
    fun example2Test() {
        val matrix =
            arrayOf(intArrayOf(2, 1, 1), intArrayOf(0, 1, 1), intArrayOf(1, 0, 1))
        TestCase.assertEquals(-1, RottingOranges.orangesRotting(matrix))
    }

    @Test
    fun example3Test() {
        val matrix = arrayOf(intArrayOf(0, 2))
        TestCase.assertEquals(0, RottingOranges.orangesRotting(matrix))
    }

}