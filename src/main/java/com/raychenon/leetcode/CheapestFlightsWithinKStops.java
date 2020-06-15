package com.raychenon.leetcode;

import java.util.Arrays;

/**
 * User: raychenon
 * Date: 15/6/2020
 * https://leetcode.com/problems/cheapest-flights-within-k-stops
 */
public class CheapestFlightsWithinKStops {

    /**
     * Bellman-Ford
     * Time complexity: O(nb_flights * K), nb_flights size of array of flights (edges)
     * Space complexity: O(n), n number of vertices
     *
     * @param n
     * @param flights
     * @param src
     * @param dst
     * @param K
     * @return
     */
    public int findCheapestPriceBF(int n, int[][] flights, int src, int dst, int K) {
        int[] dpPrices = new int[n];
        Arrays.fill(dpPrices, Integer.MAX_VALUE);
        dpPrices[src] = 0;
        for (int i = 0; i <= K; i++) {
            int[] tmp = Arrays.copyOf(dpPrices, n);
            for (int[] f : flights) {
                int cur = f[0], next = f[1], price = f[2];
                if (dpPrices[cur] == Integer.MAX_VALUE)
                    continue;
                tmp[next] = Math.min(tmp[next], dpPrices[cur] + price);
            }
            dpPrices = tmp;
        }
        return dpPrices[dst] == Integer.MAX_VALUE ? -1 : dpPrices[dst];
    }
}
