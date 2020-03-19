package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * User: raychenon
 * Date: 17/3/2020
 * https://leetcode.com/problems/move-zeroes/
 */
public class MoveZeroesTest {

    private static MoveZeroes instance;

    @BeforeClass
    public static void setUp() {
        instance = new MoveZeroes();
    }

    @Test
    public void moveZeroesTest() {
        int[] input = {0, 1, 0, 3, 12};
        instance.moveZeroes(input);

        int[] expected = {1, 3, 12, 0, 0};
        assertArrayEquals(expected, input);
    }

    @Test
    public void moveZeroesTest2() {
        int[] input = {0, 1, 0, 3, 4, 5, 6, 0, 6, 0, 0, 12};
        instance.moveZeroes(input);

        int[] expected = {1, 3, 4, 5, 6, 6, 12, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, input);
    }

}
