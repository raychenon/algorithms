package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-09-29
 * https://leetcode.com/problems/longest-palindromic-substring/
 */
object LongestPalindromicSubstring {


    /**
     * time complexity: O(n^2). Single for loop + while loop in {@link #expandAroundCenter}
     * space complexity: O(1)
     *
     * @param s
     * @return longest palindrome
     */
    fun longestPalindrome(s: String): String {
        if (s.isEmpty()) return ""

        var start = 0
        var end = 0
        for (i in 0 until s.length) {
            // max length between
            // - palindrome with odd length: [ |i| ]
            // - palindrome with even length: [ |i|i+1| ]
            val len = Math.max(lengthFromTheCenter(s, i, i), lengthFromTheCenter(s, i, i + 1))
            if (len > end - start) {
                start = i - (len - 1) / 2
                end = i + len / 2
            }
        }
        return s.substring(start, end + 1)
    }

    /**
     * \ \start\ \ \i\ \ \ \end|
     *          <---  ----->
     *          |--length--|
     */
    private fun lengthFromTheCenter(s: String, start: Int, end: Int): Int {
        var left = start
        var right = end
        while (left >= 0 && right < s.length && s[left] == s[right]) {
            left--
            right++
        }
        return right - left - 1
    }
}