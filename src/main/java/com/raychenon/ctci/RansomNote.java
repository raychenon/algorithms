package com.raychenon.ctci;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

/**
 * User: raychenon
 * Date: 24/1/19
 * https://www.hackerrank.com/challenges/ctci-ransom-note/problem
 */
public class RansomNote {

    /**
     * The main idea is that in order to create ransom note from a magazine,
     * all the string in Note must contained in the Magazine.
     * <p>
     * All string of Note are decremented from Magazine.
     * Note is first converted into a Map of frequency by string to be timely efficient for a string search.
     * <p>
     * M is the size of Magazine
     * N is the size of Note
     * time complexity : O(n) = O(M+N)
     * space complexity : O(N)
     *
     * @param magazine of size M
     * @param note     of size N
     * @return boolean
     */
    static boolean checkMagazine(String[] magazine, String[] note) {
        if (magazine.length < note.length) {
            return false;
        }

        // create a map of frequency for each word
        Map<String, Integer> noteMap = Arrays.stream(note).collect(groupingBy(Function.identity(),
                collectingAndThen(counting(), Long::intValue)));

        for (String magazineWord : Arrays.asList(magazine)) {
            // remove the words from noteMap
            if (noteMap.containsKey(magazineWord)) {
                noteMap.put(magazineWord, noteMap.get(magazineWord) - 1);
                if (noteMap.getOrDefault(magazineWord, 0) == 0) {
                    noteMap.remove(magazineWord);
                }
            }

            // only when all words from Note are removed,
            // we are sure there are enough words in Magazine to form the Note
            if (noteMap.size() == 0) {
                return true;
            }
        }
        return false;
    }


    static boolean checkMagazineFP(String[] magazine, String[] note) {
        if (magazine.length < note.length) {
            return false;
        }

        // create a map of frequency for each word
        Map<String, Integer> noteMap = Arrays.stream(note).collect(groupingBy(Function.identity(),
                collectingAndThen(counting(), Long::intValue)));
        Map<String, Integer> magazineMap = Arrays.stream(magazine).collect(groupingBy(Function.identity(),
                collectingAndThen(counting(), Long::intValue)));

        return noteMap.entrySet().stream()
                .allMatch(e -> magazineMap.getOrDefault(e.getKey(), 0) >= e.getValue());
    }

}
