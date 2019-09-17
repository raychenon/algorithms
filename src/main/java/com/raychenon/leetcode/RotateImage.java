package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 2019-09-17
 * https://leetcode.com/problems/rotate-image/solution/
 */
public class RotateImage {

    /**
     * Rotate clockwise
     * time complexity: O(n^2)
     * space complexity: O(1)
     *
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        int size = matrix.length;
        for (int i = 0; i < (size + 1) / 2; i++) {
            for (int j = 0; j < size / 2; j++) {
                int temp = matrix[size - 1 - j][i];
                matrix[size - 1 - j][i] = matrix[size - 1 - i][size - j - 1];
                matrix[size - 1 - i][size - j - 1] = matrix[j][size - 1 - i];
                matrix[j][size - 1 - i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }

}
