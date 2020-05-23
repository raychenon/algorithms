package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 22/5/2020
 * https://leetcode.com/problems/maximal-square/
 * <p>
 * Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.
 */
public class MaximalSquare {

    /**
     * Dynamic programming with 1D array storage
     * Remember this formula for matrix
     * dp(i) = min(dp(i−1),dp(i),prev)+1.
     * ****   prev | dp[i]
     * --------------------
     * **  dp[i-1] | next dp[i]
     *
     * <p>
     * time complexity: O(row * col)
     * space complexity: O(col)
     *
     * @param matrix
     * @return
     */
    public int maximalSquareDP1Dmemory(char[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] dp = new int[cols + 1];
        int maxEdge = 0, prev = 0;

        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= cols; c++) {
                int temp = dp[c];
                if (matrix[r - 1][c - 1] == '1') {
                    dp[c] = Math.min(prev, Math.min(dp[c - 1], dp[c])) + 1;
                    maxEdge = Math.max(dp[c], maxEdge);
                } else {
                    dp[c] = 0;
                }
                prev = temp;
            }
        }
        return maxEdge * maxEdge;
    }

    /**
     * Dynamic programming  with 2D array storage
     * Remember this formula for matrix
     * dp(i,j) = min(dp(i−1,j),dp(i−1,j−1),dp(i,j−1))+1.
     * * dp[i-1][j-1] | dp[i-1][j]
     * ---------------------------
     * *** dp[i][j-1] | dp[i][j]
     * <p>
     * time complexity: O(row * col)
     * space complexity: O(row * col)
     *
     * @param matrix
     * @return
     */
    public int maximalSquareDP(char[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] dp = new int[rows + 1][cols + 1];
        int maxEdge = 0;

        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= cols; c++) {
                if (matrix[r - 1][c - 1] == '1') {
                    dp[r][c] = Math.min(dp[r - 1][c - 1], Math.min(dp[r - 1][c], dp[r][c - 1])) + 1;
                    maxEdge = Math.max(dp[r][c], maxEdge);
                }
            }
        }
        return maxEdge * maxEdge;
    }

    /**
     * Original submission
     * Brute force
     * time complexity: O((row * col)^2).
     * space complexity: O(1),
     *
     * @param matrix
     * @return
     */
    public int maximalSquareOriginal(char[][] matrix) {
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
        if (iEnd >= matrix.length) {
            return false;
        }
        if (jEnd >= matrix[0].length) {
            return false;
        }

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
