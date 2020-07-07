package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 7/7/2020
 * https://leetcode.com/problems/island-perimeter/
 */
public class IslandPerimeter {

    /**
     * Time complexity: O(rows * cols)
     * Space complexity: O(1)
     */
    public int islandPerimeter(int[][] grid) {
        // https://www.youtube.com/watch?v=FkjFlNtTzc8
        if (grid == null || grid.length == 0) return 0;
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
