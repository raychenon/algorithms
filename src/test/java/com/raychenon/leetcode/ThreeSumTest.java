package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;

/**
 * User: raychenon
 * Date: 10/7/2020
 * https://leetcode.com/problems/3sum/
 */
public class ThreeSumTest {

    private static ThreeSum threeSum;

    @BeforeClass
    public static void setUp() {
        threeSum = new ThreeSum();
    }

    @Test
    public void example1Test() {
        threeSumEval(new int[][]{{-1, -1, 2}, {-1, 0, 1}}, new int[]{-1, 0, 1, 2, -1, -4});
    }

    private void threeSumEval(int[][] expected, int[] nums) {
        //assertEquals(expected, threeSum.threeSum(nums));
        List<List<Integer>>  actual = threeSum.threeSum(nums);
        for(int i=0;i<actual.size();i++){
            assertArrayEquals(expected[i],actual.get(i).toArray());
        }
    }

}
