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
     * Space complexty: O(1)
     * @param intervals
     * @param newInterval
     * @return
     */
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new LinkedList<>();
        int newStart = newInterval[0];
        int newEnd = newInterval[1];
        boolean isAfterNewEnd = false;

        for (int[] e : intervals) {
            if (e[1] < newStart) {
                list.add(e); // start
            } else if (newEnd < e[0]) {
                if (!isAfterNewEnd) {
                    list.add(new int[]{newStart, newEnd});
                    isAfterNewEnd = true;
                }
                list.add(e); // end
            } else {
                newStart = Math.min(newStart, e[0]);
                newEnd = Math.max(newEnd, e[1]);
            }
        }

        return list.toArray(new int[list.size()][2]);
    }
}
