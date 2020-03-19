package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 17/3/2020
 * https://leetcode.com/problems/move-zeroes/
 */
object MoveZeroes {

    /**
     * time complexity: O(n)
     * space complexity: O(1)
     */
    fun moveZeroes(nums: IntArray): Unit {

        var lastNonZeroFoundAt = 0
        for (i in 0..nums.size - 1) {
            if (nums.get(i) != 0) {
                nums[lastNonZeroFoundAt++] = nums.get(i)
            }
        }

        for (i in lastNonZeroFoundAt..nums.size - 1) {
            nums[i] = 0
        }

    }
}