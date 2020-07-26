package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 26/7/2020
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii
 */
object FindMinimuminRotatedSortedArray2 {

    /**
     * Time complexity: O(log2(n))
     * Space complexity: O(1)
     */
    fun findMin(nums: IntArray): Int {
        var left = 0
        var right = nums.lastIndex
        while (left < right) {
            val mid = left + (right - left) / 2
            if (nums[mid] == nums[right]) {
                right = right - 1
                // mininum element
            } else if (nums[mid] < nums[right]) {
                right = mid
            } else {
                left = mid + 1
            }
        }
        return nums[left]
    }

    /**
     * Time complexity: O(log2(n))
     * Space complexity: O(1)
     */
    fun findMax(nums: IntArray): Int {
        var left = 0
        var right = nums.lastIndex
        while (left < right) {
            var mid = left + (right - left) / 2
            // find the highest num
            if (nums[mid] == nums[right]) {
                // equal
                right = right + 1
            } else if (nums[mid] > nums[right]) {
                right = mid
            } else if (nums[mid] < nums[right]) {
                left = mid + 1
            }
        }
        return nums[left]
    }


}