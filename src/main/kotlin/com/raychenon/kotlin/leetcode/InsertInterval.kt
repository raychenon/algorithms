package com.raychenon.kotlin.leetcode

import java.util.*

/**
 * User: raychenon
 * Date: 3/6/2020
 * https://leetcode.com/problems/insert-interval/
 */
object InsertInterval {

    fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
        val result: MutableList<IntArray> = LinkedList()
        var newStart = newInterval[0]
        var newEnd = newInterval[1]
        var isAfterNewEnd = false

        for (e in intervals) {
            if (e[1] < newStart) {
                result.add(e) // start
            } else if (newEnd < e[0]) {
                if (!isAfterNewEnd) {
                    result.add(intArrayOf(newStart, newEnd))
                    isAfterNewEnd = true
                }
                result.add(e) // end
            } else {
                newStart = Math.min(newStart, e[0])
                newEnd = Math.max(newEnd, e[1])
            }
        }

        if (!isAfterNewEnd) {
            result.add(intArrayOf(newStart, newEnd))
        }

        return result.toTypedArray()
    }

}