package com.raychenon.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * User: raychenon
 * Date: 2019-09-16
 * https://leetcode.com/problems/ransom-note/
 */
public class RansomNoteChar {


    /**
     * Are all char in "ransomNote: contained in "magazine"?
     * Time complexity: O(n)
     * Space complexity: O(M)
     *
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> mapMagazine = new HashMap<Character, Integer>();
        for (Character c : magazine.toCharArray()) {
            mapMagazine.put(c, mapMagazine.getOrDefault(c, 0) + 1);
        }

        for (Character c : ransomNote.toCharArray()) {
            if (mapMagazine.containsKey(c)) {
                mapMagazine.put(c, mapMagazine.getOrDefault(c, 0) - 1);
                if (mapMagazine.get(c) < 0) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean canConstructArray(String ransomNote, String magazine) {
        int[] chars = new int[]{26}; // 26 letters in alphabet
        
        for (Character c : ransomNote.toCharArray()) {
            int index = magazine.indexOf(c, chars[c - 'a']);
            if (index == -1)    // not found
                return false;
            chars[c - 'a'] = index + 1;
        }

        return true;
    }

}
