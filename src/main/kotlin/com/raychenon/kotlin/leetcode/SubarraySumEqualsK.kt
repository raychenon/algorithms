package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 27/4/2020
 * https://leetcode.com/problems/subarray-sum-equals-k/
 */
object SubarraySumEqualsK {

    /**
     * Time complexity: O(n^2)
     * Space complexity: O(1)
     */
    fun subarraySumBruteForce(nums: IntArray, k: Int): Int {
        var sum = 0
        for (i in 0..nums.size - 1) {
            var curSum = 0
            for (j in i..nums.size - 1) {
                curSum += nums[j]
                if (curSum == k) {
                    sum++
                }
            }
        }
        return sum
    }
}