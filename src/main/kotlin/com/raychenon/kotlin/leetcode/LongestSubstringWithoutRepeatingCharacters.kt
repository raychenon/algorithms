package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-12-03
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Given a string, find the length of the longest substring without repeating characters.
 */
object LongestSubstringWithoutRepeatingCharacters {

    /**
     *
     * time complexity: O(n).
     * space complexity: O(min(string_length,alphabet_count)),
     * if the string is longer than 26 (total of aplhabet letters), then the string repeats characters
     *
     */
    fun lengthOfLongestSubstring(s: String): Int {
        var start = 0
        var end = start

        var set = mutableSetOf<Char>()  // Set for current substring
        var maxLen = 0
        while (start < s.length && end < s.length) {
            if (!set.contains(s[end])) {
                set.add(s[end++])
                maxLen = Math.max(maxLen, end - start)
            } else {
                set.remove(s[start++])
            }
        }

        return maxLen

    }
}