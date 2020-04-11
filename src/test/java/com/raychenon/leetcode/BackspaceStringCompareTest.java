package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 9/4/2020
 * https://leetcode.com/problems/backspace-string-compare
 */
public class BackspaceStringCompareTest {


    private static BackspaceStringCompare instance;

    @BeforeClass
    public static void setUp() {
        instance = new BackspaceStringCompare();
    }

    @Test
    public void example1Test() {
        assertMethods("ab#c", "ad#c", true);
    }

    @Test
    public void example2Test() {
        assertMethods("ab##", "c#d#", true);
    }

    @Test
    public void example3Test() {
        assertMethods("a##c", "#a#c", true);
    }

    @Test
    public void example4Test() {
        assertMethods("a#c", "b", false);
    }

    @Test
    public void example5Test() {
        assertMethods("a#c", "#c", true);
    }

    private void assertMethods(String T, String S, boolean expected) {
        assertEquals(expected, instance.backspaceCompare(T, S));
    }


}
