package com.raychenon.leetcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * User: raychenon
 * Date: 2019-09-10
 * https://leetcode.com/problems/group-anagrams/
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (int i = 0; i < strs.length; i++) {

            String current = strs[i];

            // sort string
            String signature = sort(current);

            if (map.containsKey(signature)) {
                List<String> list = map.get(signature);
                list.add(current);
                map.put(signature, list);
            } else {
                LinkedList<String> list = new LinkedList<String>();
                list.add(current);
                map.put(signature, list);
            }
        }
        return map.values().stream().collect(Collectors.toList());
    }

    private String sort(String str){
        char temp[] = str.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
}
