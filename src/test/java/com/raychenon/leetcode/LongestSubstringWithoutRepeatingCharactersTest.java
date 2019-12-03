package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 2019-12-03
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubstringWithoutRepeatingCharactersTest {

    private static LongestSubstringWithoutRepeatingCharacters instance;

    @BeforeClass
    public static void setUp() {
        instance = new LongestSubstringWithoutRepeatingCharacters();
    }

    @Test
    public void example1Test() {
        assertEquals(3, instance.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void example2Test() {
        assertEquals(1, instance.lengthOfLongestSubstring("bbbbbb"));
    }

    @Test
    public void example3Test() {
        assertEquals(3, instance.lengthOfLongestSubstring("pwwkew"));
    }

}
