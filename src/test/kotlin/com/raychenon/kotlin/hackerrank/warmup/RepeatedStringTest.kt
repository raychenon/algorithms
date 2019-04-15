package com.raychenon.kotlin.hackerrank.warmup

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 14/4/19
 * https://www.hackerrank.com/challenges/repeated-string/problem
 */
class RepeatedStringTest {

    @Test
    fun assertforLetterARepeatedXTimes() {
        Assert.assertEquals(10000000000000, RepeatedString.repeatedString("a", 10000000000000))
    }

    @Test
    fun assertForStrinNotContainingA() {
        Assert.assertEquals(0, RepeatedString.repeatedString("bcdf", 1343))
    }

    @Test
    fun assertPairingSock2() {
        Assert.assertEquals(7, RepeatedString.repeatedString("aba", 10))
    }

    @Test
    fun assertEmpty() {
        Assert.assertEquals(2, RepeatedString.repeatedString("avatar", 3))
    }
}