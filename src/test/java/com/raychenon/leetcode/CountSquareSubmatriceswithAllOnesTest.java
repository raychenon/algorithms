package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 21/5/2020
 * https://leetcode.com/problems/count-square-submatrices-with-all-ones/
 */
public class CountSquareSubmatriceswithAllOnesTest {
    private static CountSquareSubmatriceswithAllOnes countSquareSubmatriceswithAllOnes;

    @BeforeClass
    public static void setUp() {
        countSquareSubmatriceswithAllOnes = new CountSquareSubmatriceswithAllOnes();
    }

    @Test
    public void example1Test() {
        int[][] matrix = {
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 1, 1, 1}
        };
        /**
         * 0    0   0   0   0
         * 0    0   1   1   1
         * 0    1   1   2   2
         * 0    0   1   2   3
         */
        assertEquals(15, countSquareSubmatriceswithAllOnes.countSquares(matrix));
    }

    @Test
    public void example2Test() {
        int[][] matrix = {
                {1, 0, 1},
                {1, 1, 0},
                {1, 1, 0}
        };
        assertEquals(7, countSquareSubmatriceswithAllOnes.countSquares(matrix));
    }

}
