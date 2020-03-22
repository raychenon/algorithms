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
     *
     * The idea is that we go through the array and gather all zeros on our road.
     * example: input [0,1,0,3,12]
     * [0,1,0,3,12], Our ball size is 1. First element is 0.
     * [1,0,0,3,12], We encounter a non zero(1). Swap the most left 0 of our snowball with element 1.
     * [1,0,0,3,12], Our ball gets bigger, now its size = 2.
     * [1,3,0,0,12], Swap again with the most left zero.
     * [1,3,12,0,0], Swap again.
     */
    fun moveZeroes(nums: IntArray): Unit {

        var zeroCount = 0
        for (i in 0..nums.size - 1) {
            if (nums.get(i) == 0) {
                zeroCount += 1
            } else if (zeroCount > 0) {
                val temp = nums.get(i)
                nums[i] = 0
                nums[i - zeroCount] = temp
            }
        }
    }

    /**
     * Space Complexity : O(1). Only constant space is used.
     * 
     * Time Complexity: O(n). However, the total number of operations are optimal. There is only a single loop.
     * However, the worst-case (when all elements are non-0) complexity for both the algorithms is same.
     */
    fun moveZeroesLeetcodeSolution3(nums: IntArray): Unit {
        var lastNonZeroFoundAt = 0
        for (i in 0..nums.size - 1) {
            if (nums.get(i) != 0) {
                val temp = nums.get(i)
                nums[i] = 0
                nums[lastNonZeroFoundAt++] = temp
            }
        }
    }
}