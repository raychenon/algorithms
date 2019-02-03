package com.raychenon.kotlin.hackerrank.heap

import java.util.*

/**
 * User: raychenon
 * Date: 3/2/19
 * https://www.hackerrank.com/challenges/jesse-and-cookies/problem
 */
object CookiesSweetnessKotlin {

    /**
     * time complexity : O(n)
     * space complexity : O(n)
     */
    fun cookies(sweetnessLevelTarget: Int, cookies: Array<Int>): Int {

        var nbOperations: Int = 0
        val queue = PriorityQueue<Int>()

        for (cookie in cookies) {
            queue.add(cookie)
        }

        while (queue.size > 1 && queue.peek() < sweetnessLevelTarget) {

            val leastSweet = queue.poll()
            val secondLeastSweet = queue.poll()
            // sweetness = (1 * Least sweet cookie) + (2 * 2nd least sweet cookie).
            val sweetness = leastSweet + 2 * secondLeastSweet

            queue.add(sweetness)
            nbOperations++
        }


        if (queue.peek() != null && queue.peek()!! >= sweetnessLevelTarget) {
            return nbOperations
        } else {
            return -1
        }
    }
}