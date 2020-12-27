package com.raychenon.kotlin.leetcode.jump

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 27/12/2020
 * https://leetcode.com/problems/jump-game-iv/
 */
class JumpGameIVTest {

    @Test
    fun exampleJumpGameIV1() {
        evaluateJumpGameIV(3, intArrayOf(100, -23, -23, 404, 100, 23, 23, 23, 3, 404))
    }

    @Test
    fun exampleJumpGameIV2() {
        evaluateJumpGameIV(0, intArrayOf(7))
    }

    @Test
    fun exampleJumpGameIV3() {
        evaluateJumpGameIV(1, intArrayOf(7, 6, 9, 6, 9, 6, 9, 7))
    }

    @Test
    fun exampleJumpGameIV4() {
        evaluateJumpGameIV(2, intArrayOf(6, 1, 9))
    }

    @Test
    fun exampleJumpGameIV5() {
        evaluateJumpGameIV(3, intArrayOf(11, 22, 7, 7, 7, 7, 7, 7, 7, 22, 13))
    }

    fun evaluateJumpGameIV(expectedNumberOfSteps: Int, arr: IntArray) {
        Assert.assertEquals(expectedNumberOfSteps, JumpGameIV.minJumps(arr))
    }

}