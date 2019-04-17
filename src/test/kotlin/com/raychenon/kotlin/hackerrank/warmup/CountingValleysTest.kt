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
    fun assertCountOneValley() {
        //      _/\      _
        //         \    /
        //          \/\/
        Assert.assertEquals(1, CountingValleys.countingValleys(8, "UDDDUDUU"))
    }
    
    @Test
    fun assertCountTwoValleys() {
        //      _          /\
        //       \  /\    /
        //        \/  \/\/
        Assert.assertEquals(2, CountingValleys.countingValleys(12, "DDUUDDUDUUUD"))
    }


    @Test
    fun assertCountAnyValleys() {
        Assert.assertEquals(1, CountingValleys.countingValleys(12, "DDanyUUDDUDU"))
    }

}