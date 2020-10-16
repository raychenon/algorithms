package com.raychenon.leetcode.matrix;

/**
 * User: raychenon
 * Date: 16/10/2020
 * https://leetcode.com/problems/search-a-2d-matrix/
 */
public class Search2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        if (row == 0) return false;
        int col = matrix[0].length;
        if (col == 0) return false;

        int l = 0;
        int r = row - 1;
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
