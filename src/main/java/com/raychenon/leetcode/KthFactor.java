package com.raychenon.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * User: raychenon
 * Date: 5/12/2020
 * https://leetcode.com/problems/the-kth-factor-of-n/
 */
public class KthFactor {

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param n
     * @param k
     * @return
     */
    public int kthFactorLinear(int n, int k) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (count == k) {
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * Time complexity: O(sqrt(n))
     * Space complexity: O(sqrt(n))
     *
     * @param n
     * @param k
     * @return
     */
    public int kthFactorSqrt(int n, int k) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i != n) list.add(n/i);
                if (++count == k) return i;
            }
        }
        if (list.size() + count < k) return -1;
        return list.get(list.size() - (k - count));
    }
}
