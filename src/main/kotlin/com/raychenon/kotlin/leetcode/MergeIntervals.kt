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
        var curBiggest = 0
        var curSmallest = 0
        for (current in intervals) {
            if (curSmallest >= current.get(0)) {
                arr.get(arr.lastIndex)[0] = current.get(0)
            }

            // if the interval overlap, change the biggest element of the interval
            if (curBiggest >= current.get(0)) {
                arr.get(arr.lastIndex)[1] = Math.max(curBiggest, current.get(1))
            } else {
                arr.add(current)
            }
            curBiggest = current.get(1)
            curSmallest = current.get(0)
        }

        return arr.toTypedArray()
    }
}