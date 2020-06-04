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

    fun mostCommonWord(paragraph: String, banned: Array<String>): String {
        val re = Regex("[^A-Za-z0-9 ]")
        val paragraphNoPunctuation = re.replace(paragraph, "")
        val words: Array<String> = paragraphNoPunctuation.toLowerCase().split(" ").toTypedArray()
        var mapFrequency = mutableMapOf<String, Int>()

        for (word in words) {
            mapFrequency.put(word, mapFrequency.getOrDefault(word, 0) + 1)
        }

        for (ban in banned) {
            if (mapFrequency.containsKey(ban)) {
                mapFrequency.remove(ban)
            }
        }

        val max = mapFrequency.maxBy { it.value }
        return max?.key!!
    }
}