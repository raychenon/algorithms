package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 2019-10-29
 * https://leetcode.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefixTest {

    private static LongestCommonPrefix instance;

    @BeforeClass
    public static void setUp() {
        instance = new LongestCommonPrefix();
    }


    @Test
    public void flPrefixTest() {
        String input[] = {"flower", "flow", "flight"};
        assertEquals("fl", instance.longestCommonPrefix(input));
    }

    @Test
    public void shorterStringTest() {
        String input[] = {"aa", "a", "aab"};
        assertEquals("a", instance.longestCommonPrefix(input));
    }

    @Test
    public void noCommonPrefixTest() {
        String input[] = {"dog", "racecar", "car"};
        assertEquals("", instance.longestCommonPrefix(input));
    }

    @Test
    public void emptyArrayTest() {
        String input[] = {};
        assertEquals("", instance.longestCommonPrefix(input));
    }

    @Test
    public void sameStringTest() {
        String input[] = {"sam", "sam", "sam"};
        assertEquals("sam", instance.longestCommonPrefix(input));
    }
}
