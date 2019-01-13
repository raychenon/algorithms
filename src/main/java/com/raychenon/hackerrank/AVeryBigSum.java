package com.raychenon.hackerrank;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * User: raychenon
 * Date: 13/1/19
 * https://www.hackerrank.com/challenges/a-very-big-sum/problem
 */
public class AVeryBigSum {

    public static void main(String[] args) {
        long[] array1 = {1, 2, 3, 4, 5};
        System.out.println("aVeryBigSum " + aVeryBigSum(array1) + "  15");
        long[] array2 = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        System.out.println("aVeryBigSum " + aVeryBigSum(array2) + "  5000000015");
    }

    /**
     * time complexity : O(n)
     * space complexity :  O(1)
     * @param ar
     * @return sum
     */
    static long aVeryBigSum(long[] ar) {
        long sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

}
