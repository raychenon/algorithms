package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 2019-11-06
 * https://leetcode.com/problems/custom-sort-string/
 */
public class CustomSortStringTest {

    private static CustomSortString instance;

    @BeforeClass
    public static void setUp() {
        instance = new CustomSortString();
    }

    @Test
    public void customSort_cbad_Test() {
        assertEquals("cbad", instance.customSortString("cba", "abcd"));
    }

    @Test
    public void customSort_cbaaxxyyzz_Test() {
        assertEquals("cbaaxxyyzz", instance.customSortString("cba", "bxzyacaxyz"));
    }
}
                    