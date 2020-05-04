package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-09-16
 * https://leetcode.com/problems/ransom-note/
 */
class RansomNoteCharTest {

    @Test
    fun testRansom1() {
        assertRansomConstructMethods(false, "a", "b")
    }

    @Test
    fun testRansom2() {
        assertRansomConstructMethods(false, "aa", "ab")
    }

    @Test
    fun testRansom3() {
        assertRansomConstructMethods(true, "aa", "aab")
    }

    fun assertRansomConstructMethods(expected: Boolean, ransom: String, magazine: String): Unit {
        Assert.assertEquals(expected, RansomNoteChar.canConstruct(ransom, magazine))
        Assert.assertEquals(expected, RansomNoteChar.canConstructArray(ransom, magazine))
    }
}