package com.raychenon.kotlin.leetcode

import java.util.*

/**
 * User: raychenon
 * Date: 7/6/2020
 * https://leetcode.com/problems/queue-reconstruction-by-height/
 *
 * Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k), where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h. Write an algorithm to reconstruct the queue.
 */
object QueueReconstructionbyHeight {

    /**
     * Best explanation: https://www.youtube.com/watch?v=khddrw6Bfyw
     * Time complexity : O(N^2) ~ O(N*log(N) + N^2)
     * Space complexity: O(N)
     *
     * @param people
     * @return
     */
    fun reconstructQueue(people: Array<IntArray>): Array<IntArray>? {

        // sort by height (index 0), then by K (index 1)
        Arrays.sort(
            people
        ) { o1, o2 -> if (o1[0] != o2[0]) -o1[0] + o2[0] else o1[1] - o2[1] }
        val result = mutableListOf<IntArray>()
        for (cur in people) {
            result.add(cur[1], cur)
        }
        return result.toTypedArray()
    }
}