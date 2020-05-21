package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 21/5/2020
 * https://leetcode.com/problems/count-square-submatrices-with-all-ones
 * <p>
 * Given a m * n matrix of ones and zeros, return how many square submatrices (size 1*1,2*2,3*3,...,n*n) have all ones.
 */
public class CountSquareSubmatriceswithAllOnes {

    /**
     * Time complexity: O(row * col) :
     * Space complexity: O(1) : the matrix itself is used to store the dynamic programming data
     *
     * @param matrix
     * @return
     */
    public int countSquares(int[][] matrix) {
        int res = 0;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (matrix[r][c] > 0 && c > 0 && r > 0) {
                    matrix[r][c] = Math.min(matrix[r][c - 1], Math.min(matrix[r - 1][c], matrix[r - 1][c - 1])) + 1;
                }
                res += matrix[r][c];
            }
        }

        return res;
    }
}
