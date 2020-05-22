package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 22/5/2020
 * https://leetcode.com/problems/maximal-square/
 * <p>
 * Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.
 */
public class MaximalSquare {

    public int maximalSquare(char[][] matrix) {
        int area = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    //System.out.println("loop i = " + i + " j = " + j);
                    int jStart = j;
                    boolean squareCondition = true;
                    while (++j < matrix[0].length && matrix[i][j] == '1' && squareCondition) {
                        int jEnd = j;
                        int diff = (jEnd - jStart);
                        squareCondition = isSquare(matrix, i, i + diff, jStart, jEnd);
                        if (squareCondition) {
                            diff++;
                            int cArea = diff * diff;
                            area = Math.max(cArea, area);
                        }

                    }
                    j = jStart;
                    // IF there is a "1" in matrix , the area is at least 1
                    area = Math.max(1, area);
                }
            }
        }
        return area;
    }

    boolean isSquare(char[][] matrix, int iStart, int iEnd, int jStart, int jEnd) {
        if (iEnd >= matrix.length || jEnd >= matrix[0].length) return false;

        for (int i = iStart; i <= iEnd; i++) {
            for (int j = jStart; j <= jEnd; j++) {
                if (matrix[i][j] == '0') {
                    return false;
                }
            }
        }
        return true;
    }
}
