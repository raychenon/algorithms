package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 2019-10-18
 * https://leetcode.com/problems/sort-array-by-parity/
 */
public class SortArrayByParity {

    public int[] sortArrayByParity(int[] A) {
        int[] res = new int[A.length];
        int t = 0;

        // even
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) res[t++] = A[i];
        }

        // odd
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 1) res[t++] = A[i];
        }
        return res;
    }
}
