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
        val array = intArrayOf(0,0,1,1,1,2,2,3,3,4)
        val size = RemoveDuplicatesSortedArray.removeDuplicates(array)
        Assert.assertEquals(5, size)
    }
    
    @Test
    fun testArrayContainsNoDuplicates() {
        val array = intArrayOf(0,0,1,1,1,2,2,3,3,4)
        val size = RemoveDuplicatesSortedArray.removeDuplicates(array)
        Assert.assertEquals(0, array.get(0))
        Assert.assertEquals(1, array.get(1))
        Assert.assertEquals(2, array.get(2))
        Assert.assertEquals(3, array.get(3))
    }
}