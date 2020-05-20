package com.raychenon.leetcode;

import java.util.Arrays;

/**
 * User: raychenon
 * Date: 19/5/2020
 * https://leetcode.com/problems/permutation-in-string/
 * <p>
 * Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1.
 * In other words, one of the first string's permutations is the substring of the second string.
 */
public class PermutationinString {

    /**
     * +
     * Use a sliding window to compare the frequencies of letters.
     * If the the signature (frequencies of letters) match in this window, then a permutation of s1 is included in s2.
     * <p>
     * ex: s1 = "ab" , s2 = "eidbaooo"
     * |ei|dbaooo      index = 0, s2.charAt(0) == 'e'
     * |ab|----->
     * <p>
     * eid|ba|ooo      index = 3, s2.charAt(3) == 'b'
     * ---|ab|-->      to calculate the signature, 'd' is decremented from the previous window
     * dict("ba") == currentDict =  currentDict + dict('a') - dict('d')
     * <p>
     * In order to move the window to the right, the previous letter has to be removed from the signature
     *
     * @param s1
     * @param s2
     * @return
     */
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int[] dict1 = new int[26]; // 26 letters in alphabets in lower case

        for (char c : s1.toCharArray()) {
            dict1[c - 'a']++;
        }

        int n2 = s2.length();
        int[] dict2 = new int[26];
        for (int i = 0; i < n2; i++) {
            dict2[s2.charAt(i) - 'a']++;

            // remove the first letter
            if (i >= n1) {
                dict2[s2.charAt(i - n1) - 'a']--;
            }

            if (Arrays.equals(dict1, dict2)) return true;
        }

        return false;
    }

}