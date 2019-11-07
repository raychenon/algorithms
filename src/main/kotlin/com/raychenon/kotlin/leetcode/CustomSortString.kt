package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-11-06
 * https://leetcode.com/problems/custom-sort-string/
 */
object CustomSortString {

    /**
     * Time complexity: O(S.length + T.length)
     * Space complexity: O(T.length)
     * @param S
     * @param T
     * @return
     */
    fun customSortString(S: String, T: String): String {
        var map = mutableMapOf<Char, Int>()
        // create a map of occurrences of chars for T
        for (c in T) {
            map.put(c, map.getOrDefault(c, 0) + 1)
        }

        // add chars from S
        var str = StringBuilder()
        for (c in S) {
            if (map.contains(c)) {
                for (i in 1..map.getOrDefault(c, 0)) {
                    str.append(c)
                }
                map.remove(c)
            }
        }

        // append the remaining chars in T
        // How keys in Map are "magically" sorted in right alphabetical order ?
        for ((k, v) in map) {
            for (i in 1..v) {
                str.append(k)
            }
        }

        return str.toString()
    }

}