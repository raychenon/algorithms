package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 23/3/2020
 * https://leetcode.com/problems/contains-duplicate/
 */
class ContainsDuplicateTest {

    @Test
    fun containsTest() {
        assertWithVariousMethods(true, intArrayOf(1, 2, 3, 1))
    }

    @Test
    fun noDuplicateTest() {
        assertWithVariousMethods(false, intArrayOf(1, 2, 3, 4))
    }

    @Test
    fun longArrayTest() {
        assertWithVariousMethods(true, intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2))
    }


    fun assertWithVariousMethods(expected: Boolean, array: IntArray) {
        Assert.assertEquals(expected, ContainsDuplicate.containsDuplicateSort(array))
        Assert.assertEquals(expected, ContainsDuplicate.containsDuplicateSet(array))
    }

}