package com.raychenon.leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * User: raychenon
 * Date: 6/2/2020
 * https://leetcode.com/problems/most-common-word/
 */
public class MostCommonWord {

    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (String ban : banned) {
            map.remove(ban);
        }

        return map.entrySet().stream()
               .max(Comparator.comparing(Map.Entry::getValue)).get().getKey();
    }

}
