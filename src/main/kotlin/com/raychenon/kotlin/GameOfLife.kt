package com.raychenon.kotlin

/**
 * User: raychenon
 * Date: 2019-09-16
 * https://leetcode.com/problems/game-of-life/
 */
object GameOfLife {

    val live = 1
    val dead = 0

    fun nextGen(grid: Array<IntArray>): Array<IntArray> {
        val sizeX = grid.size
        val sizeY = grid.get(0).size

        var mutableGrid: Array<IntArray> = grid.clone()

        for (i in 0 until grid.size) {
            for (j in 0 until grid.get(0).size) {
                grid[i][j] = if (nextGenInOneCell(grid, i, j)) live else dead
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
    private fun nextGenInOneCell(grid: Array<IntArray>, x: Int, y: Int): Boolean {

        // save states
        var countAlive: Int = 0

        countAlive += countCellAlive(grid, x, y - 1) // Top
        countAlive += countCellAlive(grid, x + 1, y - 1) // Top right
        countAlive += countCellAlive(grid, x - 1, y - 1) // Top left
        countAlive += countCellAlive(grid, x - 1, y) // Left
        countAlive += countCellAlive(grid, x + 1, y) // Right
        countAlive += countCellAlive(grid, x, y + 1) // Bottom
        countAlive += countCellAlive(grid, x + 1, y + 1) // Bottom right
        countAlive += countCellAlive(grid, x - 1, y + 1) // Bottom left

        return if (grid.get(x).get(y) == live) {
            when (countAlive) {
                0, 1 -> false   // rule 1
                2 -> true       // rule 3
                3 -> true
                else -> false   // rule 2
            }
        } else {
            when (countAlive) {
                3 -> true
                else -> false   // rule 4
            }
        }
    }

    private fun countCellAlive(grid: Array<IntArray>, x: Int, y: Int): Int {
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