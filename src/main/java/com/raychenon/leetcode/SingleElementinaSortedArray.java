package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 13/5/2020
 * https://leetcode.com/problems/single-element-in-a-sorted-array/
 * <p>
 * You are given a sorted array consisting of only integers where every element appears exactly twice,
 * except for one element which appears exactly once. Find this single element that appears only once.
 */
public class SingleElementinaSortedArray {

    /**
     * XOR of the same number equals to 0.
     * By iterating all elements, every numbers appearing twice will be eliminated, only the single number will remain
     * Time complexity: O(n), still linear even if the array is unsorted
     * Space complexity: O(1)
     *
     * @param nums
     * @return single number
     */
    public int singleNonDuplicateXOR(int[] nums) {

        int single = nums[0];
        for (int i = 1; i < nums.length; i++) {
            single = single ^ nums[i];    // XOR
        }
        return single;
    }

    /**
     * Brut force
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param nums
     * @return ex : nums = [1,1,2,3,3,5,5]
     * the unique number is always on Even indexes( nums[2] == 2)
     */
    public int singleNonDuplicateBrut(int[] nums) {
        int size = nums.length;

        for (int i = 0; i < size - 1; i = i + 2) {
            if (nums[i] != nums[i + 1])
                return nums[i];
        }
        return nums[size - 1];
    }

    /**
     * Binary Search
     * <p>
     * The single element is at the first even index not followed by its pair
     * Before the unique number, the pair starts with EVEN index.
     * After the unique number, the pa starts with ODD index.
     *
     * <p> nums = [1,1, ... , s   ,     100,100,...,500,500]
     * <p> indexes 0         i%2==0     i100 % 2 == 1
     * <p>
     * Time complexity: O(log2(n))
     * Space complexity: O(1)
     *
     * @param nums
     * @return
     */
    public int singleNonDuplicateBinarySearch(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (mid % 2 == 1) mid--;
            if (nums[mid] == nums[mid + 1]) {
                lo = mid + 2;
            } else {
                hi = mid;
            }
        }
        return nums[lo];
    }
}
