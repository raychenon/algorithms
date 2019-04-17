package com.raychenon.kotlin.hackerrank.warmup

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 17/4/19
 * https://www.hackerrank.com/challenges/counting-valleys/problem
 */
class CountingValleysTest {

    @Test
    fun assertforLetterARepeatedXTimes() {
        Assert.assertEquals(1, CountingValleys.countingValleys(8, "UDDDUDUU"))
    }

}