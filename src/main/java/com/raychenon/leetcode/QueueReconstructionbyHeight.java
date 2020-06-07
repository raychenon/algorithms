package com.raychenon.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * User: raychenon
 * Date: 7/6/2020
 * https://leetcode.com/problems/queue-reconstruction-by-height/
 */
public class QueueReconstructionbyHeight {

    public int[][] reconstructQueue(int[][] people) {

        // sort by height (index 0), then by K (index 1)
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[0] != o2[0]) ? -o1[0] + o2[0] : o1[1] - o2[1];
            }
        });
        List<int[]> result = new LinkedList<>();
        for (int[] cur : people) {
            result.add(cur[1], cur);
        }

        return result.toArray(new int[people.length][]);
    }
}
