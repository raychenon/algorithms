package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 2019-11-22
 * https://leetcode.com/problems/maximize-distance-to-closest-person
 */
public class MaximumDistanceToClosestPerson {

    public int maxDistToClosest(int[] seats) {
        int N = seats.length;
        int left = -1, right = 0;
        int ans = 0;

        for (int i = 0; i < N; ++i) {
            if (seats[i] == 1) {
                left = i;
            } else {
                while (right < N && seats[right] == 0 || right < i) {
                    ++right;
                }

                int l = left == -1 ? N : i - left;
                int r = right == N ? N : right - i;
                ans = Math.max(ans, Math.min(l, r));
            }
        }

        return ans;
    }
}
