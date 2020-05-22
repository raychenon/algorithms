package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 22/5/2020
 * https://leetcode.com/problems/maximal-square/
 */
public class MaximalSquareTest {

    private static MaximalSquare maximalSquare;

    @BeforeClass
    public static void setUp() {
        maximalSquare = new MaximalSquare();
    }

    @Test
    public void example1Test() {

        char[][] matrix = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };

        assertEquals(4, maximalSquare.maximalSquare(matrix));
    }


}
