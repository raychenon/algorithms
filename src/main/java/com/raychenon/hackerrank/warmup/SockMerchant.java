package com.raychenon.hackerrank.warmup;

import java.util.HashMap;
import java.util.Map;

/**
 * User: raychenon
 * Date: 8/4/19
 * https://www.hackerrank.com/challenges/sock-merchant/problem
 */
public class SockMerchant {

    int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < n; i++) {
            int value = ar[i];
            map.compute(value, (k, v) -> v == null ? 1 : v + 1);
        }
        System.out.println("Map = " + map);

        int pairSock = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            // only complete pairs are counted.
            // odd number are round down . ex: 3/2 = 1
            pairSock = pairSock + entry.getValue() / 2;
        }


        return pairSock;
    }

}
