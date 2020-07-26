package com.raychenon.leetcode;

import java.util.Arrays;

/**
 * User: raychenon
 * Date: 25/7/2020
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 */
public class FindMinimuminRotatedSortedArray {

    /**
     * Time complexity: O(log2(n))
     * Space complexity: O(1)
     *
     * @param nums
     * @return
     */
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }

    /**
     * Brute force
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param nums
     * @return
     */
    public int findMinBF(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < min) min = num;
        }
        return min;
    }

    /**
     * Brute force
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param nums
     * @return
     */
    public int findMinBFstream(int[] nums) {
        return Arrays.stream(nums).min().getAsInt();
    }
}
