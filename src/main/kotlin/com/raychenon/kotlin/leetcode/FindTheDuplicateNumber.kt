package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 29/3/2020
 * https://leetcode.com/problems/find-the-duplicate-number/
 */
object FindTheDuplicateNumber {


    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     * @param nums
     * @return
     */
    fun findDuplicateMemory(nums: IntArray): Int {
        // due to Pigeonhole, a Set can be replaced by an array to avoid autoboxing
        val set = IntArray(nums.size)
        for (num in nums) {
            if (set[num] != 0) {
                return num
            } else {
                set[num] = num
            }
        }
        return -1
    }

    /**
     * Floyd's Tortoise and Hare (Cycle Detection)
     *  Time complexity : O(n)
     *  Space complexity : O(1)
     */
    fun findDuplicate(nums: IntArray): Int {
        if (nums.size <= 1) return -1

        var tortoise = nums[0]
        var hare = nums[0]
        do {
            tortoise = nums[tortoise]
            hare = nums[nums[hare]]

        } while (tortoise != hare)

        var ptr1 = nums[0]
        var ptr2 = tortoise
        while (ptr1 != ptr2) {
            ptr1 = nums[ptr1]
            ptr2 = nums[ptr2]
        }
        return ptr1
    }
}