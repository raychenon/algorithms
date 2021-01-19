package com.raychenon.leetcode;

import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * User: raychenon
 * Date: 19/1/2021
 * Time: 11:21 PM
 * https://leetcode.com/problems/count-sorted-vowel-strings/
 */
public class CountSortedVowelStringsTest {

    private static CountSortedVowelStrings instance;

    @BeforeClass
    public static void setUp() {
        instance = new CountSortedVowelStrings();
    }

    @Test
    public void example1Test() {
        assertCountSortedVowel(5, 1);
    }

    @Test
    public void example2Test() {
        assertCountSortedVowel(15, 2);
    }

    @Test
    public void example3Test() {
        assertCountSortedVowel(66045, 33);
    }

    void assertCountSortedVowel(int expected, int n) {
        TestCase.assertEquals(expected, instance.countVowelStringsDP(n));
    }
}
