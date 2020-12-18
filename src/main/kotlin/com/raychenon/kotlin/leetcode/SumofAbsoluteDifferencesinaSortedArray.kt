package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 18/12/2020
 * https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/discuss/969761/Illustrations-for-O(n)-formula-Java-Kotlin-Python
 */
object SumofAbsoluteDifferencesinaSortedArray {

    /**
     * Time complexity: O(n)
     * Space complexity: O(1) , the output space is not counted
     * @param nums
     * @return
     */
    fun getSumAbsoluteDifferences(nums: IntArray): IntArray {
        val n = nums.size
        val res = IntArray(n)
        var sumBelow = 0
        var sumTotal = 0
        for (num in nums) {
            sumTotal += num
        }
        for (i in 0 until n) {
            val num = nums[i]
            sumTotal -= num
            res[i] = sumTotal - (n - i - 1) * num + i * num - sumBelow
            sumBelow += num
        }
        return res
    }
}