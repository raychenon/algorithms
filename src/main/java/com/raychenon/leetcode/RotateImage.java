package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 2019-09-17
 * https://leetcode.com/problems/rotate-image/solution/
 */
public class RotateImage {

    /**
     * The basic idea is that we process the matrix from outer to inner.
     * First we process the outer circle of the matrix,
     * and then the inner circle until the side length of the last inner circle is smaller than 2
     * (meaning there is only one center element left).
     * <p>
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
                matrix[size - 1 - j][i] = matrix[size - 1 - i][size - j - 1];   // bottom left = bottom right
                matrix[size - 1 - i][size - j - 1] = matrix[j][size - 1 - i];   // bottom right = top right
                matrix[j][size - 1 - i] = matrix[i][j];                         // top right = top left
                matrix[i][j] = temp;                                            // top left = bottom left
            }
        }
    }

}
