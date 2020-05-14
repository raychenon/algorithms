package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 14/5/2020
 * https://leetcode.com/problems/single-element-in-a-sorted-array/
 */
object SingleElementinaSortedArray {

    fun singleNonDuplicateBrut(nums: IntArray): Int {
        val size = nums.size
        var i = 0
        while (i < size - 1) {
            if (nums[i] != nums[i + 1]) return nums[i]
            i = i + 2
        }
        return nums[size - 1]
    }

    fun singleNonDuplicateBinarySearch(nums: IntArray): Int {
        return 0
    }
}