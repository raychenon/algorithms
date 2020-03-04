package com.raychenon.leetcode;

import java.math.BigInteger;

/**
 * User: raychenon
 * Date: 3/3/2020
 * https://leetcode.com/problems/add-binary
 */
public class AddBinary {

    /**
     *
     * time complexity: O(A+B)
     * space complexity: O(max(A+B))
     * @param a
     * @param b
     * @return
     */
    public String addBinary(String a, String b) {
        BigInteger x = new BigInteger(a, 2);
        BigInteger y = new BigInteger(b, 2);
        BigInteger zero = new BigInteger("0", 2);
        BigInteger carry, answer;
        while (y.compareTo(zero) != 0) {
            answer = x.xor(y);
            carry = x.and(y).shiftLeft(1);
            x = answer;
            y = carry;
        }
        return x.toString(2);
    }
}
