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

    /**
     * XOR of the same number equals to 0.
     * By iterating all elements, every numbers appearing twice will be eliminated, only the single number will remain
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param nums
     * @return single number
     */
    public int singleNonDuplicate(int[] nums) {

        int single = nums[0];
        for (int i = 1; i < nums.length; i++) {
            single = single ^ nums[i];    // XOR
        }
        return single;
    }
}
