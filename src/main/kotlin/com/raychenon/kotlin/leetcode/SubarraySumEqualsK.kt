package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 27/4/2020
 * https://leetcode.com/problems/subarray-sum-equals-k/
 *
 * Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.
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

    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * Calculate the cumulative sum and stores the sum frequency in a Map
     * ex:
     *  [1,2,1,3,4,5,9] , k = 6
     *     i   j   , the subarray sum between i and j = sum[j] - sum[i]
     *
     */
    //  [1,2,1,3,4,5,9] , k = 6
    //     i   j   , the subarray sum between i and j = sum[j] - sum[i]
    fun subarraySumDP(nums: IntArray, k: Int): Int {
        var nb = 0
        var sum = 0 // cumulative sum
        val map = mutableMapOf<Int, Int>()
        map.put(0, 1)
        for (i in 0..nums.size - 1) {
            sum += nums[i]
            if (map.containsKey(sum - k)) {
                nb += map.get(sum - k)!!
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1)
        }
        return nb
    }
}