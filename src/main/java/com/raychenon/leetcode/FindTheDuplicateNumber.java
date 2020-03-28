package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 28/3/2020
 * https://leetcode.com/problems/find-the-duplicate-number/
 */
public class FindTheDuplicateNumber {

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param nums
     * @return
     */
    public int findDuplicate(int[] nums) {
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
