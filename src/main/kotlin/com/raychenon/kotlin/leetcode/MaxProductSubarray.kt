package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-11-11
 * https://leetcode.com/problems/maximum-product-subarray/
 */
object MaxProductSubarray {

    /**
     * Kadane algorithm
     */
    fun maxProduct(nums: IntArray): Int {
        if (nums == null || nums.isEmpty()) return 0

        var product: Int = nums.get(0)
        var max = product
        var min = product
        for (l in 1..nums.size - 1) {
            val cur = nums.get(l)
            if (cur > 0) {
                max = Math.max(cur, max * cur)
                min = Math.min(cur, min * cur)
            } else {
                val tmp = max
                max = Math.max(cur, min * cur)
                min = Math.min(cur, tmp * cur)
            }
            product = Math.max(product, max)
        }

        return product
    }


    fun maxProductBrute2(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var product: Int = 1
        var max = nums.get(0)
        for (l in 0..nums.size - 1) {
            product = product * nums.get(l)
            // for single element
            if (product > max) {
                max = product
            }
            for (r in l + 1..nums.size - 1) {
                product = product * nums.get(r)

                if (product > max) {
                    max = product
                }
            }
            product = 1
        }

        return max
    }

    fun maxProductBrute1(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var product: Int = 1
        var max = nums.get(0)
        for (l in 0..nums.size - 2) {
            product = product * nums.get(l)
            // for single element
            if (product > max) {
                max = product
            }
            for (r in l + 1..nums.size - 1) {
                product = product * nums.get(r)

                if (product > max) {
                    max = product
                }
            }
            product = 1
        }

        // for single element
        val last = nums.get(nums.size - 1)
        if (last > max) {
            max = last
        }

        return max
    }
}