package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-09-12
 * https://leetcode.com/problems/integer-to-roman/
 */
object IntegerToRoman {
    
    val romanList = listOf<Pair<Int, String>>(
        Pair(1000, "M"),
        Pair(900, "CM"),
        Pair(500, "D"),
        Pair(400, "CD"),
        Pair(100, "C"),
        Pair(90, "XC"),
        Pair(50, "L"),
        Pair(40, "XL"),
        Pair(10, "X"),
        Pair(9, "IX"),
        Pair(5, "V"),
        Pair(4, "IV"),
        Pair(1, "I")
    )
    
    fun intToRoman(num: Int): String {
        var number: Int = num // Kotlin method parameters are passed as val(immutable)
        var index = 0
        var str = StringBuffer()
        while (number != 0) {

            if (number >= romanList[index].first) {
                val romanValue = romanList[index]
                number = number - romanValue.first
                str.append(romanValue.second)
            } else {
                index = index + 1
            }
        }
        return str.toString()
    }
}