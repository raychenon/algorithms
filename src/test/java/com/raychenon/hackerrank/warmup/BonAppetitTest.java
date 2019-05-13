package com.raychenon.hackerrank.warmup;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 2019-05-12
 * https://www.hackerrank.com/challenges/bon-appetit/problem
 */
public class BonAppetitTest {

    private static BonAppetit bonAppetit;

    @BeforeClass
    public static void setUp() {
        bonAppetit = new BonAppetit();
    }

    @Test
    public void assertBillIsSplitCorrectly() {
        assertEquals("Bon Appetit", bonAppetit.calculateBillCharged(Arrays.asList(3, 10, 2, 9), 1, 7));
    }
    
    @Test
    public void assertAnnaIsRefundedCorrectly() {
        assertEquals("5", bonAppetit.calculateBillCharged(Arrays.asList(3, 10, 2, 9), 1, 12));
    }

}
