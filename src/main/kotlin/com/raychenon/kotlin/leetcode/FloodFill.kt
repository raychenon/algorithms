package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-09-18
 * https://leetcode.com/problems/flood-fill
 */
object FloodFill {

    fun floodFill(image: Array<IntArray>, row: Int, col: Int, targetColor: Int): Array<IntArray> {
        val color = image[row][col]
        if (color != targetColor) DFS(image, row, col, color, targetColor)
        return image
    }

    private fun DFS(image: Array<IntArray>, row: Int, col: Int, fromColor: Int, targetColor: Int): Unit {
        if (image[row][col] == fromColor) {
            image[row][col] = targetColor
            if (row > 0) DFS(image, row - 1, col, fromColor, targetColor)                  // top
            if (col > 0) DFS(image, row, col - 1, fromColor, targetColor)                   // left
            if (row < image.size - 1) DFS(image, row + 1, col, fromColor, targetColor)     // bottom
            if (col < image[0].size - 1) DFS(image, row, col + 1, fromColor, targetColor)   // right
        }
    }
    
}