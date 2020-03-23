package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 23/3/2020
 * https://leetcode.com/problems/contains-duplicate/
 */
object ContainsDuplicate {

    /**
     * time complexity: O(n * log(n))  due to Sorting
     * space complexity: O(1)
     */
    fun containsDuplicateSort(nums: IntArray): Boolean {
        nums.sort()
        for (i in 1..nums.size - 1) {
            if (nums[i - 1] == nums[i]) return true
        }
        return false
    }

    /**
     * time complexity: O(n)
     * space complexity: O(n)
     */
    fun containsDuplicateSet(nums: IntArray): Boolean {
        val set = HashSet<Int>()
        nums.forEach {
            if (set.contains(it)) return true
            else set.add(it)
        }
        return false
    }


}