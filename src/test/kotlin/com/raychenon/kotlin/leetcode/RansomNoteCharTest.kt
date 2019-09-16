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
        Assert.assertEquals(false, RansomNoteChar.canConstruct("a", "b"))
    }

    @Test
    fun testRansom2() {
        Assert.assertEquals(false, RansomNoteChar.canConstruct("aa", "ab"))
    }

    @Test
    fun testRansom3() {
        Assert.assertEquals(true, RansomNoteChar.canConstruct("aa", "aab"))
    }
}