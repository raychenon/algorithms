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

}
