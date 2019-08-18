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
        int j = 0;
        int product = 1;
        while (j < size) {
            product = product * nums[j];
            j++;
        }
        output[0] = product / nums[0];

        for (int i = 1; i < size; i++) {
            output[i] = product / nums[i];
        }

        return output;
    }
}
