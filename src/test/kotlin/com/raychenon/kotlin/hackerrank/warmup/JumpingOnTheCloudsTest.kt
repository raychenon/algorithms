package com.raychenon.kotlin.hackerrank.warmup

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-04-28
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
 */
class JumpingOnTheCloudsTest {

    @Test
    fun assertSample0() {
        Assert.assertEquals(4, JumpingOnTheClouds.jumpingOnClouds(arrayOf(0, 0, 1, 0, 0, 1, 0)))
    }

    @Test
    fun assertSample1() {
        Assert.assertEquals(3, JumpingOnTheClouds.jumpingOnClouds(arrayOf(0, 0, 0, 1, 0, 0)))
    }

    @Test
    fun assertOnlyCloudsSizeEven() {
        Assert.assertEquals(3, JumpingOnTheClouds.jumpingOnClouds(arrayOf(0, 0, 0, 0, 0, 0)))
    }
}