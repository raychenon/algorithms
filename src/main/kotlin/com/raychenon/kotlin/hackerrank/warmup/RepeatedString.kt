package com.raychenon.kotlin.hackerrank.warmup

/**
 * User: raychenon
 * Date: 14/4/19
 * https://www.hackerrank.com/challenges/repeated-string/problem
 */
object RepeatedString {

    /**
     * repeat the String s to the length of n
     * return the number of 'a' in the string
     *
     * @param s contains only lower case characters
     * @param n
     * @return number of 'a' in the repeated string
     */
    fun repeatedString(s: String, n: Long): Long {
        if (!s.contains('a')) {
            return 0
        }

        val nbAin1S = s.filter { i -> i == 'a' }.count()
        val nbS = n / s.length
        val remainderS = n % s.length

        val remainingAinLastSegment = s.substring(0, remainderS.toInt()).filter { i -> i == 'a' }.count()

        return nbS * nbAin1S + remainingAinLastSegment
    }
}