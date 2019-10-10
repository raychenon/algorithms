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
        for (i in (size - 2) downTo 0) {
            rightProd[i] = rightProd.get(i + 1) * nums.get(i + 1)
        }

        leftProd[0] = 1
        for (i in 1 until size) {
            leftProd[i] = leftProd.get(i - 1) * nums.get(i - 1)
        }

        for (i in 0 until size) {
            output[i] = leftProd.get(i) * rightProd.get(i)
        }

        return output
    }


    /**
     * time complexity: O(n)
     * space complexity: O(1)
     */
    fun productExceptSelfConstantSpace(nums: IntArray): IntArray {
        if (nums.isEmpty()) {
            return intArrayOf()
        }
        val size = nums.size
        val output = IntArray(size)

        //  prodLeft  i   prodRight
        //  ---------> <-----------
        // [ | | | | | | | | | | | ]
        output[0] = 1
        for (i in 1 until size) {
            output[i] = output.get(i - 1) * nums.get(i - 1)
        }

        var R = 1
        for (i in (size - 1) downTo 0) {
            output[i] = output.get(i) * R
            R = R * nums.get(i)
        }

        return output
    }
}
