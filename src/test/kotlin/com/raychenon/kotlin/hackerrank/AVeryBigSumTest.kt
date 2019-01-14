package com.raychenon.kotlin.hackerrank

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 14/1/19
 */
class AVeryBigSumTest {

    @Test
    fun evaluateSums(){
        Assert.assertEquals(AVeryBigSumKotlin.aVeryBigSum(longArrayOf(1, 2, 3, 4, 5).toTypedArray()), 15)
        Assert.assertEquals(AVeryBigSumKotlin.aVeryBigSum(longArrayOf(6, 7, 8, 9,10).toTypedArray()), 40)
        Assert.assertEquals(AVeryBigSumKotlin.aVeryBigSum(longArrayOf(1000000001, 1000000002, 1000000003, 1000000004, 1000000005).toTypedArray()), 5000000015)
    }

    @Test
    fun evaluateCountSums(){

        Assert.assertEquals(AVeryBigSumKotlin.aVeryBigSum(LongArray(100){i -> 1}.toTypedArray()), 100)

        Assert.assertEquals(AVeryBigSumKotlin.aVeryBigSum(LongArray(100){i -> 2}.toTypedArray()), 200)
    }
}