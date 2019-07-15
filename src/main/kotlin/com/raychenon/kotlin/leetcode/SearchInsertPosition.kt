package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-07-13
 * https://leetcode.com/problems/search-insert-position/
 */
object SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        // edge limit
        val min = nums.get(0)
        val max = nums.get(nums.size - 1)
        if (target < min) {
            return 0
        } else if (target > max) {
            return nums.size
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

fun IntArray.searchInsert(target: Int): Int {
    val nums = this
    return SearchInsertPosition.searchInsert(nums, target)
}
