package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 25/4/2020
 * https://leetcode.com/problems/bitwise-and-of-numbers-range/
 */
public class BitwiseANDofNumbersRange {

    public int rangeBitwiseAndBruteForce(int m, int n) {
        int res = m;
        for (int i = m + 1; i <= n; i++) {
            res = res & i;
        }
        return res;
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
