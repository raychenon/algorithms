package com.raychenon.codility.arrays;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;

/**
 * User: raychenon
 * Date: 24/3/19
 * https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
 */
public class CyclicRotationTest {

    @Test
    public void assertArrayFullRotation() {
        assertTrue(Arrays.equals(CyclicRotation.rotate(new int[]{1, 2, 3, 4}, 1), new int[]{4, 1, 2, 3}));
        assertTrue(Arrays.equals(CyclicRotation.rotate(new int[]{1, 2, 3, 4}, 2), new int[]{3, 4, 1, 2}));
        assertTrue(Arrays.equals(CyclicRotation.rotate(new int[]{1, 2, 3, 4}, 3), new int[]{2, 3, 4, 1}));
    }


    @Test
    public void assertCyclicRotation() {
        assertTrue(Arrays.equals(CyclicRotation.rotate(new int[]{3, 8, 9, 7, 6}, 3), new int[]{9, 7, 6, 3, 8}));
    }


    @Test
    public void assertArrayIdentityRotation() {
        assertTrue(Arrays.equals(CyclicRotation.rotate(new int[]{1, 2, 3, 4}, 0), new int[]{1, 2, 3, 4}));
        assertTrue(Arrays.equals(CyclicRotation.rotate(new int[]{1, 2, 3, 4}, 4), new int[]{1, 2, 3, 4}));
    }
}
