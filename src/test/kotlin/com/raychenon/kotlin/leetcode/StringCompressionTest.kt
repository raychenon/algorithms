package com.raychenon.kotlin.leetcode

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * User: raychenon
 * Date: 26/2/2020
 * https://leetcode.com/problems/string-compression/
 */
class StringCompressionTest {

    @Test
    fun aabbcccTest() {
        assertEquals(6, StringCompression.compress(charArrayOf('a', 'a', 'b', 'b', 'c', 'c', 'c')))
    }

    @Test
    fun aabbaaaTest() {
        assertEquals(6, StringCompression.compress(charArrayOf('a', 'a', 'b', 'b', 'a', 'a', 'a')))
    }

    @Test
    fun aabbaaadeTest() {
        assertEquals(8, StringCompression.compress(charArrayOf('a', 'a', 'b', 'b', 'a', 'a', 'a', 'd', 'e')))
    }

    @Test
    fun moreThan10TimesTest() {
        // 11 times, "z10"
        assertEquals(3, StringCompression.compress(charArrayOf('z', 'z', 'z', 'z', 'z', 'z', 'z', 'z', 'z', 'z')))
    }


    @Test
    fun aTest() {
        assertEquals(1, StringCompression.compress(charArrayOf('a')))
    }

    @Test
    fun emptyCharTest() {
        assertEquals(0, StringCompression.compress(charArrayOf()))
    }

}