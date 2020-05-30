package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 29/5/2020
 * https://leetcode.com/problems/possible-bipartition/
 */
class PossibleBipartitionTest {

    @Test
    fun testExample1() {
        // 1 -> 3
        // 1 -> 2
        // 4  /
        val dislikes = arrayOf(intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(2, 4))
        TestCase.assertEquals(
            true,
            PossibleBipartition.possibleBipartition(4, dislikes)
        )
    }

    @Test
    fun testExample2() {
        // 1 - 2
        //  |  |
        //   \ 3
        val dislikes = arrayOf(intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(2, 3))
        TestCase.assertEquals(
            false,
            PossibleBipartition.possibleBipartition(3, dislikes)
        )
    }

    @Test
    fun testExample3() {
        // 1 - 2
        // 3 - 2
        // 3 - 4
        // 5 - 4
        // 1 - 5 , wrong 5 is already in the same group(or color) of 1
        val dislikes =
            arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4), intArrayOf(4, 5), intArrayOf(1, 5))
        TestCase.assertEquals(
            false,
            PossibleBipartition.possibleBipartition(5, dislikes)
        )
    }

}