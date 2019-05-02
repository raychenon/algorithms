package com.raychenon.kotlin.hackerrank.warmup

/**
 * User: raychenon
 * Date: 28/4/19
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
 */
object JumpingOnTheClouds {


    /**
     * Jump 1 or 2 steps on the cloud ( marked by 0).
     * The thunder clouds (marked by 1) have to be avoided.
     */
    fun jumpingOnClouds(c: Array<Int>): Int {

        var nbJump: Int = 0
        var i: Int = 0

        while (i < c.size - 1) {
            if (c.get(i) == 0) {
                i++
            }
            nbJump++
            i++
        }
        
        return nbJump
    }

}