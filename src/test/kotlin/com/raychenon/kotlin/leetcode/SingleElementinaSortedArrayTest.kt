package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 14/5/2020
 * https://leetcode.com/problems/single-element-in-a-sorted-array/
 */
class SingleElementinaSortedArrayTest {

    @Test
    fun example1Test() {
        assertSingleNonDuplicateMethods(2, intArrayOf(1, 1, 2, 3, 3, 4, 4, 8, 8))
    }

    @Test
    fun example2Test() {
        assertSingleNonDuplicateMethods(10, intArrayOf(3, 3, 7, 7, 10, 11, 11))
    }

    @Test
    fun exampleSingleAtLastTest() {
        assertSingleNonDuplicateMethods(12, intArrayOf(3, 3, 7, 7, 11, 11, 12))
    }

    fun assertSingleNonDuplicateMethods(expectedValue: Int, nums: IntArray) {
        TestCase.assertEquals(
            expectedValue,
            SingleElementinaSortedArray.singleNonDuplicateBrut(nums)
        )
    }


}