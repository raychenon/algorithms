package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-10-06
 * https://leetcode.com/problems/intersection-of-three-sorted-arrays/
 */
object IntersectionOfSortedArrays {

    /**
     * Use pointers to save memory instead of using Set collections
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * @param arr1
     * @param arr2
     * @param arr3
     * @return
     */
    fun arraysIntersection(arr1: IntArray, arr2: IntArray, arr3: IntArray): List<Int> {
        var results = mutableListOf<Int>()
        var i1: Int = 0
        var i2: Int = 0
        var i3: Int = 0

        while ((i1 < arr1.size) && (i2 < arr2.size) && (i3 < arr3.size)) {
            val min = Math.min(arr1.get(i1), Math.min(arr2.get(i2), arr3.get(i3)))

            // Trick better codecov.io : replace by (min == arr1.get(i1) && min == arr2.get(i2) && min == arr3.get(i3))
            if (min == arr1.get(i1)) {
                if (min == arr2.get(i2)) {
                    if (min == arr3.get(i3)) {
                        results.add(min)
                    }
                }
            }

            if (arr1.get(i1) == min) {
                i1++
            }
            if (arr2.get(i2) == min) {
                i2++
            }
            if (arr3.get(i3) == min) {
                i3++
            }
        }

        return results
    }
}