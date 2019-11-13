package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 2019-11-13
 * https://leetcode.com/problems/maximum-product-subarray/
 */
public class MaxProductSubarray {

    /**
     * time complexity: O(n^2)
     * space complexity: O(1)
     *      
     * @param nums
     * @return
     */
    public float maxProductBrute(float[] nums) {
        if (nums == null || nums.length == 0) return 0.0f;

        float product = 1f;
        float max = nums[0];
        int length = nums.length;
        // trick:  the outer loop last index is the same as the inner loop
        // so at last index, the  inner loop won't be executed
        for (int l = 0; l < length; ++l) {
            product = product * nums[l];
            max = Math.max(product, max);
            for (int r = l + 1; r < length; ++r) {
                product = product * nums[r];
                max = Math.max(product, max);
            }
            product = 1f;
        }

        return max;
    }
}
