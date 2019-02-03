package com.raychenon.hackerrank.heap;

import java.util.PriorityQueue;

/**
 * User: raychenon
 * Date: 1/2/19
 * https://www.hackerrank.com/challenges/jesse-and-cookies/problem
 */
public class CookiesSweetness {

    /**
     * time complexity : O(n)
     * space complexity : O(n)
     *
     * @param sweetnessLevelToReach
     * @param cookies
     * @return number of operations
     */
    static int getNbOperationForCookies(int sweetnessLevelToReach, int[] cookies) {

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

        int lastCookieSweetness = queue.peek() == null ? -1 : queue.peek();
        if (lastCookieSweetness < sweetnessLevelToReach) {
            return -1;
        } else {
            return nbOperations;
        }
    }
}
