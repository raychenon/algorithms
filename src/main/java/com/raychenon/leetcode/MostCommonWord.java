package com.raychenon.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
        Set<String> banSet = new HashSet<>(Arrays.asList(banned));
        for (String word : filtered) {
            if (!banSet.contains(word)) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }


    public String mostCommonWordOptimizedTrie(String paragraph, String[] banned) {
        Trie root = new Trie();
        Trie curr = root;
        // insert banned words into Trie
        for (String ban : banned) {
            for (int i = 0; i < ban.length(); i++) {
                int idx = ban.charAt(i) - 'a';
                if (curr.next[idx] == null) {
                    curr.next[idx] = new Trie();
                }
                curr = curr.next[idx];
            }
            curr.ban = true;
            curr = root;
        }
        int maxCount = 0;
        String mostFreqWord = "";
        paragraph = paragraph.toLowerCase();
        char[] pArray = paragraph.toCharArray();
        // insert words in paragraph into Trie
        for (int start = 0, end = 0; start < pArray.length; start = end + 1) {
            // skip non-letter characters
            while (start < pArray.length && (pArray[start] < 'a' || pArray[start] > 'z')) {
                start++;
            }
            // insert consecutive letters(words) into Trie
            for (end = start; end < pArray.length && (pArray[end] >= 'a' && pArray[end] <= 'z'); end++) {
                int idx = pArray[end] - 'a';
                if (curr.next[idx] == null) {
                    curr.next[idx] = new Trie();
                }
                curr = curr.next[idx];
            }
            // update statistics
            if (curr != root && !curr.ban) {
                curr.count++;
                if (curr.count > maxCount) {
                    mostFreqWord = paragraph.substring(start, end);
                    maxCount = curr.count;
                }
            }
            curr = root;
        }
        return mostFreqWord;
    }

    // simplest Trie data structure
    private class Trie {
        private Trie[] next = new Trie[26];    // sub nodes
        private int count;                     // word freqence
        private boolean ban;                   // banned?
    }

}
