package com.raychenon.hackerrank.heap;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: raychenon
 * Date: 2/2/19
 */
public class CookieSweetnessTest {

    @Test
    public void assertNbOperations4Cookie() {
        int[] orderedArr = {1, 2, 3, 9, 10, 12};
        assertEquals(CookiesSweetness.getNbOperationForCookies(7, orderedArr), 2);

        int[] unorderedArr = {12, 3, 2, 9, 10, 1};
        assertEquals(CookiesSweetness.getNbOperationForCookies(7, unorderedArr), 2);


        int[] biggerArr = {13, 47, 74, 12, 89, 74, 18, 38};
        assertEquals(CookiesSweetness.getNbOperationForCookies(90, biggerArr), 5);
    }

    @Test
    public void assertEmptyCookie() {
        int[] emptyArr = {};
        assertEquals(CookiesSweetness.getNbOperationForCookies(7, emptyArr), -1);
        assertEquals(CookiesSweetness.getNbOperationForCookies(0, emptyArr), -1);

    }

    @Test
    public void assertSingleCookie() {
        int[] singleCookie1 = {1};
        assertEquals(CookiesSweetness.getNbOperationForCookies(10, singleCookie1), -1);

        int[] singleCookie2 = {10};
        assertEquals(CookiesSweetness.getNbOperationForCookies(5, singleCookie2), 0);
    }

}
