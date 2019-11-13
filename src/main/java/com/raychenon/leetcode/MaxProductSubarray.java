package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 2019-11-13
 * https://leetcode.com/problems/maximum-product-subarray/
 */
public class MaxProductSubarray {

    public float maxProductBrute(float[] nums) {
        if (nums == null || nums.length == 0) return 0.0f;

        float product = 1f;
        float max = nums[0];
        int length = nums.length;
        for (int l = 0; l < length; ++l) {
            max = Math.max(product, max);
            for (int r = l + 1; r < length; ++r) {
                product = product * nums[r];
                max = Math.max(product, max);
            }
            product = 1;
        }

        return max;
    }
}
