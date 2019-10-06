package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 2019-10-06
 * Time: 14:39
 */
public class IntersectionOfSortedArraysTest {


    private static IntersectionOfSortedArrays instance;

    @BeforeClass
    public static void setUp() {
        instance = new IntersectionOfSortedArrays();
    }

    @Test
    public void threeSortedArraysTest() {
        int arr1[] = {1, 3, 5, 6};
        int arr2[] = {1, 2, 5, 7, 9};
        int arr3[] = {1, 3, 4, 5, 8};

        List<Integer> expectedResults = Arrays.asList(1, 5);

        List<Integer> results = instance.arraysIntersection(arr1, arr2, arr3);
        assertEquals(expectedResults, results);
    }


    @Test
    public void noIntersectionInArraysTest() {
        int arr1[] = {1, 3, 5, 6};
        int arr2[] = {2, 7};
        int arr3[] = {8};

        List<Integer> expectedResults = Arrays.asList();

        List<Integer> results = instance.arraysIntersection(arr1, arr2, arr3);
        assertEquals(expectedResults, results);
    }

}
