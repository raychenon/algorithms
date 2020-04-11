package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 11/4/2020
 * https://leetcode.com/problems/single-number/
 * 
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * The key is XOR operator
 */
object SingleNumber {

    fun singleNumber(nums: IntArray): Int {
        var i: Int = 0
        for ( n in nums){
            i = i xor n
        }
        return i
    }
}