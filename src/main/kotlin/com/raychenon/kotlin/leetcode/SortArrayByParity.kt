package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-10-19
 * https://leetcode.com/problems/sort-array-by-parity
 */
object SortArrayByParity {

    /**
     * time complexity: O(n)
     * space complexity: O(n)
     *
     * @param A
     * @return an array consisting of all the even elements of A, followed by all the odd elements of A.
     */
    fun sortArrayByParity(A: IntArray): IntArray {
        var res = IntArray(A.size) { 0 }
        var p: Int = 0  // pointer

        // even numbers
        for (v in A) {
            if (v % 2 == 0) res[p++] = v
        }

        // odd numbers
        for (v in A) {
            if (v % 2 == 1) res[p++] = v
        }
        return res
    }

    /**
     * time complexity: O(n)
     * space complexity: O(1)
     *
     * @param A
     * @return an array consisting of all the even elements of A, followed by all the odd elements of A.
     */
    fun sortArrayByParityInPlace(A: IntArray): IntArray {
        var l = 0
        var r = A.size - 1

        while (l < r) {
            // if left is odd and right is even, then swap
            if (A.get(l) % 2 > A.get(r) % 2) {
                val tmp = A.get(l)
                A[l] = A.get(r)
                A[r] = tmp
            }

            if (A.get(l) % 2 == 0) l++
            if (A.get(r) % 2 == 1) r--
        }

        return A
    }
}