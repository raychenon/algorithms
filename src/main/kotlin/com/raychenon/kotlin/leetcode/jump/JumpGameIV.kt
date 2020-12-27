package com.raychenon.kotlin.leetcode.jump

import java.util.*
import kotlin.collections.HashSet

/**
 * User: raychenon
 * Date: 27/12/2020
 * https://leetcode.com/problems/jump-game-iv/
 */
object JumpGameIV {

    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     * @param arr
     */
    fun minJumps(arr: IntArray): Int {
        val n = arr.size
        if (n <= 1) return 0

        val graph = mutableMapOf<Int, MutableList<Int>>()
        for (i in 0 until n) {
            if (!graph.containsKey(arr[i])) {
                graph[arr[i]] = LinkedList<Int>()
            }
            graph[arr[i]]?.add(i)
        }

        var curs = LinkedList<Int>()
        curs.add(0)
        val visited = HashSet<Int>()
        var step = 0

        while (!curs.isEmpty()) {
            val nex = LinkedList<Int>()

            for (node in curs) {
                if (node == n - 1) return step

                for (child in graph.get(arr[node])!!) {
                    if (child !in visited) {
                        visited.add(child)
                        nex.add(child)
                    }
                }


                graph.get(arr[node])?.clear()

                // neighbor i+1
                if (node + 1 < n && !visited.contains(node + 1)) {
                    visited.add(node + 1)
                    nex.add(node + 1)
                }
                // neighbor i-1
                if (node - 1 >= 0 && !visited.contains(node - 1)) {
                    visited.add(node - 1)
                    nex.add(node - 1)
                }
            }

            curs = nex
            step++

        }

        return -1
    }
}