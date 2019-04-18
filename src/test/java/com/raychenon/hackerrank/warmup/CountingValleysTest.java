package com.raychenon.hackerrank.warmup;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 18/4/19
 * https://www.hackerrank.com/challenges/counting-valleys/problem
 */
public class CountingValleysTest {

    @Test
    public void assertCountOneValley() {
        //      _/\      _
        //         \    /
        //          \/\/
        assertEquals(1, CountingValleys.countingValleys(8, "UDDDUDUU"));
    }

    @Test
    public void assertCountTwoValleys() {
        //    sea level  _          /\
        //                \  /\    /
        //                 \/  \/\/
        assertEquals(2, CountingValleys.countingValleys(12, "DDUUDDUDUUUD"));
    }

    @Test
    public void assertCountAnyValleys() {
        assertEquals(1, CountingValleys.countingValleys(12, "DDanyUUDDUDU"));
    }
}
