package com.raychenon.leetcode;

import java.util.HashMap;
import java.util.Map;

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

    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     * <p>
     * Explanations:
     * <p>
     * -   [1, 2, 1, 3, 4, 5, 9]
     * -       j     i
     * <p>
     * k = sum[i] - sum[j] , where sum[i] is the cumulative sum from index 0 to index i.
     *
     * @param nums
     * @param k
     * @return
     */
    public int subarraySumDP(int[] nums, int k) {
        int nbSubArray = 0;
        int cumulSum = 0;
        Map<Integer, Integer> map = new HashMap();

        // IMPORTANT whenever prefix sum problems, always initialize that auxiliary data structure(a dict in this case) as {0:1}
        map.put(0, 1);

        for (int n : nums) {
            cumulSum += n;
            if (map.containsKey(cumulSum - k)) {
                nbSubArray += map.get(cumulSum - k);
            }
            map.put(cumulSum, map.getOrDefault(cumulSum, 0) + 1);
        }

        return nbSubArray;
    }
}
