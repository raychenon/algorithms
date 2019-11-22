package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 2019-11-22
 * https://leetcode.com/problems/maximize-distance-to-closest-person/
 */
public class MaximumDistanceToClosestPersonTest {


    private static MaximumDistanceToClosestPerson instance;

    @BeforeClass
    public static void setUp() {
        instance = new MaximumDistanceToClosestPerson();
    }

    @Test
    public void example1Test() {
        int input[] = {1, 0, 0, 0, 1, 0, 1};
        //             <-----|----->
        assertEquals(2, instance.maxDistToClosest(input));
    }


    @Test
    public void noOneonRightTest() {
        int input[] = {1, 0, 0, 0};
        //             |-------->
        assertEquals(3, instance.maxDistToClosest(input));
    }


    @Test
    public void noOneonLeftTest() {
        int input[] = {0, 0, 0, 1};
        //             <--------|
        assertEquals(3, instance.maxDistToClosest(input));
    }

    @Test
    public void middleEvenTest() {
        int input[] = {1, 0, 0, 1};
        //             |--->
        assertEquals(1, instance.maxDistToClosest(input));
    }

    @Test
    public void middleOddTest() {
        int input[] = {1, 0, 0, 0, 1};
        //             |-----><----|
        assertEquals(2, instance.maxDistToClosest(input));
    }
}
