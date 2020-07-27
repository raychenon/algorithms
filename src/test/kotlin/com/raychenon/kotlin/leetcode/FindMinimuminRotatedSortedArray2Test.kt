package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 26/7/2020
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii
 * with duplicates numbers in an ordered and rotated array
 */
class FindMinimuminRotatedSortedArray2Test {

    @Test
    fun find0Test() {
        val array = intArrayOf(4, 5, 5, 6, 6, 7, 0, 1, 2)
        assertFindMin(0, array)
        assertFindMax(7, array)
    }

    @Test
    fun example1Test() {
        val array = intArrayOf(1, 3, 5)
        assertFindMin(1, array)
        assertFindMax(5, array)
    }


    @Test
    fun example2Test() {
        val array = intArrayOf(2, 2, 2, 0, 1)
        assertFindMin(0, array)
        assertFindMax(2, array)
    }

    @Test
    fun minInMiddleTest() {
        val array = intArrayOf(5, 7, 11, 1, 1, 1, 1, 3)
        assertFindMin(1, array)
        assertFindMax(11, array)
    }

    @Test
    fun maxInMiddleTest() {
        val array = intArrayOf(7, 9, 15, 15, 15, 1, 3)
        assertFindMin(1, array)
        assertFindMax(15, array)
    }

    @Test
    fun onlySameValueTest() {
        val array = intArrayOf(1, 1, 1, 1, 1, 1, 1, 1)
        assertFindMin(1, array)
        assertFindMax(1, array)
    }

    fun assertFindMin(expectedDuplicate: Int, array: IntArray) {
        TestCase.assertEquals(
            expectedDuplicate,
            FindMinimuminRotatedSortedArray2.findMin(array)
        )
    }

    fun assertFindMax(expectedDuplicate: Int, array: IntArray) {
        TestCase.assertEquals(
            expectedDuplicate,
            FindMinimuminRotatedSortedArray2.findMax(array)
        )
    }

}