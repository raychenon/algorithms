package com.raychenon.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * User: raychenon
 * Date: 2019-10-08
 * https://leetcode.com/problems/longest-arithmetic-subsequence-of-given-difference/
 */
public class LongestArithmeticSubsequenceofGivenDifference {
    
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> map = new HashMap<>();

        int longest = 1;
        for (int a : arr) {
            map.put(a, map.getOrDefault(a - difference, 0) + 1);
            longest = Math.max(longest, map.get(a));
        }
        return longest;
    }
}
