package com.raychenon.kotlin.hackerrank.heap

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 3/2/19
 * https://www.hackerrank.com/challenges/jesse-and-cookies/problem
 */
class CookiesSeweetnessTest {

    @Test
    fun assertNbOperations4Cookie() {
        val orderedArr = intArrayOf(1, 2, 3, 9, 10, 12).toTypedArray()
        Assert.assertEquals(CookiesSweetnessKotlin.cookies(7, orderedArr), 2)

        val unorderedArr = intArrayOf(12, 3, 2, 9, 10, 1).toTypedArray()
        Assert.assertEquals(CookiesSweetnessKotlin.cookies(7, unorderedArr).toLong(), 2)


        val biggerArr = intArrayOf(13, 47, 74, 12, 89, 74, 18, 38).toTypedArray()
        Assert.assertEquals(CookiesSweetnessKotlin.cookies(90, biggerArr).toLong(), 5)
    }

    @Test
    fun assertEmptyCookie() {
        val emptyArr = intArrayOf().toTypedArray()
        Assert.assertEquals(CookiesSweetnessKotlin.cookies(7, emptyArr).toLong(), -1)
        Assert.assertEquals(CookiesSweetnessKotlin.cookies(0, emptyArr).toLong(), -1)
    }
}