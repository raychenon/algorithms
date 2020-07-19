package com.raychenon.kotlin.leetcode

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.Test
import java.util.*

/**
 * User: raychenon
 * Date: 11/7/2020
 * https://leetcode.com/problems/3sum/
 */
class ThreeSumTest {

    @Test
    fun example1Test() {
        threeSumEval(
            Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
            ), intArrayOf(-1, 0, 1, 2, -1, -4)
        )
    }

    @Test
    fun example2Test() {
        threeSumEval(
            Arrays.asList(Arrays.asList(-5, 2, 3)),
            intArrayOf(-1, 3, 2, 1, -5, 5)
        )
    }

    @Test
    fun lessThan3elementsTest() {
        threeSumEval(Arrays.asList(), intArrayOf(-1, 0))
    }

    @Test
    fun binarySearchCoverageTest() {
        threeSumEval(
            Arrays.asList(
                Arrays.asList(-2, -1, 3),
                Arrays.asList(-1, -1, 2)
            ), intArrayOf(2, -2, -1, -1, -1, 1, 3)
        )
    }


    private fun threeSumEval(expected: List<List<Int>>, nums: IntArray) {
        val actual = ThreeSum.threeSum(nums)
        MatcherAssert.assertThat(expected, CoreMatchers.`is`(actual))
    }
}