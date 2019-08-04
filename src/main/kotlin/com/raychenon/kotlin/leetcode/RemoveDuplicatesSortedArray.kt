package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-08-04
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
object RemoveDuplicatesSortedArray {

    /**
     * nums: pass by refence
     */
    fun removeDuplicates(nums: IntArray): Int {
        var prevValue = -1
        for (index in nums.size - 1 downTo 0) {
            val value = nums.get(index)
            if (value == prevValue) {
                // delete
            }
            prevValue = value
        }
        return nums.size
    }
}
