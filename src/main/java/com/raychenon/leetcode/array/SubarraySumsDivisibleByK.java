package com.raychenon.leetcode.array;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/subarray-sums-divisible-by-k/
 * Array, Prefix sum
 */
public class SubarraySumsDivisibleByK {

    public int subarraysDivByK(int[] nums, int k) {
        var map = new HashMap<Integer, Integer>();
        map.put(0, 1);

        int count = 0;
        int sum = 0;
        for (int num : nums) {
            sum = (sum + num) % k;
            if (sum < 0) sum += k;
            count += map.getOrDefault(sum, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
