package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 2019-07-15
 * https://leetcode.com/problems/search-insert-position/
 */
public class SearchInsertPosition {
    /**
     * search for an integer in a sorted array
     *
     * @param nums   sorted array
     * @param target integer to find
     * @return the index if found or the index where target number should be
     * runtime complexity : O(n)
     * space   complexity : O(1)
     */
    public int searchInsert(int[] nums, int target) {
        int min = nums[0];
        if (target < min) return 0;
        int size = nums.length;

        for (int i = 0; i < size; i++) {
            // if target is found
            if (nums[i] == target) {
                return i;
            } else if (nums[i] > target) {
                // target is between the current number and previous
                // [i-1]--[target]--[i] 
                if ((i - 1) >= 0 && nums[i - 1] < target) {
                    return i;
                }
            }
        }
        return size;
    }
}
