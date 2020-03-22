package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 19/3/2020
 * https://leetcode.com/problems/move-zeroes
 */
class MoveZeroesTest {

    @Test
    fun moveZeroesTest() {
        val input = intArrayOf(0, 1, 0, 3, 12)
        testWithVariousSolutions(intArrayOf(1, 3, 12, 0, 0), input)
    }

    @Test
    fun moveZeroesTest2() {
        val input = intArrayOf(0, 1, 0, 3, 5, 5, 0, 11, 12)
        testWithVariousSolutions(intArrayOf(1, 3, 5, 5, 11, 12, 0, 0, 0), input)
    }

    @Test
    fun allZeroesBehindTest() {
        val input = intArrayOf(1, 2, 5, 3, 4, 0, 0, 0)
        testWithVariousSolutions(intArrayOf(1, 2, 5, 3, 4, 0, 0, 0), input)
    }

    @Test
    fun allZeroesInFrontTest() {
        val input = intArrayOf(0, 0, 0, 1, 2, 5, 3, 4)
        testWithVariousSolutions(intArrayOf(1, 2, 5, 3, 4, 0, 0, 0), input)
    }

    @Test
    fun OneZeroesInMiddleTest() {
        val input = intArrayOf(1, 2, 5, 0, 3, 22, 4)
        testWithVariousSolutions(intArrayOf(1, 2, 5, 3, 22, 4, 0), input)
    }

    fun testWithVariousSolutions( expected: IntArray,input: IntArray): Unit{
        val input1 = input.copyOf()
        MoveZeroes.moveZeroes(input1)
        Assert.assertArrayEquals(expected, input1)

        val input2 = input.copyOf()
        MoveZeroes.moveZeroesLeetcodeSolution3(input2)
        Assert.assertArrayEquals(expected, input2)
    }
}