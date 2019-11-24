package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 2019-11-24
 * https://leetcode.com/problems/rotated-digits/
 */
public class RotatedDigits {

    public int rotatedDigits(int N) {
        int count = 0;
        for (int i = 1; i <= N; ++i) {
            if (isValid(i)) ++count;
        }
        return count;
    }

    private boolean isValid(int n) {
        StringBuilder str = new StringBuilder();

        while (n != 0) {
            int modulo = n % 10;
            // invalid digits: 3,4,7
            if (modulo == 3 || modulo == 4 || modulo == 7) {
                return false;
            }
            modulo = reversedDigit(modulo);
            str.append(modulo);
            n = n / 10;
        }

        str.reverse();

        return !String.valueOf(n).equals(str.toString());
    }

    private int reversedDigit(int n) {
        switch (n) {
            case 2:
                return 5;
            case 5:
                return 2;
            case 6:
                return 9;
            case 9:
                return 9;
            default:
                return n;
        }
    }

}
