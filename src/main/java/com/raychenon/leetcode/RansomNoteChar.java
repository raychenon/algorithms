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
     * Space complexity: O(K) ~ O(1) , where K is never more than 26
     * (26 == number of letters in alphabet). So K is constant
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

    /**
     * Time complexity: O(R*M) ~ O(n)
     * Space complexity: O(1), the array is constant size
     *
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean canConstructArray(String ransomNote, String magazine) {

        int ransomChars[] = new int[26];  // 26 letters in alphabet
        for (char c : ransomNote.toCharArray()) {
            // m.indexOf(n) run time is O(m*n). It depends on teh string length
            int index = magazine.indexOf(c, ransomChars[c - 'a']);
            if (index == -1) // not found
                return false;
            // 'a' ASCII is 97
            ransomChars[c - 'a'] = index + 1;
        }
        return true;
    }

}
