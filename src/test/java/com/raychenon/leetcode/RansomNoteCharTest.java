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
        assertEquals(false, instance.canConstruct("a", "b"));
    }

    @Test
    public void test2() {
        assertEquals(false, instance.canConstruct("aa", "ab"));
    }

    @Test
    public void test3() {
        assertEquals(true, instance.canConstruct("aa", "aab"));
    }
}
