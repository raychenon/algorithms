package com.raychenon.hackerrank.warmup;

/**
 * User: raychenon
 * Date: 28/4/19
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
 */
public class JumpingOnTheClouds {

    /**
     * Jump 1 or 2 steps on the cloud ( marked by 0).
     * The thunder clouds (marked by 1) have to be avoided.
     */
    static int jumpingOnClouds(int[] c) {
        int i = 0;
        int nbJump = 0;
        while (i < c.length - 1) {
            if (c[i] == 0) {
                i++;
            }
            nbJump++;
            // always iterate by at least 1
            i++;
        }
        return nbJump;
    }
}
