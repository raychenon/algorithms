package com.raychenon.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * User: raychenon
 * Date: 2019-10-03
 * https://leetcode.com/problems/find-all-anagrams-in-a-string/
 */
public class FindAllAnagramsInaString {
    /**
     * time complexity: O(n), supposing the method {@link #matches(int[], int[])} is O(1)
     * space complexity: O(1)
     * <p>
     * Find all the start indices of p's anagrams in s.
     *
     * @param s
     * @param p
     * @return
     */
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> startIndexes = new LinkedList<>();
        int[] arrayP = new int[26];
        for (Character c : p.toCharArray()) {
            arrayP[c - 'a']++;
        }
        int[] arrayS = new int[26];
        int lenP = p.length();

        for (int i = 0; i < s.length() - lenP + 1; i++) {
            if (i == 0) {
                for (int j = 0; j < lenP; j++) {
                    arrayS[s.charAt(j) - 'a']++;
                }
            } else {
                char first = s.charAt(i - 1);
                char last = s.charAt(i + lenP - 1);
                if (arrayS[first - 'a'] > 0) {
                    arrayS[first - 'a']--;
                }
                arrayS[last - 'a']++;
            }

            if (matches(arrayP, arrayS)) {
                startIndexes.add(i);
            }
        }
        return startIndexes;
    }

    private boolean matches(int[] count1, int[] count2) {
        for (int i = 0; i < count1.length; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }
}
