package com.raychenon.leetcode;

import java.util.Arrays;

/**
 * User: raychenon
 * Date: 15/4/2020
 * https://leetcode.com/problems/contiguous-array/
 */
public class ContiguousArray {

    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * @param nums
     * @return
     */
    public int findMaxLength(int[] nums) {
        int[] arr = new int[2 * nums.length + 1];
        Arrays.fill(arr, -2);
        arr[nums.length] = -1;
        int maxLen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 0 ? -1 : 1);
            if (arr[count + nums.length] >= -1) {
                maxLen = Math.max(maxLen, i - arr[count + nums.length]);
            } else {
                arr[count + nums.length] = i;
            }
        }
        return maxLen;
    }
}
