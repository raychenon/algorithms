package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 2019-09-18
 * https://github.com/raychenon/algorithms/issues/97
 */
public class FloodFill {

    public int[][] floodFill(int[][] image, int row, int col, int newColor) {
        int currentColor = image[row][col];
        if (currentColor != newColor) DFS(image, row, col, currentColor, newColor);
        return image;
    }

    private void DFS(int[][] image, int row, int col, int color, int targetColor) {
        if (image[row][col] == color) {
            image[row][col] = targetColor;
            if (row > 0) DFS(image, row - 1, col, color, targetColor); // top
            if (col > 0) DFS(image, row, col - 1, color, targetColor); // left
            if (row < image.length - 1) DFS(image, row + 1, col, color, targetColor);     // bottom
            if (col < image[0].length - 1) DFS(image, row, col + 1, color, targetColor);  // right
        }
    }

}