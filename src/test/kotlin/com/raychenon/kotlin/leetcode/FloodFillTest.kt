package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-09-18
 * https://leetcode.com/problems/flood-fill
 */
class FloodFillTest {

    @Test
    fun fillMatrix3x3Test() {
        val image = arrayOf(
            intArrayOf(1, 1, 1),
            intArrayOf(1, 1, 0),
            intArrayOf(1, 0, 1)
        )
        val result = arrayOf(
            intArrayOf(2, 2, 2),
            intArrayOf(2, 2, 0),
            intArrayOf(2, 0, 1)
        )

        Assert.assertEquals(result, FloodFill.floodFill(image, 1, 1, 2))
    }

    @Test
    fun fillMatrix4x3Test() {
        val image = arrayOf(
            intArrayOf(1, 1, 1, 1),
            intArrayOf(1, 1, 0, 2),
            intArrayOf(1, 0, 1, 1)
        )
        val result = arrayOf(
            intArrayOf(2, 2, 2, 2),
            intArrayOf(2, 2, 0, 2),
            intArrayOf(2, 0, 1, 1)
        )

        Assert.assertEquals(result, FloodFill.floodFill(image, 1, 1, 2))
    }
}