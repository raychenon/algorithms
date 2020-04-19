package com.raychenon.kotlin.leetcode

import java.util.*

/**
 * User: raychenon
 * Date: 16/4/2020
 * https://leetcode.com/problems/contiguous-array/
 *
 * Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.
 */
object ContiguousArray {

    /**
     * Time complexity: O(n^2)
     * Space complexity: O(1)
     */
    fun findMaxLengthBruteForce(nums: IntArray): Int {
        var maxlen = 0
        for (start in 0..nums.size - 1) {
            var zeros = 0
            var ones = 0
            for (end in start..nums.size - 1) {
                if (nums.get(end) == 0) zeros++
                else ones++

                if (zeros == ones) maxlen = Math.max(maxlen, end - start + 1)
            }
        }
        return maxlen
    }

    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    fun findMaxLengthHashMap(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>(0 to -1)
        var maxlen = 0
        var count = 0
        nums.forEachIndexed { i, num ->
            count = count + if (num == 1) 1 else -1
            val previousIndex = map.get(count)
            if (previousIndex == null) {
                map[count] = i  // faster to run on leetcode than map.put(count,i)
            } else {
                maxlen = Math.max(maxlen, i - map.get(count)!!)
            }
        }
        return maxlen
    }

    /**
     * Time complexity: O(n)
     * Time complexity: O(n)
     *
     */
    fun findMaxLengthExtraArray(nums: IntArray): Int {
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