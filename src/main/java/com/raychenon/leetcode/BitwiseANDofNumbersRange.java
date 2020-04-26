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

    public int rangeBitwiseAndShift(int m, int n) {
        int shift = 0;
        while (m < n) {
            m >>= 1;
            n >>= 1;
            shift++;
        }
        return m << shift;
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
