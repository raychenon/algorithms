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
        TestCase.assertEquals("ball",
                instance.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", banned));
    }

    @Test
    public void example2Test() {
        String[] banned = {"a"};
        TestCase.assertEquals("b",
                instance.mostCommonWord("a, a, a, a, b,b,b,c, c", banned));
    }

}
