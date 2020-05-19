package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 19/5/2020
 * https://leetcode.com/problems/permutation-in-string/
 */
public class PermutationinStringTest {

    private static PermutationinString permutationinString;

    @BeforeClass
    public static void setUp() {
        permutationinString = new PermutationinString();
    }

    @Test
    public void example1Test() {
        assertPermutationinStringMethods("ab", "eidbaooo", true);
    }

    @Test
    public void example2Test() {
        assertPermutationinStringMethods("ab", "eidboaoo", false);
    }

    @Test
    public void example3Test() {
        assertPermutationinStringMethods("acb", "ooeabidabcoaoo", true);
    }

    private void assertPermutationinStringMethods(String s1, String s2, boolean expected) {
        assertEquals(permutationinString.checkInclusion(s1, s2), expected);
    }

}
