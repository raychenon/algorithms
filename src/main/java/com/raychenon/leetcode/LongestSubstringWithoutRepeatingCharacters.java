package com.raychenon.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * User: raychenon
 * Date: 2019-12-03
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubstringWithoutRepeatingCharacters {

    /**
     * time complexity: O(n).
     * space complexity: O(min(string_length,alphabet_count)),
     * if the string is longer than 26 (total of aplhabet letters), then the string repeats characters
     */
    public int lengthOfLongestSubstring(String s) {
        int start = 0, end = 0;
        int maxLen = 0;
        Set<Character> charsInCurrentSubStringSet = new HashSet<>();
        while (start < s.length() && end < s.length()) {
            if (!charsInCurrentSubStringSet.contains(s.charAt(end))) {
                charsInCurrentSubStringSet.add(s.charAt(end++));
                maxLen = Math.max(maxLen, end - start);
            } else {
                charsInCurrentSubStringSet.remove(s.charAt(start++));
            }
        }
        return maxLen;
    }
}
