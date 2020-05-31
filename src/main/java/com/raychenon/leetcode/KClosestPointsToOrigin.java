package com.raychenon.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * User: raychenon
 * Date: 31/5/2020
 * https://leetcode.com/problems/k-closest-points-to-origin/
 */
public class KClosestPointsToOrigin {


    public int[][] kClosestQuickSelectSort(int[][] points, int K) {

        quickSelect(points,0,points.length-1,K);
        return Arrays.copyOfRange(points,0,K);
    }

    private void quickSelect(int[][] points ,int start, int end ,int k) {

        if(start<end){
            int pivot = partition(points,start,end);

            if(pivot == k)
                return;
            if(pivot< k)
                quickSelect(points, pivot+1,end,k);
            else
                quickSelect(points, start, pivot-1,k);
        }

    }

    private int partition(int[][] points ,int start, int end) {
        int[] pivot = points[end];
        int pIndex = start;

        while(start<end){
            if(distance(points[start]) <= distance(pivot)){
                swap(points,start,pIndex);
                pIndex++;
            }
            start++;
        }
        swap(points ,pIndex,end);
        return pIndex;
    }

    private void swap(int[][] points, int index1,int index2){
        int[] temp = points[index1];
        points[index1] = points[index2];
        points[index2] = temp;

    }

    public int[][] kClosestQueue(int[][] points, int K) {
        int N = points.length;
        Queue<int[]> queue = new PriorityQueue<>(new PointComparator());

        for (int i = 0; i < N; i++)
            queue.add(points[i]);

        int[][] ans = new int[K][2];
        for (int i = 0; i < K; i++) {
            ans[i] = queue.peek();
            queue.remove();
        }
        return ans;
    }

    class PointComparator implements Comparator<int[]> {
        @Override
        public int compare(int[] o1, int[] o2) {
            return distance(o1) - distance(o2);
        }
    }

    /**
     * Time complexity: O(N*log(N)) , due to sorting . N is the number of points
     * Space complexity: O(N)
     *
     * @param points
     * @param K
     * @return
     */
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
