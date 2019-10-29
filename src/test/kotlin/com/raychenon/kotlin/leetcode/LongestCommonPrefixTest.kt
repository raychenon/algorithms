package com.raychenon.kotlin.leetcode

import junit.framework.Assert.assertEquals
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-10-29
 * https://leetcode.com/problems/longest-common-prefix/
 */
class LongestCommonPrefixTest {
    
    @Test
    fun flPrefixTest() {
        val input = arrayOf("flower", "flow", "flight")
        assertEquals("fl", LongestCommonPrefix.longestCommonPrefix(input))
    }

    @Test
    fun shorterStringTest() {
        val input = arrayOf("aa", "a", "aab")
        assertEquals("a", LongestCommonPrefix.longestCommonPrefix(input))
    }

    @Test
    fun noCommonPrefixTest() {
        val input = arrayOf("dog", "racecar", "car")
        assertEquals("", LongestCommonPrefix.longestCommonPrefix(input))
    }

    @Test
    fun emptyArrayTest() {
        val input = arrayOf<String>()
        assertEquals("", LongestCommonPrefix.longestCommonPrefix(input))
    }
}