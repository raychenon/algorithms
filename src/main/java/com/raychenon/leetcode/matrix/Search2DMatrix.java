package com.raychenon.leetcode.matrix;

/**
 * User: raychenon
 * Date: 16/10/2020
 * https://leetcode.com/problems/search-a-2d-matrix/
 */
public class Search2DMatrix {

    /**
     * Binary Search template 1 https://leetcode.com/explore/learn/card/binary-search/125/template-i/938/
     * <p>
     * Time complexity: O( log2(row * col))
     * Space complexity: O(1)
     */
    public boolean searchMatrixBinarySearchTemplate1(int[][] matrix, int target) {
        int row = matrix.length;
        if (row == 0) return false;
        int col = matrix[0].length;
        if (col == 0) return false;

        int l = 0;
        int r = row * col - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int value = matrix[mid / col][mid % col];
            if (value == target) {
                return true;
            } else if (value < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return false;
    }

    /**
     * Consider the matrix (2D array) as a 1D array.
     * Time complexity: O( log2(row * col))
     * Space complexity: O(1)
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        if (row == 0) return false;
        int col = matrix[0].length;
        if (col == 0) return false;

        int l = 0;
        int r = row * col - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (matrix[mid / col][mid % col] < target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return matrix[r / col][r % col] == target;
    }
}
