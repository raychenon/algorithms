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

        // group by pair
        for (int i = 0; i < ar.length; i++) {
            int value = ar[i];
            if (map.containsKey(value)) {
                map.put(value, map.get(value));
            } else {
                map.put(value, 1);
            }
        }

        int pairSock = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pairSock = pairSock + entry.getValue() / 2;

        }

        return pairSock;
    }

}
