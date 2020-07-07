package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 7/7/2020
 * https://leetcode.com/problems/island-perimeter/
 */
object IslandPerimeter {

    /**
     * Time complexity: O(rows * cols)
     * Space complexity: O(1)
     */
    fun islandPerimeter(grid: Array<IntArray>): Int {
        val rows = grid.size
        val cols = grid[0].size

        var res = 0
        for (r in 0 until rows) {
            for (c in 0 until cols) {
                if (grid[r][c] == 0) {
                    continue
                }

                res += 4
                if (r > 0 && grid[r - 1][c] == 1) {
                    res -= 2
                }
                if (c > 0 && grid[r][c - 1] == 1) {
                    res -= 2
                }
            }
        }

        return res
    }
}