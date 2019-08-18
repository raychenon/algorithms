package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 2019-08-18
 * https://leetcode.com/problems/product-of-array-except-self/
 */
public class ProductofArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        // quote : Given an array nums of n integers where n > 1
        if (size <= 0) {
            return new int[0];
        }

        int output[] = new int[size];

        for (int i = 0; i < size; i++) {
            int prod = 1;
            for (int j = 0; j < size; j++) {
                if (j != i) {
                    prod = prod * nums[j];
                }
            }
            output[i] = prod;
        }

        return output;
    }
}
