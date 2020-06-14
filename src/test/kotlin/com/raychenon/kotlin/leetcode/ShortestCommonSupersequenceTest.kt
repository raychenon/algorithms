package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 13/6/2020
 * https://leetcode.com/problems/shortest-common-supersequence/
 */
class ShortestCommonSupersequenceTest {


    @Test
    fun example1Test() {
        TestCase.assertEquals(
            "cabac",
            ShortestCommonSupersequence.shortestCommonSupersequence("abac", "cab")
        )
    }

}