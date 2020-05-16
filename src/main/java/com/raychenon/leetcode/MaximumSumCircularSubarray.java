package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 16/5/2020
 * https://leetcode.com/problems/maximum-sum-circular-subarray/
 * <p>
 * Given a circular array C of integers represented by A, find the maximum possible sum of a non-empty subarray of C.
 */
public class MaximumSumCircularSubarray {

    /**
     * case 1 : the max subarray  is NOT circular
     * [    | max_subarray_sum |       ]
     * <p>
     * case 2 : the max subarray  is circular
     * [max_subarray_sum1 | min_subarray_sum  | max_subarray_sum2]
     * == total_sum - min_subarray_sum
     * <p>
     * <p>
     * Time complexity: O(N)
     * Space complexity: O(1)
     *
     * @param A
     * @return
     */
    public int maxSubarraySumCircular(int[] A) {

        int total = 0;
        int accMax = A[0];
        int sumMax = 0;
        int accMin = A[0];
        int sumMin = 0;

        for (int a : A) {
            total += a;

            accMax = Math.max(accMax + a, a);
            sumMax = Math.max(accMax, sumMax);

            accMin = Math.min(accMin + a, a);
            sumMin = Math.min(sumMin, accMin);
        }
        return sumMax > 0 ? Math.max(sumMax, total - sumMin) : sumMax;
    }
}
