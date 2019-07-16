package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-07-13
 * https://leetcode.com/problems/search-insert-position/
 */
object SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        if (nums.isEmpty()) return 0

        // edge limit
        val min = nums.get(0)
        if (target < min) {
            return 0
        }

        // general
        for ((i, v) in nums.withIndex()) {
            // found
            if (v == target) {
                return i
            } else if (v > target) {
                // target not found , between numbers
                if ((i - 1) >= 0 && nums.get(i - 1) < target) {
                    return i
                }
            }
        }
        return nums.size
    }
}