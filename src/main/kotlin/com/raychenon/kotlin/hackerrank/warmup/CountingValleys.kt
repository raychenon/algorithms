package com.raychenon.kotlin.hackerrank.warmup

/**
 * User: raychenon
 * Date: 17/4/19
 * https://www.hackerrank.com/challenges/counting-valleys/problem
 */
object CountingValleys {

    fun countingValleys(n: Int, s: String): Int {
        //  A valley is a sequence of consecutive steps below sea level,
        //  starting with a step down from sea level and ending with a step up to sea level.
        //      _/\      _
        //         \    /
        //          \/\/

        var nbValleys: Int = 0
        var level: Int = 0
        var wasBelowSeaLeval: Boolean = false
        for (c in s.toCharArray()) {
            level = level + valueOfStep(c)
            print("level $c , accumulated level = $level \n")
            if (level < 0) {
                wasBelowSeaLeval = true
            }
            if (wasBelowSeaLeval && level >= 0) {
                wasBelowSeaLeval = false
                nbValleys = nbValleys + 1
            }
        }

        return nbValleys
    }

    internal fun valueOfStep(c: Char): Int {
        when (c) {
            'D' -> return -1
            'U' -> return 1
            else -> return 0
        }
    }
}