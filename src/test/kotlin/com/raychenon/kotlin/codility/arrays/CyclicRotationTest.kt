package com.raychenon.kotlin.codility.arrays

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 24/3/19
 * https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
 */
class CyclicRotationTest {

    @Test
    fun assertCyclicRotation() {
        Assert.assertTrue(CyclicRotation.rotate(intArrayOf(3, 8, 9, 7, 6), 3) contentEquals intArrayOf(9, 7, 6, 3, 8))
    }

    @Test
    fun assertArrayIdentityRotation() {
        Assert.assertTrue(CyclicRotation.rotate(intArrayOf(1, 2, 3, 4), 0) contentEquals intArrayOf(1, 2, 3, 4))
        Assert.assertTrue(CyclicRotation.rotate(intArrayOf(1, 2, 3, 4), 4) contentEquals intArrayOf(1, 2, 3, 4))
    }

    @Test
    fun assertArrayFullRotation() {
        Assert.assertTrue(CyclicRotation.rotate(intArrayOf(1, 2, 3, 4), 1) contentEquals intArrayOf(4, 1, 2, 3))
        Assert.assertTrue(CyclicRotation.rotate(intArrayOf(1, 2, 3, 4), 2) contentEquals intArrayOf(3, 4, 1, 2))
        Assert.assertTrue(CyclicRotation.rotate(intArrayOf(1, 2, 3, 4), 3) contentEquals intArrayOf(2, 3, 4, 1))
    }


}