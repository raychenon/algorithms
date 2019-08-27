package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 2019-08-28
 * https://leetcode.com/problems/powx-n
 */
public class Pow {

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
