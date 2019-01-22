package com.raychenon.hackerrank;

import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 13/1/19
 */
public class AVeryBigSumTest {
    
    @Test
    public void assertSum() {
        long[] array1 = {1, 2, 3, 4, 5};
        assertEquals(AVeryBigSum.aVeryBigSum(array1), 15);

        long[] array2 = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        assertEquals(AVeryBigSum.aVeryBigSum(array2), 5000000015L);
    }

    @Test
    public void assertSumWithEmptyArray() {
        long[] emptyArray = {};
        assertEquals(AVeryBigSum.aVeryBigSum(emptyArray), 0);
    }

}
