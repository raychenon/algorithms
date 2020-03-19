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
        Assert.assertEquals(intArrayOf(1, 3, 12, 0, 0), input)
    }

}