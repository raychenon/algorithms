package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 17/3/2020
 * https://leetcode.com/problems/move-zeroes/
 */
object MoveZeroes {

    fun moveZeroes(nums: IntArray): Unit {
        var count = nums.toList().filter { x -> x == 0 }.count()

        var temp = 0
        for (i in nums.size - 1..0 step -1) {
            // put only 0 and shift
            if(i >= nums.size - count){
                if (nums.get(i) == 0) {
                    nums[i] = 0
                }else{
                    nums[i] = temp
                    temp = nums.get(i-1)
                }
            }else{

            }

            val value = nums.get(i)
            if (nums.get(i) != 0) {
            }
        }
    }
}