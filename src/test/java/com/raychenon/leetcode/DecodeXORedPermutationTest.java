package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * User: raychenon
 * Date: 24/1/2021
 * https://leetcode.com/problems/decode-xored-permutation/discuss/1031840/Explanations-XOR-and-1st-element-Java-Kotlin-Python
 */
public class DecodeXORedPermutationTest {

    private static DecodeXORedPermutation instance;

    @BeforeClass
    public static void setUp() {
        instance = new DecodeXORedPermutation();
    }

    @Test
    public void decode0Test() {
        decodeTest(new int[]{1, 3, 2}, new int[]{2, 1});
    }

    @Test
    public void decode1Test() {
        decodeTest(new int[]{1, 2, 3}, new int[]{3, 1});
    }

    @Test
    public void decode2Test() {
        decodeTest(new int[]{2, 4, 1, 5, 3}, new int[]{6, 5, 4, 6});
    }

    @Test
    public void decode3Test() {
        decodeTest(new int[]{6, 1, 4, 2, 9, 7, 8, 3, 5}, new int[]{7, 5, 6, 11, 14, 15, 11, 6});
    }

    @Test
    public void decode4Test() {
        decodeTest(new int[]{6, 4, 2, 1, 5, 3, 7, 8, 9}, new int[]{2, 6, 3, 4, 6, 4, 15, 1});
    }

    void decodeTest(int[] perm, int[] encoded) {
        assertArrayEquals(perm, instance.decode(encoded));
//        assertArrayEquals(encoded, Contest44.rayDecode(perm))
    }
}
