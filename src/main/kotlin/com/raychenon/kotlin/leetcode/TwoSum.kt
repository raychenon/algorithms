package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 14/4/2020
 * https://leetcode.com/problems/two-sum/
 */
object TwoSum {

    /**
     * Time complexity: O(n) , with one iteration through the array
     * Space complexity: O(n)
     */
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for (i in 0..nums.size - 1) {
            val complement = target - nums[i]
            if (map.containsKey(complement)) {
                return intArrayOf(map.get(complement)!!, i)
            }
            map.put(nums[i], i)
        }
        return intArrayOf()
    }

}