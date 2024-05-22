package com.raychenon.kotlin.leetcode.array

/**
 * https://leetcode.com/problems/subarray-sums-divisible-by-k/
 * Array, Prefix sum
 */
object SubarraySumsDivisibleByK {

    fun subarraysDivByK(nums: IntArray, k: Int): Int {
        val n = nums.size
        var count = 0
        var sum = 0
        val map = mutableMapOf<Int, Int>() // sum % k -> frequency
        map.put(0, 1)
        for (i in 0 until n) {
            sum = (sum + nums[i]) % k
            if (sum < 0) {
                sum += k
            }
            count += map.getOrDefault(sum, 0)
            map.put(sum, map.getOrDefault(sum, 0) + 1)
        }
        return count

    }

}