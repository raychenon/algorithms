package com.raychenon.kotlin.leetcode


/**
 * User: raychenon
 * Date: 2019-10-13
 * https://leetcode.com/problems/shortest-way-to-form-string/
 */
object ShortestWaytoFormString {

    /**
     * time complexity: O(S*T) , where S: length of source and T: length of target
     *
     */
    fun shortestWayPointers(source: String, target: String): Int {
        var count = 0
        var i = 0
        while (i < target.length) {
            /**
             * source : "xyz"
             * |x| z | y | x | z |
             * <-----><--><------>
             */
            val startI = i  // index in target at each cycle
            for (c in source) {
                if (i < target.length && target.get(i).equals(c)) {
                    i++
                }
            }

            // if the pointer on targer didn't move, this letter is not contained in "source" then return -1
            if (startI == i) {
                return -1
            }
            count++
        }
        return count
    }


    /**
     * Inverted index data structure
     * dictIndex[i][c - 'a'] represents the earliest index >= i where character c occurs in source.
     * <p>
     * time complexity:  O(S+T) , where S is the length of source and T is the length of target
     * space complexity: O(S)
     *
     * @param source
     * @param target
     * @return
     */
    fun shortestWayInvertedIndex(source: String, target: String): Int {

        
        val mapIdx = mutableListOf<Map<Char, Int>>()
        for ((i, c) in source.withIndex()) {
            var map = mutableMapOf<Char, Int>()
            for ((j, ch) in source.withIndex()) {
                map.put(ch, j)
            }
            mapIdx.add(map)
        }


        var mapIdx: Map<Char, Array<Int>> = mutableMapOf()

        for ((i, c) in source.withIndex()) {
            if (mapIdx.containsKey(c)) {
                mapIdx[c]!![i] = i
            } else {
                val idx = IntArray(source.length)
                idx[]
                mapIdx[c]!![i] = i
            }
        }

        val cs = source.toCharArray()
        val ts = target.toCharArray()

        var j = 0
        var res = 1
        var i = 0
        while (i < ts.size) {
            if (j == cs.size) {
                j = 0
                res++
            }
            if (mapIdx.get(j).getOrDefault(ts.get(0), -1) == -1) return -1
            j = mapIdx.get(j).getOrDefault(ts.get(i), 0)
            if (j == 0) {
                res++
                i--
            }
            i++
        }
        return res
    }
}