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

    @Test
    fun example3Test() {
        assertMethods(6, intArrayOf(0, 1, 0, 1, 0, 1))
    }

    @Test
    fun symmetricalTest() {
        assertMethods(6, intArrayOf(0, 0, 0, 1, 1, 1))
    }

    @Test
    fun symmetricalInvertedTest() {
        assertMethods(8, intArrayOf(1, 1, 1, 1, 0, 0, 0, 0, 0))
    }

    @Test
    fun symmetricalMTest() {
        assertMethods(6, intArrayOf(0, 0, 1, 0, 0, 0, 1, 1))
    }

    fun assertMethods(expected: Int, nums: IntArray) {
        TestCase.assertEquals(expected, ContiguousArray.findMaxLengthExtraArray(nums))
        TestCase.assertEquals(expected, ContiguousArray.findMaxLengthBruteForce(nums))
        TestCase.assertEquals(expected, ContiguousArray.findMaxLengthHashMap(nums))
    }

}