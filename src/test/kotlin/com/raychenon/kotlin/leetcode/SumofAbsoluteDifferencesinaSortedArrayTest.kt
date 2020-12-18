package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 18/12/2020
 * https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/discuss/969761/Illustrations-for-O(n)-formula-Java-Kotlin-Python
 */
class SumofAbsoluteDifferencesinaSortedArrayTest {

    @Test
    fun example1() {
        evaluateSumofAbsoluteDifferencesinaSortedArray(intArrayOf(4, 3, 5), intArrayOf(2, 3, 5))
    }

    @Test
    fun example2() {
        evaluateSumofAbsoluteDifferencesinaSortedArray(intArrayOf(24, 15, 13, 15, 21), intArrayOf(1, 4, 6, 8, 10))
    }

    private fun evaluateSumofAbsoluteDifferencesinaSortedArray(expected: IntArray, input: IntArray) {
        Assert.assertArrayEquals(
            expected,
            SumofAbsoluteDifferencesinaSortedArray.getSumAbsoluteDifferences(input)
        )
    }

}