package com.raychenon.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * User: raychenon
 * Date: 4/6/2020
 * https://leetcode.com/problems/insert-interval/
 */
public class InsertInterval {

    /**
     * Time complexity: O(N) , N is the number of subarrays in intervals
     * Space complexty: O(N)
     *
     * @param intervals
     * @param newInterval
     * @return
     */
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new LinkedList<>();
        int newStart = newInterval[0];
        int newEnd = newInterval[1];
        boolean isAfterNewEnd = false;

        for (int[] e : intervals) {
            if (e[1] < newStart) {
                result.add(e); // start
            } else if (newEnd < e[0]) {
                if (!isAfterNewEnd) {
                    result.add(new int[]{newStart, newEnd});
                    isAfterNewEnd = true;
                }
                result.add(e); // end
            } else {
                newStart = Math.min(newStart, e[0]);
                newEnd = Math.max(newEnd, e[1]);
            }
        }

        if (!isAfterNewEnd) {
            result.add(new int[]{newStart, newEnd});
        }

        return result.toArray(new int[result.size()][2]);
    }

    /**
     * Time complexity: O(N) , N is the number of subarrays in intervals
     * Space complexty: O(N)
     *
     * @param intervals
     * @param newInterval
     * @return
     */
    public int[][] insertLeetcode(int[][] intervals, int[] newInterval) {
        int newStart = newInterval[0];
        int newEnd = newInterval[1];
        LinkedList<int[]> output = new LinkedList<>();
        int size = intervals.length;

        int index = 0;
        // 1 . Add to the output all the intervals starting before newInterval.
        while (index < size && newStart > intervals[index][0]) {
            output.add(intervals[index++]);
        }

        // 2 . Add to the output all the intervals starting before newInterval.
        int[] interval = new int[2];
        // no overlap, add empty interval
        if (output.isEmpty() || output.getLast()[1] < newStart) {
            output.add(interval);
        } else {
            // if overlap, merge with last interval
            interval = output.removeLast();
            interval[1] = Math.max(interval[1], newEnd);
            output.add(interval);
        }

        // 3 . Add the next intervals one by one, merge if needed.
        while (index < size) {
            interval = intervals[index++];
            int start = interval[0];
            int end = interval[1];
            // no overlap, just add an interval
            if (output.getLast()[1] < start) {
                output.add(interval);
            }
            // if there is an overlap, merge with the last interval
            else {
                interval = output.removeLast();
                interval[1] = Math.max(interval[1], end);
                output.add(interval);
            }
        }

        return output.toArray(new int[output.size()][2]);
    }
}
