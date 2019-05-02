package com.raychenon.hackerrank.warmup;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 2019-04-29
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
 */
public class JumpingOnTheCloudsTest {

    private static JumpingOnTheClouds jumpingOnTheClouds;

    @BeforeClass
    public static void setUp() {
        jumpingOnTheClouds = new JumpingOnTheClouds();
    }

    @Test
    public void assertSample0() {
        assertEquals(4, jumpingOnTheClouds.jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 0}));
    }

    @Test
    public void assertSample1() {
        assertEquals(3, jumpingOnTheClouds.jumpingOnClouds(new int[]{0, 0, 0, 1, 0, 0}));
    }

    @Test
    public void assertOnlyCloudsSizeEven() {
        assertEquals(3, jumpingOnTheClouds.jumpingOnClouds(new int[]{0, 0, 0, 0, 0, 0}));
    }

}
