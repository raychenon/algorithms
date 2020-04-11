package com.raychenon.leetcode;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 11/4/2020
 * https://leetcode.com/problems/single-number/
 */
public class SingleNumberTest {

    @Test
    public void example1Test() {
        int[] array = {2, 2, 1};
        assertEquals(1, SingleNumber.singleNumber(array));
    }

    @Test
    public void example2Test() {
        int[] array = {4, 1, 2, 1, 2};
        assertEquals(4, SingleNumber.singleNumber(array));
    }


}
