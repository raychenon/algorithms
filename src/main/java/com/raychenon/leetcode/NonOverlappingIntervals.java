package com.raychenon.leetcode;

import java.util.Arrays;

/**
 * User: raychenon
 * Date: 2/9/2020
 * https://leetcode.com/problems/non-overlapping-intervals/
 */
public class NonOverlappingIntervals {

    /**
     * Time complexity: O(n*log(n)) ~ O(n*log(n) + n) , O(n*log(n)) due to the sort
     * Space complexity: O(n)
     *
     * @param intervals
     * @return
     */
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length < 2) {
            return 0;
        }
        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));

        int last = 0;
        int count = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[last][1]) {
                count++;
                if (intervals[i][1] < intervals[last][1]) last = i;
            } else {
                last = i;
            }
        }
        return count;
    }
}
