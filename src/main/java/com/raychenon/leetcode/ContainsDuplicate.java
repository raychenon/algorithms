package com.raychenon.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * User: raychenon
 * Date: 24/3/2020
 * https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicate {

    /**
     * time complexity: O(n * log(n))  due to Sorting
     * space complexity: O(1)
     */
    public boolean containsDuplicateSort(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) return true;
        }
        return false;
    }

    /**
     * time complexity: O(n)
     * space complexity: O(n)
     */
    public boolean containsDuplicateSet(int[] nums) {
        Set set = new HashSet<Integer>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }
}
