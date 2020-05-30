package com.raychenon.leetcode

/**
 * User: raychenon
 * Date: 30/5/2020
 * https://leetcode.com/problems/k-closest-points-to-origin/
 */
object KClosestPointsToOrigin {

    fun kClosestOriginal(points: Array<IntArray>, K: Int): Array<IntArray> {
        var min = Integer.MAX_VALUE
        val pointsMap = mutableMapOf<IntArray, Int>()

        for (p in points) {
            val dist = distance(p)
            pointsMap.put(p, dist)

            min = Math.min(min, dist)
        }


        val sorted = pointsMap.toList().sortedBy { (_, value) -> value }.toMap()
        var arr = Array(K){ intArrayOf(1,2)}


        var iter = sorted.entries.iterator()
        for(i in 0 until K){
            arr[i] = iter.next().key as IntArray
        }

        return arr
    }

    // distance from (0,0)
    fun distance(point: IntArray): Int {
        return point[0] * point[0] + point[1] * point[1]
    }

    fun List<IntArray>.toIntArray(size: Int): Array<IntArray> {
        val iter = iterator()
        return Array(size) { iter.next() }
    }
}