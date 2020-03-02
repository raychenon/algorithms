package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 1/3/2020
 * https://leetcode.com/problems/string-compression/
 */
public class StringCompressionTest {


    private static StringCompression stringCompression;

    @BeforeClass
    public static void setUp() {
        stringCompression = new StringCompression();
    }

    @Test
    public void aabbcccTest() {
        assertEquals(6, stringCompression.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
    }

    @Test
    public void aabbaaaTest() {
        assertEquals(6, stringCompression.compress(new char[]{'a', 'a', 'b', 'b', 'a', 'a', 'a'}));
    }

    @Test
    public void aabbaaadeTest() {
        assertEquals(8, stringCompression.compress(new char[]{'a', 'a', 'b', 'b', 'a', 'a', 'a', 'd', 'e'}));
    }

    @Test
    public void moreThan10TimesTest() {
        // 11 times, "z10"
        assertEquals(3, stringCompression.compress(new char[]{'z', 'z', 'z', 'z', 'z', 'z', 'z', 'z', 'z', 'z'}));
    }


    @Test
    public void aTest() {
        assertEquals(1, stringCompression.compress(new char[]{'a'}));
    }

    @Test
    public void emptyCharTest() {
        assertEquals(0, stringCompression.compress(new char[]{}));
    }


}
