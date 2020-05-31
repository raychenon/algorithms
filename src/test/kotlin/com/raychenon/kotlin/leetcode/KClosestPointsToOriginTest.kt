package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 30/5/2020
 * https://leetcode.com/problems/k-closest-points-to-origin/
 */
class KClosestPointsToOriginTest {

    @Test
    fun example1Test() {
        evaluatekClosest(
            arrayOf(intArrayOf(-2, 2)),
            arrayOf(intArrayOf(1, 3), intArrayOf(-2, 2)), 1
        )
    }

    @Test
    fun example2Test() {
        evaluatekClosest(
            arrayOf(intArrayOf(3, 3), intArrayOf(-2, 4)),
            arrayOf(intArrayOf(3, 3), intArrayOf(5, -1), intArrayOf(-2, 4)), 2
        )
    }

    @Test
    fun exampleSameDistanceTest() {
        evaluatekClosest(
            arrayOf(intArrayOf(1, 1), intArrayOf(-1, 1)),
            arrayOf(
                intArrayOf(1, 1),
                intArrayOf(3, 3),
                intArrayOf(5, -1),
                intArrayOf(-1, 1),
                intArrayOf(-2, 4)
            ), 2
        )
    }

    fun evaluatekClosest(expected: Array<IntArray>, points: Array<IntArray>, K: Int): Unit {
        Assert.assertArrayEquals(
            expected,
            KClosestPointsToOrigin.kClosestOriginal(points, K)
        )
        Assert.assertArrayEquals(
            expected,
            KClosestPointsToOrigin.kClosest(points, K)
        )

    }


}