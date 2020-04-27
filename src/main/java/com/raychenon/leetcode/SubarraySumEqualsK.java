package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 27/4/2020
 * https://leetcode.com/problems/subarray-sum-equals-k/
 * <p>
 * Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.
 */
public class SubarraySumEqualsK {

    /**
     * Time complexity: O(n^2)
     * Space complexity: O(1)
     *
     * @param nums
     * @param k
     * @return
     */
    public int subarraySumBruteForce(int[] nums, int k) {
        int nb = 0;
        for (int i = 0; i < nums.length; i++) {
            int partialSum = 0;
            for (int j = i; j < nums.length; j++) {
                partialSum += nums[j];
                if (partialSum == k) {
                    nb++;
                }
            }
        }
        return nb;
    }
}
