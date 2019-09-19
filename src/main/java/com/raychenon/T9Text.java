package com.raychenon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.Arrays;

/**
 * User: raychenon
 * Date: 2019-09-19
 * https://github.com/raychenon/algorithms/issues/97
 */
public class T9Text {

    Map<Integer, Set<String>> dictionary;

    Set<String> filterWords(int keyCombination) {
        return dictionary.getOrDefault(keyCombination, new HashSet<>());
    }

    void preProcess(List<String> words) {
        Map<Integer, Set<String>> dict = new HashMap<>();

        for (String word : words) {
            int key = 0;
            for (Character c : word.toCharArray()) {
                key = key * 10 + com.raychenon.kotlin.T9Text.INSTANCE.convertToKeypadNum(c.charValue());
            }

            if (dict.containsKey(key)) {
                Set<String> set = dict.get(key);
                set.add(word);
            } else {
                dict.put(key, new HashSet<>(Arrays.asList(word)));
            }
        }

        this.dictionary = dict;
    }


}
