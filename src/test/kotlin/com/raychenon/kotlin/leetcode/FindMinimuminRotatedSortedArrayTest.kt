package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 26/7/2020
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 */
class FindMinimuminRotatedSortedArrayTest {

    @Test
    fun findMinimumTest() {
        assertMethods(1, intArrayOf(3, 4, 5, 1, 2))
    }

    @Test
    fun find0Test() {
        assertMethods(0, intArrayOf(4, 5, 6, 7, 0, 1, 2))
    }

    @Test
    fun findMinimumleftShiftTest() {
        assertMethods(0, intArrayOf(7, 0, 1, 2, 4, 5, 6))
    }

    @Test
    fun uniqueElementTest() {
        assertMethods(3, intArrayOf(3))
    }

    fun assertMethods(expectedDuplicate: Int, array: IntArray) {
        TestCase.assertEquals(
            expectedDuplicate,
            FindMinimuminRotatedSortedArray.findMin(array)
        )
        TestCase.assertEquals(
            expectedDuplicate,
            FindMinimuminRotatedSortedArray.findMinBF(array)
        )
    }

}