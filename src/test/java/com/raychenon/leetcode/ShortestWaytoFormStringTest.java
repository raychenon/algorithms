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
        assertShortestWayMethods(2, "abc", "abcbc");
    }

    @Test
    public void example2Test() {
        assertShortestWayMethods(-1, "abc", "acdbc");
    }

    @Test
    public void example3Test() {
        assertShortestWayMethods(3, "xyz", "xzyxz");
    }

    @Test
    public void duplicateCharInSourceTest() {
        // aab ab ab aaa a
        assertShortestWayMethods(5, "aaab", "aabababaaaa");
    }

    void assertShortestWayMethods(int expectedValue, String source, String target) {
        assertEquals(expectedValue, shortestWaytoFormString.shortestWayPointers(source, target));
        assertEquals(expectedValue, shortestWaytoFormString.shortestWayInvertedIndex(source, target));
    }

}
