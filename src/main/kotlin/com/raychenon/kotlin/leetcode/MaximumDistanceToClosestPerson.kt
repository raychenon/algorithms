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
                var r = if (right == N) N else right - i
                ans = Math.max(ans, Math.min(l, r))
            }
        }

        return ans
    }


    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param seats
     * @return the maximum distance to closest person.
     */
    fun maxDistToClosestGroupByFreeSeats(seats: IntArray): Int {
        val N = seats.size
        var K = 0 //current longest group of empty seats
        var ans = 0

        // in the middle
        // 1, 0, 0, 0, 1, 0, 1
        // |     |     |
        // |    ans    |
        for (i in 0 until N) {
            if (seats[i] == 1) {
                K = 0
            } else {
                ++K
                ans = Math.max(ans, (K + 1) / 2)
            }
        }

        // 1 is on the right extremity
        //  0, 0, 0, 1
        //           |
        //          ans
        for (i in 0 until N) {
            if (seats[i] == 1) {
                ans = Math.max(ans, i)
                break
            }
        }

        // the rest to the end is full of 0s
        // 1, 0, 0, 0
        //          |
        //         ans
        for (i in N - 1 downTo 0) {
            if (seats[i] == 1) {
                ans = Math.max(ans, N - 1 - i)
                break
            }
        }

        return ans
    }
}