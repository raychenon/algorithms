package com.raychenon.kotlin.hackerrank.warmup

/**
 * User: raychenon
 * Date: 2019-05-10
 * https://www.hackerrank.com/challenges/bon-appetit/problem
 */
object BonAppetit {

    fun calculateBillCharged(bill: Array<Int>, indexNotBilled: Int, amountCollected: Int): String {
        var amount = 0
        for ((index, foodCost) in bill.withIndex()) {
            if (index != indexNotBilled) {
                amount = amount + foodCost
            }
        }

        amount = amount / 2
        if (amount == amountCollected) {
            return "Bon Appetit"
        } else {
            val overcharged = amountCollected - amount
            return "$overcharged"
        }
    }
}