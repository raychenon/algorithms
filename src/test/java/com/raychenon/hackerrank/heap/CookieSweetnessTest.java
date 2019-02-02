package com.raychenon.hackerrank.heap;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: raychenon
 * Date: 2/2/19
 */
public class CookieSweetnessTest {

    @Test
    public void assertNbOperations4Cookie(){
        int[] arr = {1,2,3,9,10,12};
        assertEquals(CookiesSweetness.getNbOperationForCookies(7,arr),2);
        
        // 1 2 3 9 10 12
         // 8 90 13 47 74 12 89 74 18 38 can any one explain how it come 5 answer

        int[] arr1 = {13, 47, 74, 12, 89, 74, 18, 38};
        assertEquals(CookiesSweetness.getNbOperationForCookies(90,arr),5);
    }
}
