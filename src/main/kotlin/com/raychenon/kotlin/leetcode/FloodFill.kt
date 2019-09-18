package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-09-18
 * https://leetcode.com/problems/flood-fill
 */
object FloodFill {

    fun floodFill(image: Array<IntArray>, i: Int, j: Int, targetColor: Int): Array<IntArray> {
        val color = image[i][j]
        if (color != targetColor) DFS(image, i, j, color, targetColor)
        return image
    }

    private fun DFS(image: Array<IntArray>, i: Int, j: Int, fromColor: Int, targetColor: Int): Unit {
        if (image[i][j] == fromColor) {
            image[i][j] = targetColor
            if (i > 0) DFS(image, i - 1, j, fromColor, targetColor)                 // left
            if (j > 0) DFS(image, i, j - 1, fromColor, targetColor)                 // top
            if (i < image.size - 1) DFS(image, i + 1, j, fromColor, targetColor)    // right
            if (j < image[0].size - 1) DFS(image, i, j + 1, fromColor, targetColor) // bottom
        }
    }

}