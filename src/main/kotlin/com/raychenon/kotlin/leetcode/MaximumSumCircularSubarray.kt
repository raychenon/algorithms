package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 16/5/2020
 * https://leetcode.com/problems/maximum-sum-circular-subarray/
 */
object MaximumSumCircularSubarray {

    /**
     * Time complexity: O(N)
     * Space complexity: O(1)
     * <p>
     * case 1 : the max subarray  is NOT circular
     * [    | max_subarray_sum |       ]
     * <p>
     * case 2 : the max subarray  is circular
     * [max_subarray_sum1 | min_subarray_sum  | max_subarray_sum2]
     * == total_sum - min_subarray_sum
     * <p>
     * Corner case
     * If all numbers are negative, maxSum = max(A) and minSum = sum(A).
     * <p>
     * https://leetcode.com/problems/maximum-sum-circular-subarray/discuss/178422/One-Pass
     *
     */
    fun maxSubarraySumCircular(A: IntArray): Int {

        var totalSum = 0
        var maxSum = A[0]
        var accMax = 0
        var minSum = A[0]
        var accMin = 0

        A.forEach {
            totalSum += it

            accMax = Math.max(accMax + it, it)
            maxSum = Math.max(maxSum, accMax)

            accMin = Math.min(accMin + it, it)
            minSum = Math.min(minSum, accMin)

        }

        return if (maxSum > 0) Math.max(maxSum, totalSum - minSum) else maxSum
    }
}