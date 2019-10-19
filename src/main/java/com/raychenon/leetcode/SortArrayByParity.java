package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 2019-10-18
 * https://leetcode.com/problems/sort-array-by-parity/
 */
public class SortArrayByParity {

    /**
     * time complexity: O(n)
     * space complexity: O(n)
     *
     * @param A
     * @return an array consisting of all the even elements of A, followed by all the odd elements of A.
     */
    public int[] sortArrayByParityTwoPasses(int[] A) {
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

    /**
     * time complexity: O(n)
     * space complexity: O(1)
     *
     * @param A
     * @return an array consisting of all the even elements of A, followed by all the odd elements of A.
     */
    public int[] sortArrayByParityInPlace(int[] A) {
        int iLeft = 0, iRight = A.length - 1;
        while (iLeft < iRight) {
            // if left is odd and right is even, then swap
            if (A[iLeft] % 2 > A[iRight] % 2) {
                int tmp = A[iLeft];
                A[iLeft] = A[iRight];
                A[iRight] = tmp;
            }

            if (A[iLeft] % 2 == 0) iLeft++;
            if (A[iRight] % 2 == 1) iRight--;
        }

        return A;
    }
}
