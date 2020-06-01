package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 1/6/2020
 * https://leetcode.com/problems/edit-distance
 */
public class EditDistanceTest {

    private static EditDistance editDistance;

    @BeforeClass
    public static void setUp() {
        editDistance = new EditDistance();
    }

    @Test
    public void example1Test() {
        assertEditDistance(3, "horse", "ros");
    }

    @Test
    public void example2Test() {
        assertEditDistance(5, "intention", "execution");
    }

    @Test
    public void example3Test() {
        assertEditDistance(10, "zoologicoarchaeologist", "zoogeologist");
    }

    void assertEditDistance(int expected, String word1, String word2) {
        assertEquals(expected, editDistance.minDistance(word1, word2));
        assertEquals(expected, editDistance.minDistance1DArrayMemory(word1, word2));
    }

}
