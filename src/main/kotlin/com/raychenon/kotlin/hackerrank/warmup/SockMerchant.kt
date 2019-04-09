package com.raychenon.kotlin.hackerrank.warmup

/**
 * User: raychenon
 * Date: 8/4/19
 * https://www.hackerrank.com/challenges/sock-merchant/problem
 */
object SockMerchant {

    fun sockMerchant(ar: Array<Int>): Int {
        val list = ar.toList()
        // count by frequency  ( key,frequency)
        val frequencies: Map<Int, Int> = list.groupingBy { it }.eachCount()

        // sum only the complete pairs in values
        val countPairSock = frequencies.values.sumBy { it -> it / 2 }

        return countPairSock

    }
}