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
     * solution https://leetcode.com/problems/move-zeroes/discuss/172432/THE-EASIEST-but-UNUSUAL-snowball-JAVA-solution-BEATS-100-(O(n))-%2B-clear-explanation
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int accumulatedZeroSize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                accumulatedZeroSize++;
            } else if (accumulatedZeroSize > 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[i - accumulatedZeroSize] = temp;
            }
        }

    }
}
