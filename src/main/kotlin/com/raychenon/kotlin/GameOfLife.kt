package com.raychenon.kotlin

/**
 * User: raychenon
 * Date: 2019-09-16
 * https://leetcode.com/problems/game-of-life/
 */
object GameOfLife {

    val live = 1
    val dead = 0

    fun gameOfLife(grid: Array<IntArray>): Array<IntArray> {
        val sizeX = grid.size
        val sizeY = grid.get(0).size

        var mutableGrid: Array<IntArray> = grid.clone()

        for (i in 0 until grid.size) {
            for (j in 0 until grid.get(0).size) {
                grid[i][j] = (nextGenInOneCell(grid, i, j))
            }
        }
        return mutableGrid
    }

    /**
     *
    1. Any live cell with fewer than two live neighbours dies, as if caused by underpopulation.
    2. Any live cell with more than three live neighbours dies, as if by overcrowding.
    3. Any live cell with two or three live neighbours lives on to the next generation.
    4. Any dead cell with exactly three live neighbours becomes a live cell.
     */
    private fun nextGenInOneCell(grid: Array<IntArray>, x: Int, y: Int): Int {

        // save states
        var countAlive: Int = 0

        countAlive += countAdjacentLivingCell(grid, x, y - 1)        // Top
        countAlive += countAdjacentLivingCell(grid, x + 1, y - 1) // Top right
        countAlive += countAdjacentLivingCell(grid, x - 1, y - 1) // Top left
        countAlive += countAdjacentLivingCell(grid, x - 1, y)        // Left
        countAlive += countAdjacentLivingCell(grid, x + 1, y)        // Right
        countAlive += countAdjacentLivingCell(grid, x, y + 1)        // Bottom
        countAlive += countAdjacentLivingCell(grid, x + 1, y + 1) // Bottom right
        countAlive += countAdjacentLivingCell(grid, x - 1, y + 1) // Bottom left

        return if (grid.get(x).get(y) == live) {
            when (countAlive) {
                0, 1 -> dead    // rule 1
                2, 3 -> live    // rule 3
                else -> dead    // rule 2
            }
        } else {
            when (countAlive) {
                3 -> live
                else -> dead    // rule 4
            }
        }
    }

    private fun countAdjacentLivingCell(grid: Array<IntArray>, x: Int, y: Int): Int {
        val sizeY = grid.get(0).size
        val sizeX = grid.size

        if ((y >= 0 && y < sizeY) && (x >= 0 && x < sizeX)) {
            return if (grid.get(x).get(y) == live) 1 else 0
        } else {
            // outside grid
            return 0
        }
    }
}