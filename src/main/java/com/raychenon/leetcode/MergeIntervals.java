package com.raychenon.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * User: raychenon
 * Date: 2020-02-02
 * https://leetcode.com/problems/merge-intervals/
 */
public class MergeIntervals {

    /**
     * Time complexity: O(N * Log(N))  due to sorting
     * Space complexity: O(1)
     */
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;

        // Sort by ascending the left integer
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

        List<int[]> result = new LinkedList<>();
        int[] newInterval = intervals[0];
        result.add(newInterval);
        for (int[] interval : intervals) {
            if (interval[0] <= newInterval[1]) // Overlapping intervals, move the end if needed
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            else {                             // Disjoint intervals, add the new interval to the list
                result.add(interval);
                newInterval = interval;
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
