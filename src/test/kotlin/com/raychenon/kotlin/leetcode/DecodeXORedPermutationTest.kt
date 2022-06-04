package com.raychenon.kotlin.leetcode

import org.junit.Assert.assertArrayEquals
import org.junit.Test

/**
 * User: raychenon
 * Date: 24/1/2021
 * Explanations
 * https://leetcode.com/problems/decode-xored-permutation/discuss/1031840/Explanations-XOR-and-1st-element-Java-Kotlin-Python
 */
class DecodeXORedPermutationTest {

    @Test
    fun decode0Test() {
        decodeTest(intArrayOf(1, 3, 2), intArrayOf(2, 1))
    }

    @Test
    fun decode1Test() {
        decodeTest(intArrayOf(1, 2, 3), intArrayOf(3, 1))
    }

    @Test
    fun decode2Test() {
        decodeTest(intArrayOf(2, 4, 1, 5, 3), intArrayOf(6, 5, 4, 6))
    }

    @Test
    fun decode3Test() {
        decodeTest(intArrayOf(6, 1, 4, 2, 9, 7, 8, 3, 5), intArrayOf(7, 5, 6, 11, 14, 15, 11, 6))
    }

    @Test
    fun decode4Test() {
        decodeTest(intArrayOf(6, 4, 2, 1, 5, 3, 7, 8, 9), intArrayOf(2, 6, 3, 4, 6, 4, 15, 1))
    }

    fun decodeTest(perm: IntArray, encoded: IntArray) {
        assertArrayEquals(perm, DecodeXORedPermutation.decode(encoded))
    }

}