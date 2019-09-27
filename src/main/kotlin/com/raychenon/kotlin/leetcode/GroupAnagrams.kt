package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-09-27
 * https://leetcode.com/problems/group-anagrams/
 */
object GroupAnagrams {

    /**
     * Time Complexity: O(N*K), where N is the lenght of "strs", K is maximum lenght of a string in "strs"
     * Space Complexity: O(N*K)
     *
     * @param strs
     * @return
     */
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val map = mutableMapOf<String, MutableList<String>>()
        for (str in strs) {
            val key = anagramSignature(str)
            if (!map.containsKey(key)) {
                val list = mutableListOf<String>(str)
                map.put(key, list)
            } else {
                map[key]!!.add(str)
            }
        }
        return map.values.toList()
    }


    fun anagramSignature(str: String): String {
        val array = Array<Int>(26) { 0 }
        for (c in str) {
            val index: Int = (c - 'a')
            array[index] += 1
        }
        val sb = StringBuilder()
        for (i in array) {
            sb.append(i)
        }
        return sb.toString()
    }

    fun anagramKey(str: String): Map<Char, Int> {
        val map = mutableMapOf<Char, Int>()
        for (c in str) {
            map.put(c, map.getOrDefault(c, 0) + 1)
        }
        return map
    }
}