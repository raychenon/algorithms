package com.raychenon.hackerrank;


/**
 * User: raychenon
 * Date: 13/1/19
 * https://www.hackerrank.com/challenges/a-very-big-sum/problem
 */
public class AVeryBigSum {
    
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
