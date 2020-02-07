package com.raychenon.leetcode;

import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * User: raychenon
 * Date: 6/2/2020
 * https://leetcode.com/problems/most-common-word/
 */
public class MostCommonWordTest {

    private static MostCommonWord instance;

    @BeforeClass
    public static void setUp() {
        instance = new MostCommonWord();
    }

    @Test
    public void example1Test() {
        String[] banned = {"hit"};
        test("ball", "Bob hit a ball, the hit BALL flew far after it was hit.", banned);
    }

    @Test
    public void example2Test() {
        String[] banned = {"a"};
        test("b", "a, a, a, a, b,b,b,c, c", banned);
    }

    private void test(String expected, String paragraph, String[] banned) {
        TestCase.assertEquals(expected,
                instance.mostCommonWord(paragraph, banned));
        TestCase.assertEquals(expected,
                instance.mostCommonWordOptimizedTrie(paragraph, banned));
    }
}
