package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 29/3/2020
 * https://leetcode.com/problems/find-the-duplicate-number/
 */
class FindTheDuplicateNumberTest {

    @Test
    fun example1Test() {
        val array = intArrayOf(1, 3, 4, 2, 2)
        assertMethods(2, array)
    }

    @Test
    fun example2Test() {
        val array = intArrayOf(3, 1, 3, 4, 2)
        assertMethods(3, array)
    }


    fun assertMethods(expectedDuplicate: Int, array: IntArray) {
        TestCase.assertEquals(
            expectedDuplicate,
            FindTheDuplicateNumber.findDuplicate(array)
        )
        TestCase.assertEquals(
            expectedDuplicate,
            FindTheDuplicateNumber.findDuplicateMemory(array)
        )
    }


}