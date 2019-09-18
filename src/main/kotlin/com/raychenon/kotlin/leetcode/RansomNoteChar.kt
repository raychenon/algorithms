package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-09-16
 * https://leetcode.com/problems/ransom-note/
 */
object RansomNoteChar {

    /**
     * are all char in "ransomNote: contained in "magazine"?
     * Time complexity: O(n)
     * Space complexity: O(M)
     */
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        var mapMagazine = mutableMapOf<Char, Int>()
        // count the frequency of characters
        for (c in magazine) {
            mapMagazine.put(c, mapMagazine.getOrDefault(c, 0) + 1)
        }

        for (c in ransomNote) {
            // if a character in Ransom is missing from Magazine, quit immediately(return false)
            if (mapMagazine.containsKey(c)) {
                mapMagazine.put(c, mapMagazine.getOrDefault(c, 0) - 1)
                if (mapMagazine.getOrDefault(c, 0) < 0) {
                    return false
                }
            } else {
                return false
            }
        }
        return true
    }
}
