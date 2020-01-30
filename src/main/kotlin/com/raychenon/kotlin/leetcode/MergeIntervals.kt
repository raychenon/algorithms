package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2020-01-30
 * https://leetcode.com/problems/merge-intervals/
 */
object MergeIntervals {

    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        var arr = mutableListOf<IntArray>()
        var prevSubArr = intervals.get(0)
        for (i in 1 until intervals.size) {
            var current = intervals.get(i)
            if (prevSubArr[1] >= current[0]) {
                prevSubArr[1] = current.get(1)
            } else {
                arr.add(prevSubArr)
                prevSubArr = current
            }
        }

        return arr.toTypedArray()
    }
}