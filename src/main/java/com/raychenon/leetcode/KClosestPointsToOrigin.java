package com.raychenon.leetcode;

import java.util.Arrays;

/**
 * User: raychenon
 * Date: 31/5/2020
 * https://leetcode.com/problems/k-closest-points-to-origin/
 */
public class KClosestPointsToOrigin {

    public int[][] kClosestSort(int[][] points, int K) {
        int N = points.length;
        int[] dists = new int[N];
        for (int i = 0; i < N; ++i)
            dists[i] = distance(points[i]);

        Arrays.sort(dists);
        int distK = dists[K - 1];

        int[][] ans = new int[K][2];
        int t = 0;
        for (int i = 0; i < N; i++) {
            if (distance(points[i]) <= distK) {
                ans[t++] = points[i];
            }
        }
        return ans;
    }

    private int distance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}
