package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 26/7/2020
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 */
object FindMinimuminRotatedSortedArray {

    /**
     * Time complexity: O(log2(n))
     * Space complexity: O(1)
     *
     * @param nums
     * @return
     */
    fun findMin(nums: IntArray): Int {
        var left = 0
        var right = nums.lastIndex
        while(left < right){
            var mid = left + ( right-left)/2
            // find the lowest nums
            if(nums[mid] < nums[right]){
                right = mid
            }else{
                left = mid + 1
            }
        }

        return nums[left]
    }

    /**
     * Brute force
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param nums
     * @return
     */
    fun findMinBF(nums: IntArray): Int {
        var min = Int.MAX_VALUE
        for (num in nums) {
            if (num < min) min = num
        }
        return min
    }
}