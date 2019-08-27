package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 2019-08-28
 * https://leetcode.com/problems/powx-n
 */
public class Pow {

    /**
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * @param x base
     * @param n exponent
     * @return x^n 
     */
    public double myPowIter(double x, int n) {
        if (n == 0) return 1.0;
        double res = 1;
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }

        for (int i = 0; i < n; i++) {
            res = res * x;
        }

        return res;
    }


    public double myPowRec(double x, int n) {
        if (n == 0) return 1.0;
        double temp = myPowRec(x, n / 2);

        if (n % 2 == 0) {
            return temp * temp;
        } else {
            if (n > 0) {
                return x * temp * temp;
            } else {
                return temp * temp / x;
            }
        }
    }

}
