package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 1/3/2020
 * https://leetcode.com/problems/string-compression/
 */
public class StringCompression {

    /**
     * time complexity : O(n)
     * space complexity: O(1) , use the chars input to store the data
     *
     * @param chars
     * @return
     */
    public int compress(char[] chars) {
        int anchor = 0, write = 0;
        int size = chars.length;
        for (int i = 0; i < size; i++) {
            if (i + 1 == size || chars[i + 1] != chars[i]) {
                chars[write++] = chars[anchor];
                if (i > anchor) {
                    for (char c : ("" + (i - anchor + 1)).toCharArray()) {
                        chars[write++] = c;
                    }
                }
                anchor = i + 1;
            }
        }
        return write;
    }
}
