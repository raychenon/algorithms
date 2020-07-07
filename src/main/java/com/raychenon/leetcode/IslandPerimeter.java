package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 7/7/2020
 * https://leetcode.com/problems/island-perimeter/
 */
public class IslandPerimeter {

    /**
     * Iterate each cells , IF land(1) then check all 4 adjacent cells (vertically, horizontally)
     * <p>
     * Time complexity: O(rows * cols)
     * Space complexity: O(1)
     */
    public int islandPerimeterCount1by1(int[][] grid) {
        int result = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 0) continue;

                if (r == 0 || grid[r - 1][c] == 0) result += 1; // top row or cell above
                if (r == rows - 1 || grid[r + 1][c] == 0) result += 1;   // bottom row or cell under

                if (c == 0 || grid[r][c - 1] == 0) result += 1;   // left
                if (c == cols - 1 || grid[r][c + 1] == 0) result += 1; // right side or s=cell on the right side
            }
        }

        return result;
    }

    /**
     * Time complexity: O(rows * cols)
     * Space complexity: O(1)
     */
    public int islandPerimeter(int[][] grid) {
        // https://www.youtube.com/watch?v=FkjFlNtTzc8
        int result = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    result += 4;

                    // above
                    if (i > 0 && grid[i - 1][j] == 1) {
                        result -= 2;
                        // why decrease by 2 ? | || |
                        // each intersecting edges 2 edges from 2 different cell marked 1 (land)
                    }

                    // left
                    if (j > 0 && grid[i][j - 1] == 1) {
                        result -= 2;
                    }
                }
            }
        }
        return result;
    }
}
