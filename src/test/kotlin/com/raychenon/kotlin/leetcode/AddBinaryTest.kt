package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 4/3/2020
 * https://leetcode.com/problems/add-binary/
 */
class AddBinaryTest {

    @Test
    fun test_100() {
        TestCase.assertEquals("100", AddBinary.addBinary("11", "1"))
    }

    @Test
    fun test_10101() {
        TestCase.assertEquals("10101", AddBinary.addBinary("1010", "1011"))
    }
}