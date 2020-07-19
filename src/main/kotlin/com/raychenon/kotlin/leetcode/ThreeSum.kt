package com.raychenon.kotlin.leetcode

import java.util.*


/**
 * User: raychenon
 * Date: 10/7/2020
 * https://leetcode.com/problems/3sum/
 */
object ThreeSum {

    fun threeSum(nums: IntArray): List<List<Int>> {
        Arrays.sort(nums)
        val res = mutableListOf<List<Int>>()
        for (i in 0 until nums.size) {
            if (i == 0 || nums[i - 1] != nums[i]) {
                twoSumII(nums, i, res)
            }
        }
        return res.toList()
    }

    fun twoSumII(nums: IntArray, i: Int, res: MutableList<List<Int>>) {
        var lo = i + 1
        var hi = nums.size - 1
        while (lo < hi) {
            val sum = nums[i] + nums[lo] + nums[hi]
            if (sum < 0 ||
                lo > i + 1 &&
                nums[lo] == nums[lo - 1]
            ) {
                ++lo
            } else if (sum > 0 ||
                hi < nums.size - 1 &&
                nums[hi] == nums[hi + 1]
            ) {
                --hi
            } else {
                res.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]))
            }
        }
    }
}