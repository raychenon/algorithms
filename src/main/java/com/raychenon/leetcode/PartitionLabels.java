package com.raychenon.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * User: raychenon
 * Date: 4/9/2020
 * https://leetcode.com/problems/partition-labels/
 */
public class PartitionLabels {

    /**
     * Time Complexity O(n)
     * Space Complexity O(1)
     * @param S
     * @return
     */
    public List<Integer> partitionLabels(String S) {
        Map<Character, Integer> last = new HashMap<Character, Integer>();
        for (int i = 0; i < S.length(); i++) {
            last.put(S.charAt(i), i);
        }

        int j = 0;
        int anchor = 0;
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < S.length(); i++) {
            j = Math.max(j, last.getOrDefault(S.charAt(i), 0));
            if (i == j) {
                list.add(i - anchor + 1);
                anchor = i + 1;
            }
        }
        return list;
    }
}
