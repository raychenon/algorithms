package com.raychenon.kotlin.leetcode


/**
 * User: raychenon
 * Date: 2019-10-13
 * https://leetcode.com/problems/shortest-way-to-form-string/
 */
object ShortestWaytoFormString {

    /**
     * time complexity: O(S*T) , where S: length of source and T: length of target
     *
     */
    fun shortestWay(source: String, target: String): Int {
        var count = 0
        var i = 0
        while (i < target.length) {
            /**
             * source : "xyz"
             * |x| z | y | x | z |
             * <-----><--><------>
             */
            val startI = i  // index in target at each cycle
            for (c in source) {
                if (i < target.length && target.get(i).equals(c)) {
                    i++
                }
            }

            // if the pointer on targer didn't move, this letter is not contained in "source" then return -1
            if (startI == i) {
                return -1
            }
            count++
        }
        return count
    }
}