package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 26/7/2020
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii
 */
object FindMinimuminRotatedSortedArray2 {

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


    fun findMax(nums: IntArray): Int {
        var left = 0
        var right = nums.lastIndex
        while (left < right) {
            var mid = left + (right - left) / 2
            // find the highest num
            if (nums[mid] > nums[right]) {
                right = mid
            } else {
                left = mid + 1
            }
        }
        return nums[left]
    }


}