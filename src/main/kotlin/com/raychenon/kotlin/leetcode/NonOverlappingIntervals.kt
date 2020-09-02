package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2/9/2020
 * https://leetcode.com/problems/non-overlapping-intervals/
 */
object NonOverlappingIntervals {

    /**
     * Time complexity: O(n*log(n)) ~ O(n*log(n) + n) , O(n*log(n)) due to the sort
     * Space complexity: O(n)
     * @param intervals
     * @return
     */
    fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
        val comparator = Comparator { o1: IntArray, o2: IntArray ->
            return@Comparator (o1[0] - o2[0])
        }
        val sorted = intervals.toMutableList()
        sorted.sortWith(comparator)

        var removed = 0
        var last = 0
        // count the nb of intervals to be deleted
        for (i in 1 until sorted.size) {
            if (sorted[i][0] < sorted[last][1]) {
                removed += 1
                if (sorted[i][1] < sorted[last][1]) last = i
            } else {
                last = i
            }
        }

        return removed
    }

}