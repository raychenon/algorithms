package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test
import java.util.*

/**
 * User: raychenon
 * Date: 2019-10-19
 * https://leetcode.com/problems/sort-array-by-parity/
 */
class SortArrayByParityTest {

    @Test
    fun example1Test() {
        Assert.assertTrue(
            Arrays.equals(
                intArrayOf(2, 4, 3, 1),
                SortArrayByParity.sortArrayByParity(intArrayOf(3, 1, 2, 4))
            )
        )

    }

    @Test
    fun example1ConstantSpaceTest() {
        Assert.assertTrue(
            Arrays.equals(
                intArrayOf(4, 2, 1, 3),
                SortArrayByParity.sortArrayByParityInPlace(intArrayOf(3, 1, 2, 4))
            )
        )
    }

}