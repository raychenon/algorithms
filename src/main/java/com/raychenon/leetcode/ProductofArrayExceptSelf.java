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
        int prodLeft = 1;
        int prodRight = 1;

        for (int i = 1; i < size; i++) {
            prodRight = prodRight * nums[i];
        }
        boolean isFirst = true;

        for (int i = 0; i < size; i++) {
            if (i - 1 > 0) {
                if (nums[i - 1] != 0) {
                    prodLeft = prodLeft * nums[i - 1];
                }
            }
            if (i < size && !isFirst) {
                if (nums[i] != 0) {
                    prodRight = prodRight / nums[i];
                }
            }
            isFirst = false;

            int prod = prodLeft * prodRight;
            output[i] = prod;
            System.out.println("prod = " + prod + " , index = " + i + " , left = " + prodLeft + " , right = " + prodRight);
        }

        return output;
    }
}
