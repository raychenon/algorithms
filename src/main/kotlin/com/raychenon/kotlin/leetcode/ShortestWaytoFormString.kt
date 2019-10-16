package com.raychenon.kotlin.leetcode

import java.util.*


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

        val Empty = -1
        val S = source.length
        val dictIndex = Array(S) { IntArray(26) }

        dictIndex[S - 1].fill(Empty)  // -1 means no that char in source
        dictIndex[S - 1][source[S - 1] - 'a'] = S - 1


        for (x in S - 2 downTo 0) {
            dictIndex[x] = Arrays.copyOf(dictIndex[x + 1], 26)
            dictIndex[x][source[x] - 'a'] = x
        }

        var count = 0
        var idx = 0
        for (c in target) {
            if (dictIndex[0][c - 'a'] == Empty) return -1
            if (dictIndex[idx][c - 'a'] == Empty) {
                count++
                idx = 0
            }

            idx = dictIndex[idx][c - 'a'] + 1
            if (idx == S) {
                count++
                idx = 0
            }
        }

        return count + (if (idx == 0) 0 else 1)
    }

    /**
     * Inverted index data structure with a Map
     * dictIndex[i][c - 'a'] represents the earliest index >= i where character c occurs in source.
     * <p>
     * time complexity:  O(S+T) , where S is the length of source and T is the length of target
     * space complexity: O(S)
     *
     */
    fun shortestWayMap(source: String, target: String): Int {
        var dictIndex = arrayOfNulls<Map<Char, Int>>(source.length)

        /**
         * dicIndex is the Inverted Index of string "source"
         * For any index in source, each letter is mapped to its index.
         * If there are duplicate letters, the letter is mapped to its leftmost index
         * source: aaab
         * [0] = [a ->0 , b->3]
         * [1] = [a ->1 , b->3]
         * [2] = [a ->2 , b->3]
         * [3] = [b->3]
         */
        for (i in source.length - 1 downTo 0) {
            var map = mutableMapOf<Char, Int>()
            for (j in i..source.length - 1) {
                map.put(source.get(j), j)
            }
            map.put(source.get(i), i)
            dictIndex[i] = map
        }

        var count = 0
        var index = 0
        for (c in target) {
            if (!dictIndex.get(0)!!.containsKey(c)) return -1
            if (!dictIndex.get(index)!!.containsKey(c)) {
                index = 0
                count++
            }
            index = dictIndex.get(index)!!.getOrDefault(c, 0) + 1
            if (index == source.length) {
                index = 0
                count++
            }
        }

        return count
    }

}