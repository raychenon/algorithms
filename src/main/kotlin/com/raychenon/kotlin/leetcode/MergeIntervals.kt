package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2020-01-30
 * https://leetcode.com/problems/merge-intervals/
 */
object MergeIntervals {

    /**
     * Time complexity: O(N)
     * Space complexity: O(1)
     */
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        var arr = mutableListOf<IntArray>()
        var currentBiggest = 0
        for (i in 0 until intervals.size) {
            var current = intervals.get(i)
            // if the interval overlap, change the biggest element of the interval
            if (currentBiggest >= current.get(0)) {
                arr.get(arr.lastIndex)[1] = current.get(1)
            } else {
                arr.add(current)
            }
            currentBiggest = current.get(1)
        }

        return arr.toTypedArray()
    }
}