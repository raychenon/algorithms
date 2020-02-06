package com.raychenon.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * User: raychenon
 * Date: 6/2/2020
 * https://leetcode.com/problems/most-common-word/
 */
public class MostCommonWord {

    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.replaceAll("[^a-zA-Z ]", " ").toLowerCase().split("\\s+");
        List<String> filtered = Arrays.stream(words)
                .filter(w -> !" ".equals(w)).collect(Collectors.toList());
        Map<String, Integer> map = new HashMap<>();
        for (String word : filtered) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (String ban : banned) {
            map.remove(ban);
        }

        return map.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue)).get().getKey();
    }

}
