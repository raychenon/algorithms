package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 27/7/2020
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii
 */
public class FindMinimuminRotatedSortedArray2 {

    /**
     * Time complexity: O(log2(n))
     * Space complexity: O(1)
     *
     * @param nums
     * @return
     */
    public int findMin(int[] nums) {
        // binary search
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == nums[right]) {
                right = right - 1;
            } else if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }

    public int findMax(int[] nums) {
        // binary search
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == nums[left]) {
                left = left + 1;
            } else if (nums[left] < nums[mid]) {
                left = mid + 1;
            } else if (nums[left] > nums[mid]) {
                right = mid - 1;
            }
        }
        return nums[left];
    }
}
