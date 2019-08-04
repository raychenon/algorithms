package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 2019-08-04
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/solution/
 */
public class RemoveDuplicatesSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int count = 0;
        for (int index = 1; index < nums.length; index++) {
            if (nums[index] != nums[count]) {
                count = count + 1;
                nums[count] = nums[index];
            }
        }
        return count + 1;
    }
}
