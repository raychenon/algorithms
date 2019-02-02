package com.raychenon.hackerrank.heap;

import java.util.PriorityQueue;

/**
 * User: raychenon
 * Date: 1/2/19
 * https://www.hackerrank.com/challenges/jesse-and-cookies/problem
 */
public class CookiesSweetness {

    static int getNbOperationForCookies(int sweetnessLevelToReach, int[] cookies) {

        // always needs at least 2 cookies
        if (cookies.length < 2) {
            return -1;
        }

        int nbOperations = 0;
        // priority queue orders the numbers
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < cookies.length; i++) {
            queue.add(cookies[i]);
        }

        while (queue.size() > 1 && queue.peek() < sweetnessLevelToReach) {
            int leastSweet = queue.poll();
            int secondLeastSweet = queue.poll();
            // sweetness = (1 * Least sweet cookie) + (2 * 2nd least sweet cookie).
            queue.add(leastSweet + 2 * secondLeastSweet);
            nbOperations++;
        }

        return (queue.peek() < sweetnessLevelToReach) ? -1 : nbOperations;
    }
}
