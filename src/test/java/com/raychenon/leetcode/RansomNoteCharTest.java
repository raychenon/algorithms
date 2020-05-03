package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 2019-09-16
 * https://leetcode.com/problems/ransom-note/
 */
public class RansomNoteCharTest {

    private static RansomNoteChar instance;

    @BeforeClass
    public static void setUp() {
        instance = new RansomNoteChar();
    }

    @Test
    public void test1() {
        compareCanConstructRansomMethods(false, "a", "b");
    }

    @Test
    public void test2() {
        compareCanConstructRansomMethods(false, "aa", "ab");
    }

    @Test
    public void test3() {
        compareCanConstructRansomMethods(true, "aa", "aab");
    }

    public void compareCanConstructRansomMethods(boolean expected, String ransom, String magazine) {
        assertEquals(expected, instance.canConstruct(ransom, magazine));
        assertEquals(expected, instance.canConstructArray(ransom, magazine));
    }

}