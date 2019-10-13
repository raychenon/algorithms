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
        Assert.assertEquals(2, ShortestWaytoFormString.shortestWay("abc", "abcbc"))
    }

    @Test
    fun example2Test() {
        Assert.assertEquals(-1, ShortestWaytoFormString.shortestWay("abc", "acdbc"))
    }

    @Test
    fun example3Test() {
        Assert.assertEquals(3, ShortestWaytoFormString.shortestWay("xyz", "xzyxz"))
    }
}