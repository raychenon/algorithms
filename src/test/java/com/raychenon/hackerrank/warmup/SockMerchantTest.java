package com.raychenon.hackerrank.warmup;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 8/4/19
 * https://www.hackerrank.com/challenges/sock-merchant/problem
 */
public class SockMerchantTest {


    private static SockMerchant sockMerchant;

    @BeforeClass
    public static void setUp() {
        sockMerchant = new SockMerchant();
    }


    @Test
    public void assertPairingSock1() {

        int[] array = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        assertEquals(sockMerchant.sockMerchant(array.length, array), 3);
    }

    @Test
    public void assertPairingSock2() {

        int[] array = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        assertEquals(sockMerchant.sockMerchant(array.length, array), 4);
    }


    @Test
    public void assertEmptyPairOfSock() {

        int[] array = {};
        assertEquals(sockMerchant.sockMerchant(array.length, array), 0);
    }

}
