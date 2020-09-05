package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 5/9/2020
 * https://leetcode.com/problems/partition-labels
 */
object PartitionLabels {

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