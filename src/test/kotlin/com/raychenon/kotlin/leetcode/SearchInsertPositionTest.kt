package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-07-13
 * https://leetcode.com/problems/search-insert-position/submissions/
 */
class SearchInsertPositionTest {

    @Test
    fun testSearchInsert_WhenInArrayIsEmpty() {
        val position = SearchInsertPosition.searchInsert(intArrayOf(), 5)
        Assert.assertEquals(0, position)
    }

    @Test
    fun testSearchInsert_WhenTargetIsInArray() {
        val position = intArrayOf(1, 3, 5, 6).searchInsert(5)
        Assert.assertEquals(2, position)
    }

    @Test
    fun testSearchInsert_WhenTargetNotInArray() {
        val position = SearchInsertPosition.searchInsert(intArrayOf(1, 3, 5, 6), 2)
        Assert.assertEquals(1, position)
    }

    @Test
    fun testSearchInsert_WhenTargetIsBiggerThanArrayMax() {
        val position = SearchInsertPosition.searchInsert(intArrayOf(1, 3, 5, 6), 7)
        Assert.assertEquals(4, position)
    }

    @Test
    fun testSearchInsert_WhenTargetIsSmallerThanArrayMin() {
        val position = SearchInsertPosition.searchInsert(intArrayOf(1, 3, 5, 6), 0)
        Assert.assertEquals(0, position)
    }

}