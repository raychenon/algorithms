package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 2019-08-28
 * https://leetcode.com/problems/powx-n
 */
public class Pow {

    /**
     * Exponentiation by squaring
     * https://en.wikipedia.org/wiki/Exponentiation_by_squaring
     * <p>
     * Time Complexity: O(log(n)), where 'n' is the exponent
     * Space Complexity: O(1)
     */
    public double myPow(double x, int n) {
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        if (n == 0) return 1.0;

        double res = 1;

        while (n > 1) {
            // if n is even
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                res = res * x;
                n = (n - 1) / 2;
            }
            x = x * x;

        }

        return res * x;
    }


    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     *
     * @param x base
     * @param n exponent
     * @return x^n
     */
    public double myPowIter(double x, int n) {
        if (n == 0) return 1.0;
        double res = 1;
        if (n < 0) {
            n = Math.abs(n);
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
