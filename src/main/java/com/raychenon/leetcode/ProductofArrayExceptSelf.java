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

        //  prodLeft  i   prodRight
        //  ---------> <-----------
        // [ | | | | | | | | | | | ]
        int prodLeft[] = new int[size];
        int prodRight[] = new int[size];

        prodLeft[0] = 1;
        for (int i = 1; i < size; i++) {
            prodLeft[i] = prodLeft[i - 1] * nums[i - 1];
        }

        prodRight[size - 1] = 1;
        for (int i = size - 2; i >= 0; i--) {
            prodRight[i] = prodRight[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < size; i++) {
            int prod = prodLeft[i] * prodRight[i];
            output[i] = prod;
        }

        return output;
    }

    public int[] productExceptSelfConstantSpace(int[] nums) {
        int size = nums.length;
        // quote : Given an array nums of n integers where n > 1
        if (size <= 0) {
            return new int[0];
        }

        int output[] = new int[size];

        //  prodLeft  i
        //  ---------> |-----------
        // [ | | | | | | | | | | | ]
        output[0] = 1;
        for (int i = 1; i < size; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }

        //            i   Right
        //  -------- |  <-----------
        // [ | | | | | | | | | | | ]
        int prodRight = 1;
        for (int i = size - 1; i >= 0; i--) {
            output[i] = output[i] * prodRight;
            prodRight = prodRight * nums[i];
        }

        return output;
    }
}
