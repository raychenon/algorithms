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
        TestCase.assertEquals(2, ContiguousArray.findMaxLength(intArrayOf(0, 1)))
    }

    @Test
    fun example2Test() {
        TestCase.assertEquals(2, ContiguousArray.findMaxLength(intArrayOf(0, 1, 0)))
    }


}