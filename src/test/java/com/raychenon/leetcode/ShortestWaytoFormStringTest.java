package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 2019-10-14
 * https://leetcode.com/problems/shortest-way-to-form-string/
 */
public class ShortestWaytoFormStringTest {

    private static ShortestWaytoFormString shortestWaytoFormString;

    @BeforeClass
    public static void setUp() {
        shortestWaytoFormString = new ShortestWaytoFormString();
    }

    @Test
    public void example1Test() {
        assertEquals(2, shortestWaytoFormString.shortestWay("abc", "abcbc"));
    }

    @Test
    public void example2Test() {
        assertEquals(-1, shortestWaytoFormString.shortestWay("abc", "acdbc"));
    }

    @Test
    public void example3Test() {
        assertEquals(3, shortestWaytoFormString.shortestWay("xyz", "xzyxz"));
    }

}
