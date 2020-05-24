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
    public void emptyMatrixTest() {
        char[][] matrix = {{}};
        evaluateMaximalSquareOriginal(0, matrix);
    }

    @Test
    public void example1Test() {

        char[][] matrix = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };

        evaluateMaximalSquareOriginal(4, matrix);
    }

    @Test
    public void biggerMatrixTest() {

        // 2 matrix of size 9
        char[][] matrix = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '1', '1', '0'},
                {'1', '1', '1', '1', '1'},
                {'1', '1', '1', '1', '0'}
        };

        assertEquals(false, maximalSquare.isSquare(matrix,1,3,3,5));
        assertEquals(true, maximalSquare.isSquare(matrix,1,3,1,3));
        evaluateMaximalSquareOriginal(9, matrix);
    }

    @Test
    public void MatrixCoversRightColsTest() {

        // 2 matrix of size 4
        char[][] matrix = {
                {'1', '1', '0', '0'},
                {'1', '0', '1', '1'},
                {'1', '1', '1', '1'},
                {'1', '0', '1', '1'}
        };

        evaluateMaximalSquareOriginal(4, matrix);
    }

    @Test
    public void MatrixThatBroke1DTest() {
        char[][] matrix = {
                {'1', '0', '1', '1', '1'},
                {'0', '1', '0', '1', '0'},
                {'1', '1', '0', '1', '1'},
                {'1', '1', '0', '1', '1'},
                {'0', '1', '1', '1', '1'}
        };

        evaluateMaximalSquareOriginal(4, matrix);
    }

    void evaluateMaximalSquareOriginal(int expected, char[][] matrix) {
        assertEquals(expected, maximalSquare.maximalSquareOriginal(matrix));
        assertEquals(expected, maximalSquare.maximalSquareDP(matrix));
        assertEquals(expected, maximalSquare.maximalSquareDP1Dmemory(matrix));
    }


}
