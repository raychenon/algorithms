package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 17/3/2020
 * https://leetcode.com/problems/move-zeroes/
 */
public class MoveZeroes {

    /**
     * time complexity: O(n)
     * space complexity: O(1)
     *
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt++] = nums[i];
            }
        }

        for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
