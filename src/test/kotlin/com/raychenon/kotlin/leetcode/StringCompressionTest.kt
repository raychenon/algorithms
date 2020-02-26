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
        assertEquals(6, StringCompression.compress(charArrayOf('a', 'a', 'a', 'b', 'b', 'c', 'c', 'c')))
    }

}