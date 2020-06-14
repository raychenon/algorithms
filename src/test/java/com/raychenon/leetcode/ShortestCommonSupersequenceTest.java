package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 10/6/2020
 * https://leetcode.com/problems/shortest-common-supersequence/
 */
public class ShortestCommonSupersequenceTest {

    private static ShortestCommonSupersequence shortestCommonSupersequence;

    @BeforeClass
    public static void setUp() {
        shortestCommonSupersequence = new ShortestCommonSupersequence();
    }

    @Test
    public void example1Test() {
        assertEquals("cabac", shortestCommonSupersequence.shortestCommonSupersequence("abac", "cab"));
    }

}
