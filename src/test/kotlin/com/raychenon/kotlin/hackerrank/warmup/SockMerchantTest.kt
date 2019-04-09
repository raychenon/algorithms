package com.raychenon.kotlin.hackerrank.warmup

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 8/4/19
 * https://www.hackerrank.com/challenges/sock-merchant/problem
 */
class SockMerchantTest {

    @Test
    fun assertEachDifferent() {
        Assert.assertEquals(0, SockMerchant.sockMerchant(intArrayOf(1, 2, 3, 9, 10, 12).toTypedArray()))
    }

    @Test
    fun assertPairingSock1() {
        Assert.assertEquals(3, SockMerchant.sockMerchant(intArrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20).toTypedArray()))
    }

    @Test
    fun assertPairingSock2() {
        Assert.assertEquals(4, SockMerchant.sockMerchant(intArrayOf(1, 1, 3, 1, 2, 1, 3, 3, 3, 3).toTypedArray()))
    }

    @Test
    fun assertEmpty() {
        Assert.assertEquals(0, SockMerchant.sockMerchant(emptyArray<Int>()))
    }


}