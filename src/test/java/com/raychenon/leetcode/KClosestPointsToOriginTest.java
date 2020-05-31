package com.raychenon.leetcode;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * User: raychenon
 * Date: 31/5/2020
 * https://leetcode.com/problems/k-closest-points-to-origin
 */
public class KClosestPointsToOriginTest {

    private static KClosestPointsToOrigin kClosestPointsToOrigin;

    @BeforeClass
    public static void setUp() {
        kClosestPointsToOrigin = new KClosestPointsToOrigin();
    }


    @Test
    public void example1Test() {
        evaluatekClosest(
                new int[][]{{-2, 2}},
                new int[][]{{1, 3}, {-2, 2}}, 1
        );
    }

    @Test
    public void example2Test() {
        evaluatekClosest(
                new int[][]{{3, 3}, {-2, 4}},
                new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2
        );
    }

    @Test
    public void exampleSameDistanceTest() {
        evaluatekClosest(
                new int[][]{{1, 1}, {-1, 1}},
                new int[][]{{1, 1}, {-1, 1}, {3, 3}, {5, -1}, {-2, 4}}, 2
        );
    }

    void evaluatekClosest(int[][] expected, int[][] points, int K) {
        Assert.assertArrayEquals(
                expected,
                kClosestPointsToOrigin.kClosestSort(points, K)
        );
        Assert.assertArrayEquals(
                expected,
                kClosestPointsToOrigin.kClosestQueue(points, K)
        );
    }

}
