package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 25/4/2020
 * https://leetcode.com/problems/bitwise-and-of-numbers-range/
 * <p>
 * Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.
 * Reformulation: "given two integer numbers, we are asked to find the common prefix of their binary strings."
 */
public class BitwiseANDofNumbersRange {

    /**
     * 1 right shift both numbers to the right to get their common prefix (most significant bit)
     * 2 left shift by the number of common prefix
     * Time Complexity: O(1), the number of iterations is bounded by the number of bits that an integer has, which is fixed
     * Space Complexity: O(1)
     *
     * @param m
     * @param n
     * @return
     */
    public int rangeBitwiseAndShift(int m, int n) {
        int shift = 0;
        while (m < n) {
            m >>= 1;
            n >>= 1;
            shift++;
        }
        return m << shift;
    }

    /**
     * Brian Kernighan's Algorithm : n AND (n-1), the rightmost bit is 0
     * Time Complexity: O(1), the number of iterations is bounded by the number of bits that an integer has, which is fixed
     * Space Complexity: O(1)
     *
     * @param m
     * @param n
     * @return the bitwise AND of all numbers in this range, inclusive
     */
    public int rangeBitwiseAndKernighan(int m, int n) {
        while (m < n) {
            n = n & (n - 1);
        }
        return m & n;
    }


    public int rangeBitwiseAnd(int m, int n) {
        if (getMSBposition(n) != getMSBposition(m)) return 0;

        while (m < n) {
            n -= (n & -n);
        }
        return n;
    }

    // most significant bit
    int getMSBposition(int n) {
        if (n == 0)
            return 0;

        int msb = 0;
        while (n != 0) {
            n = n / 2;
            msb++;
        }

        return (1 << msb);
    }
}
