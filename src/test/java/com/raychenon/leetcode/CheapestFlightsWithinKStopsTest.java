package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 15/6/2020
 * https://leetcode.com/problems/cheapest-flights-within-k-stops/
 */
public class CheapestFlightsWithinKStopsTest {

    private static CheapestFlightsWithinKStops instance;

    @BeforeClass
    public static void setUp() {
        instance = new CheapestFlightsWithinKStops();
    }

    @Test
    public void flight1Test() {
        assertMethods(200,
                3, new int[][]{{0, 1, 100}, {1, 2, 100}, {0, 2, 500}}, 0, 2, 1);
    }

    @Test
    public void flight2Test() {
        assertMethods(500,
                3, new int[][]{{0, 1, 100}, {1, 2, 100}, {0, 2, 500}}, 0, 2, 0);
    }

    private void assertMethods(int expected, int n, int[][] flights, int src, int dst, int K) {
        assertEquals(expected, instance.findCheapestPriceBF(n, flights, src, dst, K));
    }
}
