package com.raychenon.kotlin.hackerrank

import java.util.Arrays



/**
 * User: raychenon
 * Date: 19/1/19
 * Under "Dictionaries and Hashmaps"
 * https://www.hackerrank.com/challenges/sherlock-and-anagrams
 */
object SherlockAndAnagramsKotlin {

    fun sherlockAndAnagrams(s: String): Int {

        val mapFrequency: MutableMap<String, Int> = mutableMapOf()
        var totalCount: Int = 0

        for (i in 0 until s.length) {
            for (j in i + 1 .. s.length) {

                val subString = s.substring(i, j)
//                val key = subString.toSortedSet().toString()
                val chars = subString.toCharArray()
                Arrays.sort(chars)
                val key = String(chars)

                if (mapFrequency.containsKey(key)) {
                    var count: Int = mapFrequency.getOrDefault(key,0)
                    totalCount = totalCount + count

                    mapFrequency.put(key, ++count)
                } else {
                    mapFrequency.put(key, 1)
                }
            }
        }
        
        return totalCount
    }
}