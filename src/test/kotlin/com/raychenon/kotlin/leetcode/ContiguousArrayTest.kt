package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 16/4/2020
 * https://leetcode.com/problems/contiguous-array/
 */
class ContiguousArrayTest {

    @Test
    fun example1Test() {
        assertMethods(2, intArrayOf(0, 1))
    }

    @Test
    fun example2Test() {
        assertMethods(2, intArrayOf(0, 1, 0))
    }

    fun assertMethods(expected: Int, nums: IntArray) {
        TestCase.assertEquals(expected, ContiguousArray.findMaxLength(nums))
        TestCase.assertEquals(expected, ContiguousArray.findMaxLengthBruteForce(nums))
    }

}