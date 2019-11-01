package com.raychenon.kotlin.leetcode

import junit.framework.Assert.assertEquals
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-11-01
 * https://leetcode.com/problems/climbing-stairs
 */
class ClimbingStairsTest {

    @Test
    fun climb1StairsTest() {
        assertClimbStairs(1, 1)
    }

    @Test
    fun climb2StairsTest() {
        assertClimbStairs(2, 2)
    }

    @Test
    fun climb3StairsTest() {
        assertClimbStairs(3, 3)
    }

    @Test
    fun climb5StairsTest() {
        assertClimbStairs(8, 5)
    }

    @Test
    fun climb7StairsTest() {
        assertClimbStairs(21, 7)
    }


    private fun assertClimbStairs(expected: Int, actual: Int) {
        assertEquals(expected, ClimbingStairs.climbStairsRec(actual))
        assertEquals(expected, ClimbingStairs.climbStairsDynamic(actual))
        assertEquals(expected, ClimbingStairs.climbStairsFibonacci(actual))
        assertEquals(expected, ClimbingStairs.climbStairsFibonacciFormula(actual))
    }
}