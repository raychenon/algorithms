package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-12-03
 * https://leetcode.com/problems/longest-substring-without-repeating-characters
 */
class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    fun sexample1Test() {
        Assert.assertEquals(3, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"))
    }

    @Test
    fun example2Test() {
        Assert.assertEquals(1, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb"))
    }

    @Test
    fun example3Test() {
        Assert.assertEquals(3, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew"))
    }


}