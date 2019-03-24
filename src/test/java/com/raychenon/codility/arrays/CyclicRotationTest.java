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
    public void assertArrayRotation() {
        assertTrue(Arrays.equals(CyclicRotation.rotate(new int[]{1, 2, 3, 4}, 1), new int[]{2, 3, 4, 1}));
    }


    @Test
    public void assertArrayIdentityRotation() {
        assertTrue(Arrays.equals(CyclicRotation.rotate(new int[]{1, 2, 3, 4}, 0), new int[]{1, 2, 3, 4}));
        assertTrue(Arrays.equals(CyclicRotation.rotate(new int[]{1, 2, 3, 4}, 4), new int[]{1, 2, 3, 4}));
    }
}
