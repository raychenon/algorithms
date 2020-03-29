package com.raychenon.kotlin.leetcode

import java.util.*

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
        val set: MutableSet<Int> = HashSet()
        for (num in nums) {
            if (set.contains(num)) {
                return num
            } else {
                set.add(num)
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