package com.raychenon.leetcode;

import java.util.Arrays;

/**
 * User: raychenon
 * Date: 11/8/2020
 * https://leetcode.com/problems/h-index/
 */
public class HIndex {

    /**
     * Time complexity: 0(n*log(n)) = 0(n*log(n)) + O(n)
     * Space complexity: O(1)
     *
     * @param citations
     * @return
     */
    public int hIndex(int[] citations) {

        Arrays.sort(citations);   // 0(n*log(n))
        int n = citations.length;
        int i = 1;
        while (i <= n && (citations[n - i] >= i)) {
            i++;
        }
        return i - 1;
    }

    /**
     * Counting sort
     * <p>
     * Time complexity: 0(n)
     * Space complexity: O(n)
     *
     * @param citations
     * @return
     */
    public int hIndexBucketSort(int[] citations) {
        int n = citations.length;
        int[] frequencyPapers = new int[n + 1];

        // count papers for each citations
        for (int c : citations) {
            frequencyPapers[Math.min(n, c)]++;
        }

        // find the h-index
        int hIndex = n;
        for (int j = frequencyPapers[n]; hIndex > j; j += frequencyPapers[hIndex]) {
            hIndex--;
        }
        return hIndex;
    }
}
