package com.raychenon.kotlin.leetcode

import junit.framework.TestCase.assertEquals
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-10-06
 * https://leetcode.com/problems/intersection-of-three-sorted-arrays/
 */
class IntersectionOfSortedArraysTest {

    @Test
    fun threeSortedArraysTest() {
        val arr1 = intArrayOf(1, 3, 5, 6)
        val arr2 = intArrayOf(1, 2, 5, 7, 9)
        val arr3 = intArrayOf(1, 3, 4, 5, 8)

        val expectedResults = listOf(1, 5)

        val results = IntersectionOfSortedArrays.arraysIntersection(arr1, arr2, arr3)
        assertEquals(expectedResults, results)
    }


    @Test
    fun noIntersectionInArraysTest() {
        val arr1 = intArrayOf(1, 3, 5, 6)
        val arr2 = intArrayOf(2, 7)
        val arr3 = intArrayOf(8)

        val expectedResults = emptyList<Int>()

        val results = IntersectionOfSortedArrays.arraysIntersection(arr1, arr2, arr3)
        assertEquals(expectedResults, results)
    }

}