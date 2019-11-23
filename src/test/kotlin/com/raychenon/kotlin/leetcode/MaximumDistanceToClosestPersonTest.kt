package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-11-23
 * https://leetcode.com/problems/maximize-distance-to-closest-person
 */
class MaximumDistanceToClosestPersonTest {

    @Test
    fun example1Test() {
        val input = intArrayOf(1, 0, 0, 0, 1, 0, 1)
        //                     <-----|----->
        evaluateMaximumDistanceToClosestPerson(2, input)
    }

    @Test
    fun noOneonRightTest() {
        val input = intArrayOf(1, 0, 0, 0)
        //                     |-------->
        evaluateMaximumDistanceToClosestPerson(3, input)
    }

    @Test
    fun noOneonLeftTest() {
        val input = intArrayOf(0, 0, 0, 1)
        //                     <--------|
        evaluateMaximumDistanceToClosestPerson(3, input)
    }

    @Test
    fun middleEvenTest() {
        val input = intArrayOf(1, 0, 0, 1)
        //                     |--->
        evaluateMaximumDistanceToClosestPerson(1, input)
    }

    @Test
    fun middleOddTest() {
        val input = intArrayOf(1, 0, 0, 0, 1)
        //                     |-----><----|
        evaluateMaximumDistanceToClosestPerson(2, input)
    }

    fun evaluateMaximumDistanceToClosestPerson(expected: Int, seats: IntArray) {
        Assert.assertEquals(expected, MaximumDistanceToClosestPerson.maxDistToClosest(seats))
    }

}