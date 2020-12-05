package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 5/12/2020
 * https://leetcode.com/problems/the-kth-factor-of-n/
 */
public class KthFactor {

    public int kthFactorLinear(int n, int k) {
        int count = 0;
        for (int i = 1; i <= n ; i++) {
            if (n % i == 0) {
                count++;
                if (count == k) {
                    return i;
                }
            }
        }
        return -1;
    }
}
