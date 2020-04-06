package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 6/4/2020
 * https://leetcode.com/problems/single-number/
 */
public class SingleNumber {

    /**
     * The key is to use a XOR ^
     * Time complexity: O(n)
     * Space complexity: O(1)
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int a = 0;
        for(int i:nums){
            a ^= i;
        }
        return a;
    }
}
