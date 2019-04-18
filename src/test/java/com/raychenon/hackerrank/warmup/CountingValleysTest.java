package com.raychenon.hackerrank.warmup;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 18/4/19
 * https://www.hackerrank.com/challenges/counting-valleys/problem
 */
public class CountingValleysTest {


    private static CountingValleys countingValleys;

    @BeforeClass
    public static void setUp() {
        countingValleys = new CountingValleys();
    }


    @Test
    public void assertCountOneValley() {
        //      _/\      _
        //         \    /
        //          \/\/
        assertEquals(1, countingValleys.countingValleys(8, "UDDDUDUU"));
    }

    @Test
    public void assertCountTwoValleys() {
        //    sea level  _          /\
        //                \  /\    /
        //                 \/  \/\/
        assertEquals(2, countingValleys.countingValleys(12, "DDUUDDUDUUUD"));
    }

    @Test
    public void assertCountAnyValleys() {
        assertEquals(1, countingValleys.countingValleys(12, "DDanyUUDDUDU"));
    }
}
