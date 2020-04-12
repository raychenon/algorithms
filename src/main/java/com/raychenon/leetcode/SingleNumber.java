package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 11/4/2020
 * https://leetcode.com/problems/single-number/
 * <p>
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 */
public class SingleNumber {

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int a = 0;
        for (int i : nums) {
            a ^= i;
        }
        return a;
    }

}
