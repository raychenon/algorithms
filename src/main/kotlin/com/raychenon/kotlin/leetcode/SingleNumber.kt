package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 6/4/2020
 * https://leetcode.com/problems/single-number/
 */
object SingleNumber {

    /**
     * The key is to use a XOR ^
     * Time complexity: O(n)
     * Space complexity: O(1)
     * @param nums
     * @return
     */
    fun singleNumber(nums: IntArray): Int {
        var i: Int = 0
        for ( n in nums){
            i = i xor n
        }
        return i
    }
}