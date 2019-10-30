package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 2019-10-29
 * https://leetcode.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefix {

    /**
     * Time Complexity: O(N*n) ~ O(n) , where n is the array length and N is the number of character in a String.
     * Space Complexity: O(1)
     *
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        StringBuilder prefix = new StringBuilder();
        int l = 0;
        while (l < strs[0].length()) {
            for (int i = 0; i < strs.length; i++) {
                if ((l >= strs[i].length()) || (strs[0].charAt(l) != strs[i].charAt(l))) {
                    return prefix.toString();
                }
            }
            prefix.append(strs[0].charAt(l));
            l++;
        }
        return prefix.toString();
    }
}
