package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 2019-09-18
 * https://github.com/raychenon/algorithms/issues/97
 */
public class FloodFill {
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int currentColor = image[sr][sc];
        if (currentColor != newColor) DFS(image, sr, sc, currentColor, newColor);
        return image;
    }

    private void DFS(int[][] image, int i, int j, int color, int targetColor) {
        if (image[i][j] == color) {
            image[i][j] = targetColor;
            if (i > 0) DFS(image, i - 1, j, color, targetColor); // left
            if (j > 0) DFS(image, i, j - 1, color, targetColor);  // top
            if (i < image.length - 1) DFS(image, i + 1, j, color, targetColor); // right
            if (j < image[0].length - 1) DFS(image, i, j + 1, color, targetColor); // top
        }
    }

}