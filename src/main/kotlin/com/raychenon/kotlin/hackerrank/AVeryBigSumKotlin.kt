package com.raychenon.kotlin.hackerrank

/**
 * User: raychenon
 * Date: 14/1/19
 * https://www.hackerrank.com/challenges/a-very-big-sum/problem
 */
object AVeryBigSumKotlin {

    /**
     * time complexity : O(n)
     * space complexity :  O(1)
     */
    fun aVeryBigSum(ar: Array<Long>): Long {
        var sum:Long = 0

        for(el in ar){
            sum += el
        }
        return sum
    }
    
}