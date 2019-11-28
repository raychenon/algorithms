package com.raychenon.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * User: raychenon
 * Date: 2019-11-06
 * https://leetcode.com/problems/custom-sort-string/
 */
public class CustomSortString {

    /**
     * Time complexity: O(S.length + T.length)
     * Space complexity: O(T.length)
     *
     * @param S
     * @param T
     * @return
     */
    public String customSortString(String S, String T) {
        Map<Character, Integer> map = new HashMap<>();

        // create a map frequency of chars for T
        for (Character c : T.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder str = new StringBuilder();

        // append all chars in S
        for (Character c : S.toCharArray()) {
            if (map.containsKey(c)) {
                for (int i = 0; i < map.getOrDefault(c, 0); i++) {
                    str.append(c);
                }
            }
            map.remove(c);
        }

        // append the remaining chars in T
        // How keys in Map are "magically" sorted in right alphabetical order ?
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                str.append(entry.getKey());
            }
        }

        return str.toString();

    }
}
