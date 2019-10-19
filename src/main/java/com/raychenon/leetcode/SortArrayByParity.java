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
        int iEven = 0, iOdd = A.length - 1;
        while (iEven < iOdd) {
            // if left is odd and right is even, then swap
            if (A[iEven] % 2 > A[iOdd] % 2) {
                int tmp = A[iEven];
                A[iEven] = A[iOdd];
                A[iOdd] = tmp;
            }

            if (A[iEven] % 2 == 0) iEven++;
            if (A[iOdd] % 2 == 1) iOdd--;
        }

        return A;
    }
}
