package com.raychenon.kotlin.leetcode

import java.util.*

/**
 * User: raychenon
 * Date: 2019-09-27
 * https://leetcode.com/problems/group-anagrams/
 */
object GroupAnagrams {

    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val map = mutableMapOf<String, MutableList<String>>()
        for (str in strs) {
            val key = sortedKey(str)
            if (!map.containsKey(key)) {
                val list = mutableListOf<String>(str)
                map.put(key, list)
            } else {
                print("present $str")
                map[key]!!.add(str)
            }
        }

        for (entry in map) {
            print("Map key = ${entry.key} , value = ${entry.value} \n")
        }
        return map.values.toList()
    }


    fun sortedKey(str: String): String {
        val temp = str.toCharArray()
        Arrays.sort(temp)
        return String(temp)
    }

    fun anagramSignature(str: String): Array<Int> {
        val array = Array<Int>(26) { 0 }
        for (c in str) {
            val index: Int = (c - 'a')
            array[index] += 1
        }
        return array
    }

    fun anagramKey(str: String): Map<Char, Int> {
        val map = mutableMapOf<Char, Int>()
        for (c in str) {
            map.put(c, map.getOrDefault(c, 0) + 1)
        }
        return map
    }
}