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
     * <p>
     * solution https://leetcode.com/problems/move-zeroes/discuss/172432/THE-EASIEST-but-UNUSUAL-snowball-JAVA-solution-BEATS-100-(O(n))-%2B-clear-explanation
     * <p>
     * The idea is that we go through the array and gather all zeros on our road.
     * example: input [0,1,0,3,12]
     * [0,1,0,3,12], Our ball size is 1. First element is 0.
     * [1,0,0,3,12], We encounter a non zero(1). Swap the most left 0 of our snowball with element 1.
     * [1,0,0,3,12], Our ball gets bigger, now its size = 2.
     * [1,3,0,0,12], Swap again with the most left zero.
     * [1,3,12,0,0], Swap again.
     *
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int accumulatedSnowballSize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                accumulatedSnowballSize++;
            } else if (accumulatedSnowballSize > 0) {
                // [1,0,0,3,12]
                int temp = nums[i];
                nums[i] = 0;
                nums[i - accumulatedSnowballSize] = temp;
                // [1,3,0,0,12] swapped
            }
        }

    }
}
