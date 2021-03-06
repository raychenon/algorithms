package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 5/9/2020
 * https://leetcode.com/problems/partition-labels
 */
object PartitionLabels {

    /**
     * Greedy algorithm
     * Time Complexity O(n)
     * Space Complexity O(1)
     */
    fun partitionLabels(S: String): List<Int> {
        val last = IntArray(26)
        for (i in 0 until S.length) {
            last[S[i] - 'a'] = i
        }

        var j = 0
        var start = 0
        val list = mutableListOf<Int>()
        for (i in 0 until S.length) {
            j = maxOf(j, last[S[i] - 'a'])
            if (i == j) {
                val distance = i - start + 1
                list.add(distance)
                start = i + 1
            }
        }
        return list
    }

    /**
     * Time Complexity O(n)
     * Space Complexity O(1)
     */
    fun partitionLabelsOriginalSolution(S: String): List<Int> {
        val n = S.length
        val letMap = mutableMapOf<Char, Letter>()
        for (i in 0 until n) {
            val c = S[i]
            if (letMap.containsKey(c)) {
                letMap[c]!!.end = i
            } else {
                letMap.put(c, Letter(i, i))
            }
        }

//         for((l,v) in letMap){
//             println("v = ${v}")
//         }

        val sizeList = mutableListOf<Int>()

        // map sorted
        var start = 0
        var end = 0
        for (letter in letMap.values) {
            start = minOf(start, letter.start)

            if (letter.start > end) {
                val distance = end - start + 1
                //println("start > end , $end - $start = $distance")
                sizeList.add(distance)
                start = letter.start
            }
            end = maxOf(end, letter.end)
        }

        val distance = end - start + 1
        sizeList.add(distance)

        return sizeList
    }
}


data class Letter(
    val start: Int,
    var end: Int
)