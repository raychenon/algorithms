package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-10-03
 * https://leetcode.com/problems/find-all-anagrams-in-a-string
 */
object FindAllAnagramsInaString {

    /**
     * time complexity: O(n), supposing the method {@link #equals(int[], int[])} could be O(1) at best
     * space complexity: O(1)
     * <p>
     * Find all the start indices of p's anagrams in s.
     *
     * Ex: s = "cbaebabacd", p = "abc"
     *
     *              |c   b   a|   e   b   a   |b   a   c|   d"
     *              |a   b   c|               |a   b   c|
     * indexes:      0                          6
     * output = [0,6]
     * @param s
     * @param p
     * @return
     */
    fun findAnagrams(s: String, p: String): List<Int> {

        val result = mutableListOf<Int>()
        var arrayP = IntArray(26) { 0 }

        for (c in p.toCharArray()) {
            arrayP[c - 'a']++
        }
        val lenP = p.length
        var arrayS = IntArray(26) { 0 }

        for (i in 0 until (s.length - lenP + 1)) {
            if (i == 0) {
                for (y in 0 until lenP) {
                    arrayS[s[y] - 'a']++
                }
            } else {
                val first = s[i - 1]
                val last = s[i + lenP - 1]

                if (arrayS.get(first - 'a') > 0) {
                    arrayS[first - 'a']--
                }
                arrayS[last - 'a']++
            }

            if (equals(arrayP, arrayS)) {
                result.add(i)
            }
        }

        return result
    }

    private fun equals(count1: IntArray, count2: IntArray): Boolean {
        for (j in 0..count1.size - 1) {
            if (count1[j] != count2[j]) {
                return false
            }
        }
        return true
    }

}