package com.raychenon.kotlin.leetcode

import java.util.Arrays

/**
 * User: raychenon
 * Date: 2020-01-30
 * https://leetcode.com/problems/merge-intervals/
 */
object MergeIntervals {

    /**
     * Time complexity: O(N * Log(N))
     * Space complexity: O(1)
     */
    fun merge(intervals: Array<IntArray>): Array<IntArray> {

        if (intervals.size <= 1) return intervals

        // Sort by ascending starting point
        // sorting is n*log(n) operation
        Arrays.sort(
            intervals
        ) { i1: IntArray, i2: IntArray ->
            Integer.compare(
                i1[0],
                i2[0]
            )
        }
        var arr = mutableListOf<IntArray>()
        var currInterval = intervals.get(0)
        arr.add(currInterval)

        for (interval in intervals) {
            // if the interval overlap, change the biggest element of the interval
            if (currInterval.get(1) >= interval.get(0)) {
                currInterval[1] = Math.max(currInterval.get(1), interval.get(1))
            } else {
                arr.add(interval)
                currInterval = interval
            }
        }

        return arr.toTypedArray()
    }
}
