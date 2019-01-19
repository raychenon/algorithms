package com.raychenon.kotlin.hackerrank

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 19/1/19
 */
class SherlockAndAnagramsTest {

    @Test
    fun assert_abba() {
        Assert.assertEquals(SherlockAndAnagramsKotlin.sherlockAndAnagrams("abba"), 4)
    }

    @Test
    fun assert_abcd() {
        Assert.assertEquals(SherlockAndAnagramsKotlin.sherlockAndAnagrams("abcd"), 0)
    }

    @Test
    fun assert_ifailuhkqq() {
        Assert.assertEquals(SherlockAndAnagramsKotlin.sherlockAndAnagrams("ifailuhkqq"), 3)
    }

    @Test
    fun assert_kkkk() {
        Assert.assertEquals(SherlockAndAnagramsKotlin.sherlockAndAnagrams("kkkk"), 10)
    }

}