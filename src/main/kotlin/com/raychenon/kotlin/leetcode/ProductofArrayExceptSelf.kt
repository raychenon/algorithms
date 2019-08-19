package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-08-19
 * https://leetcode.com/problems/product-of-array-except-self/
 */
object ProductofArrayExceptSelf {

    fun productExceptSelf(nums: IntArray): IntArray {
        if (nums.isEmpty()) {
            return intArrayOf()
        }
        val size = nums.size
        val output = IntArray(size)

        //  prodLeft  i   prodRight
        //  ---------> <-----------
        // [ | | | | | | | | | | | ]
        val leftProd = IntArray(size)
        val rightProd = IntArray(size)

        rightProd[size - 1] = 1
        for (i in (size - 2) downTo 0 step 1) {
            rightProd[i] = rightProd.get(i + 1) * nums.get(i + 1)
        }

        leftProd[0] = 1
        for (i in 1..size - 1) {
            leftProd[i] = leftProd.get(i - 1) * nums.get(i - 1)
        }

        for (i in 0..size - 1) {
            output[i] = leftProd.get(i) * rightProd.get(i)
        }

        return output
    }
}
