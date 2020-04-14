package com.raychenon.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * User: raychenon
 * Date: 14/4/2020
 * https://leetcode.com/problems/two-sum/
 * <p>
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 */
public class TwoSum {

    /**
     * Time complexity: O(n) , with one iteration through the array
     * Space complexity: O(n)
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(); // value, index
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
