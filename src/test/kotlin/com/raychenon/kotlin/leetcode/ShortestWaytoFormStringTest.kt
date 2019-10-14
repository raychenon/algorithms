package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-10-13
 * https://leetcode.com/problems/shortest-way-to-form-string/
 */
class ShortestWaytoFormStringTest {

    @Test
    fun example1Test() {
        assertShortestWayMethods(2, "abc", "abcbc")
    }

    @Test
    fun example2Test() {
        assertShortestWayMethods(-1, "abc", "acdbc")
    }

    @Test
    fun example3Test() {
        assertShortestWayMethods(3, "xyz", "xzyxz")
    }

    @Test
    fun duplicateCharInSourceTest() {
        // aab ab ab aaa a
        assertShortestWayMethods(5, "aaab", "aabababaaaa")
    }
    
    fun assertShortestWayMethods(expected: Int, source: String, target: String) {
        Assert.assertEquals(expected, ShortestWaytoFormString.shortestWayPointers(source, target))
        Assert.assertEquals(expected, ShortestWaytoFormString.shortestWayInvertedIndex(source, target))
    }
}