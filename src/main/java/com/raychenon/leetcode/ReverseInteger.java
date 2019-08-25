package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 2019-08-25
 * https://leetcode.com/problems/reverse-integer/solution/
 */
public class ReverseInteger {

    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int pop = x % 10;
            x = x / 10;
            reversed = reversed * 10 + pop;
        }
        return reversed;
    }
}
