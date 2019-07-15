package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-07-13
 * https://leetcode.com/problems/search-insert-position/
 */
object SearchInsertPosition {
    /**
     * search for an integer in a sorted array
     *
     * @param nums   sorted array
     * @param target integer to find
     * @return the index if found or the index where target number should be
     * runtime complexity : O(n)
     * space   complexity : O(1)
     */
    fun searchInsert(nums: IntArray, target: Int): Int {
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

fun IntArray.searchInsert(target: Int): Int {
    val nums = this
    return SearchInsertPosition.searchInsert(nums, target)
}
