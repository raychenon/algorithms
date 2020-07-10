package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

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
        threeSumEval(Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1)), new int[]{-1, 0, 1, 2, -1, -4});
    }

    @Test
    public void example2Test() {
        threeSumEval(Arrays.asList(Arrays.asList(-5, 2, 3)), new int[]{-1, 3, 2, 1, -5, 5});
    }

    @Test
    public void lessThan3elementsTest() {
        threeSumEval(Arrays.asList(), new int[]{-1, 0});
        threeSumEval(Arrays.asList(), null);
    }


    private void threeSumEval(List<List<Integer>> expected, int[] nums) {
        List<List<Integer>> actual = threeSum.threeSum(nums);
        assertThat(expected, is(actual));
    }

}
