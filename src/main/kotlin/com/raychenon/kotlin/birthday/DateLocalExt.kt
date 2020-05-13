package com.raychenon.kotlin.birthday

import java.time.LocalDate

/**
 * User: raychenon
 * Date: 25/2/2020
 */

fun LocalDate.getEndOfNextMonth(): LocalDate {
    val nextLocalDate = this.plusMonths(1)
    val result = nextLocalDate.withDayOfMonth(
        nextLocalDate.getMonth().length(nextLocalDate.isLeapYear())
    )
    return result
}