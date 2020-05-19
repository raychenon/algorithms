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

    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int[] dict1 = new int[]{26}; // 26 letters in alphabets in lower case

        for (char c : s1.toCharArray()) {
            dict1[c - 'a']++;
        }

        int n2 = s2.length();
        int[] dict2 = new int[]{26};
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