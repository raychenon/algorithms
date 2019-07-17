package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 2019-07-15
 * https://leetcode.com/problems/search-insert-position/
 */
public class SearchInsertPositionTest {

    private static SearchInsertPosition searchInsertPosition;

    @BeforeClass
    public static void setUp() {
        searchInsertPosition = new SearchInsertPosition();
    }

    @Test
    public void testSearchInsert_WhenTargetIsInArray() {
        int sortedArray[] = {1, 3, 5, 6};
        int position = searchInsertPosition.searchInsert(sortedArray, 5);
        assertEquals(2, position);
    }

    @Test
    public void testSearchInsert_WhenTargetNotInArray() {
        int sortedArray[] = {1, 3, 5, 6};
        int position = searchInsertPosition.searchInsert(sortedArray, 2);
        assertEquals(1, position);
    }

    @Test
    public void testSearchInsert_WhenTargetIsBiggerThanArrayMax() {
        int sortedArray[] = {1, 3, 5, 6};
        int position = searchInsertPosition.searchInsert(sortedArray, 7);
        assertEquals(4, position);
    }

    @Test
    public void testSearchInsert_WhenTargetIsSmallerThanArrayMin() {
        int sortedArray[] = {1, 3, 5, 6};
        int position = searchInsertPosition.searchInsert(sortedArray, 0);
        assertEquals(0, position);
    }
}
