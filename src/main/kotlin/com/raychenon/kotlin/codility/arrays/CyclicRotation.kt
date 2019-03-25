package com.raychenon.kotlin.codility.arrays

/**
 * User: raychenon
 * Date: 24/3/19
 * https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
 */
object CyclicRotation {

    /**
     * extension function for IntArray
     */
    fun rotate(A: IntArray, K: Int): IntArray {
        val size = A.size
        var tab = A.copyOf()

        for ((index) in A.withIndex()) {
            val shift = (index + K) % size
            tab[shift] = A[index]
        }

        return tab
    }


}