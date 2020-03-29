package com.raychenon.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * User: raychenon
 * Date: 28/3/2020
 * https://leetcode.com/problems/find-the-duplicate-number/
 */
public class FindTheDuplicateNumber {

    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * @param nums
     * @return
     */
    public int findDuplicateMemory(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {

            if (set.contains(num)) {
                return num;
            } else {
                set.add(num);
            }
        }

        return -1;
    }


    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param nums
     * @return
     */
    public int findDuplicate(int[] nums) {
        // there must be a duplicate
        if (nums.length <= 1) return -1;

        // find intersection point
        int tortoise = nums[0];
        int hare = nums[0];
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        // find entrance to the cycle
        int pt1 = nums[0];
        int pt2 = tortoise;
        while (pt1 != pt2) {
            pt1 = nums[pt1];
            pt2 = nums[pt2];
        }
        return hare;
    }

}
