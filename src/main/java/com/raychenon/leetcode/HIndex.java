package com.raychenon.leetcode;

import java.util.Arrays;

/**
 * User: raychenon
 * Date: 11/8/2020
 * https://leetcode.com/problems/h-index/
 */
public class HIndex {

    public int hIndex(int[] citations) {

        Arrays.sort(citations);
        int n = citations.length;
        int i = 1;
        for (i = 1; i <= n; i++) {
            if (citations[n - i] < i) break;
        }
        return i - 1;
    }
}
