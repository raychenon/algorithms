package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 2019-11-13
 * https://leetcode.com/problems/maximum-product-subarray/
 */
public class MaxProductSubarray {

    /**
     * The optimized solution is linear.
     * There were a few tricks :
     * - a large negative number can become large positive number. So the local min will be stored.
     * - if the current element is larger than the accumulated max product, then the current element.
     * <p>
     * time complexity: O(n)
     * space complexity: O(1)
     */
    public float maxProductOptimal(float[] nums) {

        if (nums == null || nums.length == 0) return 0.0f;

        float product = nums[0];
        float max = product;
        float min = product;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > 0) {
                max = Math.max(nums[i], max * nums[i]);
                min = Math.min(nums[i], min * nums[i]);
            } else {
                float tmp = max;
                max = Math.max(nums[i], min * nums[i]);
                min = Math.min(nums[i], tmp * nums[i]);
            }
            product = Math.max(product, max);
        }

        return product;
    }

    /**
     * Same as {@link #maxProductOptimal(float[])}}  , shorter version
     *  time complexity: O(n)
     *   ssssssssssspace complexity: O(1)
     * @param nums
     * @return
     */
    public float maxProductOptimalShorter(float[] nums) {

        if (nums == null || nums.length == 0) return 0.0f;

        float product = nums[0];
        float max = product;
        float min = product;
        for (int i = 1; i < nums.length; ++i) {
            max = Math.max(Math.max(nums[i], max * nums[i]), min * nums[i]);
            min = Math.min(Math.min(nums[i], min * nums[i]), max * nums[i]);

            product = Math.max(product, max);
        }

        return product;
    }


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
