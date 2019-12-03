package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-12-03
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Given a string, find the length of the longest substring without repeating characters.
 */
object LongestSubstringWithoutRepeatingCharacters {

    fun lengthOfLongestSubstring(s: String): Int {
        var start = 0
        var end = start

        var map = mutableMapOf<Char, Int>()

        var c = s[0]
        map.put(c, 1)
        var maxLen = 0
        for (i in 1..s.length - 1) {
            if (map.containsKey(s[i])) {
                end = i
                maxLen = Math.max(maxLen, end - start)
            }

            // equal to previous char
            if (c == s[i]) {
                start = i
            }

            map.put(s[i], map.getOrDefault(s[i], 0) + 1)
            c = s[i]
        }

        return maxLen

    }
}