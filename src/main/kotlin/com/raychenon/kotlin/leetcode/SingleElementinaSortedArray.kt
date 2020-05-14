package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 14/5/2020
 * https://leetcode.com/problems/single-element-in-a-sorted-array/
 */
object SingleElementinaSortedArray {

    /**
     * XOR of the same number equals to 0.
     * By iterating all elements, every numbers appearing twice will be eliminated, only the single number will remain
     * Time complexity: O(n), still linear even if the array is unsorted
     * Space complexity: O(1)
     *
     * @param nums
     * @return single number
     */
    fun singleNonDuplicateXOR(nums: IntArray): Int {
        var single = nums[0]
        for (i in 1 .. nums.size-1) {
            single = single xor nums[i] // XOR
        }
        return single
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
    fun singleNonDuplicateBrut(nums: IntArray): Int {
        val size = nums.size
        var i = 0
        while (i < size - 1) {
            if (nums[i] != nums[i + 1]) return nums[i]
            i = i + 2
        }
        return nums[size - 1]
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
     */
    fun singleNonDuplicateBinarySearch(nums: IntArray): Int {
        var low = 0
        var high = nums.size - 1
        while (low < high) {
            var mid = low + (high - low) / 2
            if (mid % 2 == 1) {
                mid--
            }
            if (nums[mid] == nums[mid + 1]) { // mid index is at EVEN index
                low = mid + 2
            } else {
                high = mid
            }
        }
        return nums[low]
    }
}