package com.raychenon.kotlin.leetcode


/**
 * User: raychenon
 * Date: 2019-10-13
 * https://leetcode.com/problems/shortest-way-to-form-string/
 */
object ShortestWaytoFormString {

    /**
     * time complexity: O(S*T) , where S: length of source and T: length of target
     */
    fun shortestWay(source: String, target: String): Int {

        val sc = source.toCharArray()
        val ts = target.toCharArray()
        var res = 0
        var i = 0
        while (i < ts.size) {
            val indexI = i
            for (j in sc.indices) {
                if (i < ts.size && sc[j] == ts[i])
                    i++
            }
            // if target contains at least a letter that "source" doesn't have, then return -1
            if (i == indexI) return -1
            res++
        }
        return res

    }
}