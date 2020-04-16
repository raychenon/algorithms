package com.raychenon.kotlin.leetcode

import java.util.*

/**
 * User: raychenon
 * Date: 16/4/2020
 * https://leetcode.com/problems/contiguous-array/
 */
object ContiguousArray {

    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     */
    fun findMaxLength(nums: IntArray): Int {
        val arr = IntArray(2 * nums.size + 1)
        Arrays.fill(arr, -2)
        arr[nums.size] = -1
        var maxLen = 0
        var count = 0
        for (i in nums.indices) {
            count = count + if (nums[i] == 0) -1 else 1
            if (arr[count + nums.size] >= -1) {
                maxLen = Math.max(maxLen, i - arr[count + nums.size])
            } else {
                arr[count + nums.size] = i
            }
        }
        return maxLen
    }
}