package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 2019-11-22
 * https://leetcode.com/problems/maximize-distance-to-closest-person
 */
public class MaximumDistanceToClosestPerson {

    /**
     * Use 2 pointers method: left and right
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param seats
     * @return the maximum distance to closest person.
     */
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

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param seats
     * @return the maximum distance to closest person.
     */
    public int maxDistToClosestGroupByFreeSeats(int[] seats) {
        int N = seats.length;
        int K = 0; //current longest group of empty seats
        int ans = 0;

        // in the middle
        // 1, 0, 0, 0, 1, 0, 1
        // |     |     |
        // |    ans    |
        for (int i = 0; i < N; ++i) {
            if (seats[i] == 1) {
                K = 0;
            } else {
                ++K;
                ans = Math.max(ans, (K + 1) / 2);
            }
        }

        // 1 is on the right extremity
        //  0, 0, 0, 1
        //           |
        //          ans
        for (int i = 0; i < N; ++i)
            if (seats[i] == 1) {
                ans = Math.max(ans, i);
                break;
            }

        // the rest to the end is full of 0s
        // 1, 0, 0, 0
        //          |
        //         ans
        for (int i = N - 1; i >= 0; --i)
            if (seats[i] == 1) {
                ans = Math.max(ans, N - 1 - i);
                break;
            }

        return ans;
    }
}
