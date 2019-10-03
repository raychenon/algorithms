package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-10-03
 * https://leetcode.com/problems/find-all-anagrams-in-a-string
 */
object FindAllAnagramsInaString {
    fun findAnagrams(s: String, p: String): List<Int> {

        val result = mutableListOf<Int>()
        var arrayP = IntArray(26) { 0 }

        for (c in p.toCharArray()) {
            arrayP[c - 'a']++
        }
        val lenP = p.length
        var arrayS = IntArray(26) { 0 }

        for (i in 0..s.length - lenP) {
            if (i == 0) {
                for (y in 0 until lenP) {
                    arrayS[s[y] - 'a']++
                }
            } else {
                val first = s[i - 1]
                val last = s[i + lenP - 1]

                if (arrayS[first - 'a'] > 0) {
                    arrayS[first - 'a']--
                }
                arrayS[last - 'a']++
            }

            if (matches(arrayP, arrayS)) {
                result.add(i)
            }
        }

        return result
    }

    private fun matches(count1: IntArray, count2: IntArray): Boolean {
        for (i in 0..count1.size-1) {
            if (count1[i] != count2[i]) {
                return false
            }
        }
        return true
    }

}