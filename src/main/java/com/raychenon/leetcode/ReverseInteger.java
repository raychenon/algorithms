package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 2019-08-25
 * https://leetcode.com/problems/reverse-integer/solution/
 */
public class ReverseInteger {

    /**
     * Time Complexity: O(N) ~ log10(n), N is the size of Array
     * Space Complexity: O(1)
     */
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
