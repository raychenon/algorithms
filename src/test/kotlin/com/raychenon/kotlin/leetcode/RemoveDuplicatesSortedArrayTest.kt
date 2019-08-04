package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-08-04
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
class RemoveDuplicatesSortedArrayTest {

    @Test
    fun testArraySize() {
        val array = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        val size = RemoveDuplicatesSortedArray.removeDuplicates(array)
        Assert.assertEquals(5, size)
        Assert.assertEquals(10, array.size)
    }

    @Test
    fun testArrayContainsNoDuplicatesInFirstElements() {
        val array = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        val size = RemoveDuplicatesSortedArray.removeDuplicates(array)
        Assert.assertEquals(0, array.get(0))
        Assert.assertEquals(1, array.get(1))
        Assert.assertEquals(2, array.get(2))
        Assert.assertEquals(3, array.get(3))
        Assert.assertEquals(4, array.get(4))
        Assert.assertEquals(5, size)
    }

    @Test
    fun testEmptyArray() {
        val array = intArrayOf()
        val size = RemoveDuplicatesSortedArray.removeDuplicates(array)
        Assert.assertEquals(0, size)
    }

    @Test
    fun testArraySize1() {
        val array = intArrayOf(1)
        val size = RemoveDuplicatesSortedArray.removeDuplicates(array)
        Assert.assertEquals(1, size)
    }
}