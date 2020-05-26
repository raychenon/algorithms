package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 26/5/2020
 * https://leetcode.com/problems/uncrossed-lines/
 */
class UncrossedLinesTest {

    @Test
    fun example1Test() {
        assertUncrossedLines(2, intArrayOf(1, 4, 2), intArrayOf(1, 2, 4))
    }

    @Test
    fun example2Test() {
        assertUncrossedLines(3, intArrayOf(2, 5, 1, 2, 5), intArrayOf(10, 5, 2, 1, 5, 2))
    }

    @Test
    fun example3Test() {
        assertUncrossedLines(2, intArrayOf(1, 3, 7, 1, 7, 5), intArrayOf(1, 9, 2, 5, 1))
    }

    fun assertUncrossedLines(expected: Int, A: IntArray, B: IntArray) {
        TestCase.assertEquals(expected, UncrossedLines.maxUncrossedLines(A, B))
    }
}