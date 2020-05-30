package com.raychenon.kotlin.leetcode

import com.raychenon.leetcode.KClosestPointsToOrigin
import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 30/5/2020
 * https://leetcode.com/problems/k-closest-points-to-origin/
 */
class KClosestPointsToOriginTest {

    @Test
    fun example1Test() {
        TestCase.assertEquals(
            arrayOf(intArrayOf(-2, 2)),
            KClosestPointsToOrigin.kClosestOriginal(arrayOf(intArrayOf(1, 3), intArrayOf(-2, 2)), 1)
        )
    }

    @Test
    fun example2Test() {
        TestCase.assertEquals(
            arrayOf(intArrayOf(3, 3), intArrayOf(-2, 4)),
            KClosestPointsToOrigin.kClosestOriginal(arrayOf(intArrayOf(3, 3), intArrayOf(5, -1), intArrayOf(-2, 4)), 2)
        )
    }

}