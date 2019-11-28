package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-10-29
 * https://leetcode.com/problems/longest-common-prefix/
 */
object LongestCommonPrefix {

    /**
     * Time Complexity: O(N*n) ~ O(n) , where n is the array length and N is the number of character in a String.
     * Space Complexity: O(1)
     */
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        val prefix = StringBuilder()

        var l = 0
        while (l < strs.get(0).length) {
            for (str in strs) {
                if (l >= str.length || str.get(l) != strs.get(0).get(l)) {
                    return prefix.toString()
                }
            }
            prefix.append(strs.get(0).get(l))
            l++
        }

        return prefix.toString()
    }
}