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
        var input = intArrayOf(0, 1, 0, 3, 12)
        MoveZeroes.moveZeroes(input)

        Assert.assertArrayEquals(intArrayOf(1, 3, 12, 0, 0), input)
    }

    @Test
    fun moveZeroesTest2() {
        var input = intArrayOf(0, 1, 0, 3, 5, 5, 0, 11, 12)
        MoveZeroes.moveZeroes(input)

        Assert.assertArrayEquals(intArrayOf(1, 3, 5, 5, 11, 12, 0, 0, 0), input)
    }

    @Test
    fun allZeroesBehindTest() {
        val input = intArrayOf(1, 2, 5, 3, 4, 0, 0, 0)
        MoveZeroes.moveZeroes(input)
        Assert.assertArrayEquals(intArrayOf(1, 2, 5, 3, 4, 0, 0, 0), input)
    }

    @Test
    fun allZeroesInFrontTest() {
        val input = intArrayOf(0, 0, 0, 1, 2, 5, 3, 4)
        MoveZeroes.moveZeroes(input)
        Assert.assertArrayEquals(intArrayOf(1, 2, 5, 3, 4, 0, 0, 0), input)
    }

    @Test
    fun OneZeroesInMiddleTest() {
        val input = intArrayOf(1, 2, 5, 0, 3, 22, 4)
        MoveZeroes.moveZeroes(input)
        Assert.assertArrayEquals(intArrayOf(1, 2, 5, 3, 22, 4, 0), input)
    }
}