package com.raychenon.kotlin.leetcode

import java.util.*

/**
 * User: raychenon
 * Date: 11/8/2020
 * https://leetcode.com/problems/h-index/
 */
object HIndex {

    /**
     * Time complexity: 0(n*log(n)) = 0(n*log(n)) + O(n)
     * Space complexity: O(1)
     *
     * @param citations
     * @return
     */
    fun hIndex(citations: IntArray): Int {
        Arrays.sort(citations) // 0(n*log(n))
        val n = citations.size
        var i = 1
        while (i <= n) {
            if (citations[n - i] < i) break
            i++
        }
        return i - 1
    }

    /**
     * Counting sort
     *
     * Time complexity: 0(n)
     * Space complexity: O(n)
     *
     * @param citations
     * @return
     */
    fun hIndexCountingSort(citations: IntArray): Int {
        val n = citations.size
        val frequencyPapers = IntArray(n + 1)
        for (c in citations) {
            frequencyPapers[Math.min(c, n)]++;
        }

        var hIndex = n
        var s = frequencyPapers[n]
        while (hIndex > s) {
            hIndex--
            s += frequencyPapers[hIndex]
        }

        return hIndex

    }

}