package com.raychenon.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * User: raychenon
 * Date: 2019-10-06
 * https://leetcode.com/problems/intersection-of-three-sorted-arrays/
 */
public class IntersectionOfSortedArrays {

    /**
     * Use pointers to save memory instead of using Set collections
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * @param arr1
     * @param arr2
     * @param arr3
     * @return
     */
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        List<Integer> results = new LinkedList<>();
        while (i1 < arr1.length && i2 < arr2.length && i3 < arr3.length) {

            int min = Math.min(arr1[i1], Math.min(arr2[i2], arr3[i3]));
            if (arr1[i1] == min && arr2[i2] == min && arr3[i3] == min) results.add(min);
            // min is going to be equal to all int in the arrays
            if (arr1[i1] == min) i1++;
            if (arr2[i2] == min) i2++;
            if (arr3[i3] == min) i3++;
        }
        return results;
    }
}
