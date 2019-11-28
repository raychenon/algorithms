package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * User: raychenon
 * Date: 2019-11-07
 * https://leetcode.com/problems/game-of-life/
 */
public class GameOfLifeTest {


    private static GameOfLife gameOfLife;

    @BeforeClass
    public static void setUp() {
        gameOfLife = new GameOfLife();
    }

    @Test
    public void gameOfLifeTest() {
        int[][] grid = new int[][]{
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };
        int[][] expected = new int[][]{
                {0, 0, 0},
                {1, 0, 1},
                {0, 1, 1},
                {0, 1, 0}
        };

        gameOfLife.gameOfLife(grid);
        
        compareBoards(expected,grid);
    }

    public void compareBoards(int[][] expected, int[][] actual) {
        assertEquals(expected.length, actual.length);
        assertEquals(expected[0].length, actual[0].length);

        for (int i = 0; i < expected.length; ++i) {
            for (int j = 0; j < expected[0].length; ++j) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }
    }
}
