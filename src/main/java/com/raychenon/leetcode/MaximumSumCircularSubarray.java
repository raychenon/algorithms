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
     * @param A
     * @return
     */
    public int maxSubarraySumCircular(int[] A) {

        int total = 0;
        int accMax = 0;
        int sumMax = Integer.MIN_VALUE;
        int accMin = 0;
        int sumMin = Integer.MAX_VALUE;

        for (int a : A) {
            total += a;

            accMax = Math.max(accMax + a, a);
            sumMax = Math.max(accMax, sumMax);

            accMin = Math.min(accMin + a, a);
            sumMin = Math.min(sumMin, accMin);
        }
        return sumMax > 0 ? Math.max(sumMax, total - sumMin) : sumMax;
    }

    /**
     * Time complexity: O(N)
     * Space complexity: O(1)
     * @param A
     * @return
     */
    public int maxSubarraySumCircular1stSubmission(int[] A) {
        int n = A.length;
        int minStraightSum = Integer.MAX_VALUE;
        int maxStraightSum = Integer.MIN_VALUE;
        int totalSum = 0;

        int accMax = 0;
        int accMin = 0;

        for(int j = 0;j<n;j++){
            totalSum += A[j];

            accMax += A[j];
            maxStraightSum = Math.max(maxStraightSum,accMax);
            accMax = accMax < 0 ? 0 : accMax;

            accMin += A[j];
            minStraightSum = Math.min(minStraightSum, accMin);
            accMin = accMin > 0 ? 0 : accMin;
        }


        if(totalSum == minStraightSum){ // if all numbers are negative
            return maxStraightSum;
        }

        return  Math.max(maxStraightSum, (totalSum - minStraightSum));
    }
}
