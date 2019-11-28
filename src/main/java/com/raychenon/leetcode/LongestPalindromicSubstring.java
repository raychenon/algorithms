package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 2019-09-29
 * https://leetcode.com/problems/longest-palindromic-substring/
 */
public class LongestPalindromicSubstring {

    /**
     * time complexity: O(n^2). Single for loop + while loop in {@link #expandAroundCenter}
     * space complexity: O(1)
     *
     * @param s
     * @return longest palindrome
     */
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0;
        int end = 0;
        for (int center = 0; center < s.length(); center++) {
            int len1 = expandAroundCenter(s, center, center);           // s length is odd
            int len2 = expandAroundCenter(s, center, center + 1);  // s length is even
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = center - (len - 1) / 2;
                end = center + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    /**
     * \ \start\ \ \i\ \ \ \end|
     *          <---  ----->
     *          |--length--|
     */
    private int expandAroundCenter(String s, int start, int end) {
        int left = start, right = end;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
