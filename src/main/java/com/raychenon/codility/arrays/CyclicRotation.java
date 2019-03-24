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
    public static int[] rotate(int[] A, int K) {
        int size = A.length;
        int[] tab = new int[size];
        int rotation = K % size;

        for (int i = 0; i < size; i++) {
            int index = i + rotation;
            if (index > size - 1) {
                index = index - size;
            }
            tab[i] = A[index];
        }

        for (int i = 0; i < size; i++) {
            System.out.println(String.format("%d ", tab[i]));
        }



        return tab;
    }
}
