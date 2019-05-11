package com.raychenon.kotlin.hackerrank.warmup

/**
 * User: raychenon
 * Date: 2019-05-10
 * https://www.hackerrank.com/challenges/bon-appetit/problem
 */
object BonAppetit {

    fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {
        var result = calculateBillCharged(bill, k, b)
        print("$result")
    }

    fun calculateBillCharged(bill: Array<Int>, indexNotBilled: Int, amountCharged: Int): String {
        var amount = 0
        for ((index, foodCost) in bill.withIndex()) {
            if (index != indexNotBilled) {
                amount = amount + foodCost
            }
        }

        amount = amount / 2
        if (amount == amountCharged) {
            return "Bon Appetit"
        } else {
            val overcharged = amountCharged - amount
            return "$overcharged"
        }
    }
}