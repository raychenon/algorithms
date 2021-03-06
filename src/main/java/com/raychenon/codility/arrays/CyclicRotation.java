package com.raychenon.codility.arrays;

/**
 * User: raychenon
 * Date: 24/3/19
 * https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
 */
public class CyclicRotation {

    /**
     * Given
     * A = [1, 2, 3, 4]
     * K = 4
     * the function should return [1, 2, 3, 4]
     *
     * @param A
     * @param K
     * @return
     */
    public int[] rotate(int[] A, int K) {
        int size = A.length;
        int[] tab = new int[size];

        for (int i = 0; i < size; i++) {
            int index = (i + K) % size;
            tab[index] = A[i];
        }

        return tab;
    }
}
