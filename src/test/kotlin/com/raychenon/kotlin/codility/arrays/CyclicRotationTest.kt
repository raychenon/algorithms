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
    fun assertArrayFullRotation() {
        Assert.assertTrue(CyclicRotation.rotate(intArrayOf(1, 2, 3, 4), 1) contentEquals  intArrayOf(4, 1, 2, 3))
    }
}