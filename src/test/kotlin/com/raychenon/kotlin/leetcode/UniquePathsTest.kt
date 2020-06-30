package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 30/6/2020
 * https://leetcode.com/problems/unique-paths/
 */
class UniquePathsTest {

    @Test
    fun example1Test() {
        assertUniquePaths(3, 3, 2)
    }

    @Test
    fun example2Test() {
        assertUniquePaths(28, 7, 3)
    }

    @Test
    fun example3Test() {
        assertUniquePaths(48620, 10, 10)
    }


    fun assertUniquePaths(expected: Int, m: Int, n: Int) {
        TestCase.assertEquals(expected, UniquePaths.uniquePathsRecursive(m, n))
    }
}