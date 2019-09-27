package com.raychenon.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * User: raychenon
 * Date: 2019-09-10
 * https://leetcode.com/problems/group-anagrams/
 */
public class GroupAnagrams {

    /**
     * Time Complexity: O(N*K), where N is the lenght of "strs", K is maximum lenght of a string in "strs"
     * Space Complexity: O(N*K)
     *
     * @param strs
     * @return
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (int i = 0; i < strs.length; i++) {

            String current = strs[i];

            // Categorize by Count
            String signature = categoryByCount(current);

            if (!map.containsKey(signature)) {
                map.put(signature, new LinkedList());
            }
            map.get(signature).add(current);
        }

        return map.values().stream().collect(Collectors.toList());
    }

    /**
     * Two words are anagram if their frequency of letter is the same.
     * Comparing arrays with same values are not equal. Thus the arrays are converted in String
     *
     * @param str
     * @return String representing an array of letter in each frequency
     */
    private String categoryByCount(String str) {
        int[] count = new int[26];
        for (char c : str.toCharArray()) {
            count[c - 'a']++;

        }
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < 26; i++) {
            sb.append(count[i]);
        }
        return sb.toString();
    }
}
