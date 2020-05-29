package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 29/5/2020
 * https://leetcode.com/problems/possible-bipartition/
 */
public class PossibleBipartitionTest {

    private static PossibleBipartition instance;

    @BeforeClass
    public static void setUp() {
        instance = new PossibleBipartition();
    }

    @Test
    public void testExample1() {
        // 1 -> 3
        // 1 -> 2
        // 4  /
        int dislikes[][] = {{1, 2}, {1, 3}, {2, 4}};
        assertEquals(true, instance.possibleBipartition(4, dislikes));
    }

    @Test
    public void testExample2() {
        // 1 - 2
        //  |  |
        //   \ 3
        int dislikes[][] = {{1, 2}, {1, 3}, {2, 3}};
        assertEquals(false, instance.possibleBipartition(3, dislikes));
    }

    @Test
    public void testExample3() {
        // 1 - 2
        // 3 - 2
        // 3 - 4
        // 5 - 4
        // 1 - 5 , wrong 5 is already in the same group(or color) of 1
        int dislikes[][] = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {1, 5}};
        assertEquals(false, instance.possibleBipartition(5, dislikes));
    }


}
