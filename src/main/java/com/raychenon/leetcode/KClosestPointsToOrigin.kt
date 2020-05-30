package com.raychenon.leetcode

import java.util.*

/**
 * User: raychenon
 * Date: 30/5/2020
 * https://leetcode.com/problems/k-closest-points-to-origin/
 */
object KClosestPointsToOrigin {

    fun kClosest(points: Array<IntArray>, K: Int): Array<IntArray> {
        val compareByDistance: Comparator<IntArray> = compareBy { distance(it) }
        val queue = PriorityQueue<IntArray>(compareByDistance)     // Priority Queue is similar to a Max Heap
        for (p in points) {
            queue.add(p)
        }

        val arr = Array<IntArray>(K) { intArrayOf(0) }
        for (i in 0 until K) {
            arr[i] = queue.peek()
            queue.remove()
        }
        return arr
    }

    fun kClosestOriginal(points: Array<IntArray>, K: Int): Array<IntArray> {
        var min = Integer.MAX_VALUE
        val pointsMap = mutableMapOf<IntArray, Int>()

        for (p in points) {
            val dist = distance(p)
            pointsMap.put(p, dist)

            min = Math.min(min, dist)
        }


        val sorted = pointsMap.toList().sortedBy { (_, value) -> value }.toMap()
        var arr = Array(K) { intArrayOf(1, 2) }


        var iter = sorted.entries.iterator()
        for (i in 0 until K) {
            arr[i] = iter.next().key as IntArray
        }

        return arr
    }

    // distance from (0,0)
    inline fun distance(point: IntArray): Int = point[0] * point[0] + point[1] * point[1]

    fun List<IntArray>.toIntArray(size: Int): Array<IntArray> {
        val iter = iterator()
        return Array(size) { iter.next() }
    }
}