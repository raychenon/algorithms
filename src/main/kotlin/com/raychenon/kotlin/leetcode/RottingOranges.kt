package com.raychenon.kotlin.leetcode

import java.util.*

/**
 * User: raychenon
 * Date: 16/2/2020
 * https://leetcode.com/problems/rotting-oranges/
 */
object RottingOranges {
    
    val FRESH: Int = 1
    val ROTTEN: Int = 2

    /**
     * Every minute, any fresh orange that is adjacent (4-directionally) to a rotten orange becomes rotten.
     * Return the minimum number of minutes that must elapse until no cell has a fresh orange.  If this is impossible, return -1 instead.
     * runtime complexity : O(n), where n is the number of cells in the grid.
     * space   complexity : O(n)
     **/
    fun orangesRotting(grid: Array<IntArray>): Int {
        // save where are the rotten oranges
        val queue = ArrayDeque<IntArray>()
        val visited = hashSetOf<Pair<Int, Int>>()
        for (i in 0 until grid.size) {
            for (j in 0 until grid[0].size) {
                if (grid[i][j] == ROTTEN) {
                    queue.add(intArrayOf(i, j))
                    visited.add(i to j)
                }
            }
        }
        // from the rotten orange positions
        var counter = 0

        val dir = arrayOf(
            intArrayOf(-1, 0),  // left
            intArrayOf(0, -1),  // top
            intArrayOf(0, 1),   // right
            intArrayOf(1, 0)    // bottom
        )

        while (!queue.isEmpty()) {
            val size = queue.size
            var wasFresh = false
            for (i in 0 until size) {
                val node = queue.poll()
                var x = node.get(0)
                var y = node.get(1)
                for (d in 0 until dir.size) {
                    val newX = x + dir[d][0]
                    val newY = y + dir[d][1]
                    if (newX >= 0 && newX < grid.size && newY >= 0 && newY < grid[0].size
                        && visited.contains(newX to newY).not()
                    ) {
                        if (grid[newX][newY] == FRESH) {
                            wasFresh = true
                            grid[newX][newY] = ROTTEN
                        }

                        if (grid[newX][newY] == ROTTEN) {
                            queue.add(intArrayOf(newX, newY))
                            visited.add(newX to newY)
                        }
                    }

                }
            }
            if (wasFresh) counter++
        }

        for (i in 0 until grid.size) {
            for (j in 0 until grid[0].size) {
                if (grid[i][j] == FRESH) {
                    return -1
                }
            }
        }

        return counter
    }
}