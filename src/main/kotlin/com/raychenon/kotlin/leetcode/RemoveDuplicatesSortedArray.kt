package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-08-04
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
object RemoveDuplicatesSortedArray {

    /**
     * nums: pass by refence
     * Elements in array cannot be removed
     * Time complexity : O(n)
     * Space complexity : O(1)
     */
    fun removeDuplicates(nums: IntArray): Int {
        var count = 0
        if (nums.size == 0) return 0

        for (index in 0..nums.size - 1) {
            if (nums.get(index) != nums.get(count)) {
                count = count + 1
                nums.set(count, nums.get(index))
            }
        }
        return count + 1
    }
}
