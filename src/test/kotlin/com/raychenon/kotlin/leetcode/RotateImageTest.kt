package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-09-17
 * https://leetcode.com/problems/rotate-image/solution/
 */
class RotateImageTest {


    @Test
    fun rotate3by3MatrixTest() {
        val matrix = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
        val result = arrayOf(intArrayOf(7, 4, 1), intArrayOf(8, 5, 2), intArrayOf(9, 6, 3))
        
        RotateImage.rotate(matrix)

        Assert.assertEquals(result, matrix)
    }

    @Test
    fun rotate4by4MatrixTest() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3, 4),
            intArrayOf(5, 6, 7, 8),
            intArrayOf(9, 10, 11, 12),
            intArrayOf(13, 14, 15, 16)
        )
        val result = arrayOf(
            intArrayOf(13, 9, 5, 1),
            intArrayOf(14, 10, 6, 2),
            intArrayOf(15, 11, 7, 3),
            intArrayOf(16, 12, 8, 4)
        )
        RotateImage.rotate(matrix)

        Assert.assertEquals(result, matrix)
    }
}