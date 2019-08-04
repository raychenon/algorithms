package com.raychenon.kotlin.leetcode

import java.util.*

/**
 * User: raychenon
 * Date: 2019-08-04
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
object RemoveDuplicatesSortedArray {

    /**
     * nums: pass by refence
     */
    fun removeDuplicates(nums: IntArray): Int {
        val set = TreeSet<Int>()
        set.addAll(nums.toSortedSet())
        return set.size
    }
}
