package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 13/5/2020
 * https://leetcode.com/problems/single-element-in-a-sorted-array/
 * <p>
 * You are given a sorted array consisting of only integers where every element appears exactly twice,
 * except for one element which appears exactly once. Find this single element that appears only once.
 */
public class SingleElementinaSortedArray {

    public int singleNonDuplicate(int[] nums) {

        int single = nums[0];
        for (int i = 1; i < nums.length; i++) {
            single = single ^ nums[i];    // XOR
        }
        return single;
    }
}
