package com.raychenon.hackerrank.warmup;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 13/4/19
 * https://www.hackerrank.com/challenges/repeated-string/problem
 */
public class RepeatedStringTest {

    private static RepeatedString repeatedString;

    @BeforeClass
    public static void setUp() {
        repeatedString = new RepeatedString();
    }


    @Test
    public void assertforLetterARepeatedXTimes() {
        assertEquals(RepeatedString.repeatedString("a", 10000000000000L), 10000000000000L);
    }

    @Test
    public void assertForStrinNotContainingA() {
        assertEquals(RepeatedString.repeatedString("bcdf", 10000000000000L), 0L);
    }
    
    @Test
    public void assertForStringLengthWithRemainder() {
        assertEquals(RepeatedString.repeatedString("aba", 10L), 7L);
    }


}
