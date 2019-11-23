package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-11-23
 * https://leetcode.com/problems/maximize-distance-to-closest-person
 */
object MaximumDistanceToClosestPerson {

    /**
     * Use 2 pointers method: left and right
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param seats
     * @return the maximum distance to closest person.
     */
    fun maxDistToClosest(seats: IntArray): Int {
        val N = seats.size
        var left = -1
        var right = 0
        var ans = 0

        for (i in 0 until N) {
            if (seats.get(i) == 1)
                left = i
            else {
                while (right < N && seats.get(right) == 0 || right < i) {
                    ++right;
                }
                var l = if (left == -1) N else i - left
                var r = if (right == N) N else right - 1
                ans = Math.max(ans, Math.min(l, r))
            }
        }

        return ans

    }
    
}