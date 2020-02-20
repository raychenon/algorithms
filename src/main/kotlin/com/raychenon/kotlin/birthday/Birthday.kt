package com.raychenon.kotlin.birthday

import java.time.DayOfWeek
import java.time.LocalDate
import java.time.Month
import java.time.temporal.TemporalAdjusters

/**
 * User: raychenon
 * Date: 20/2/2020
 */
data class Birthday(
    val birthdate: LocalDate,
    val name: String
) {

    fun nextDateToCelebrate(now: LocalDate, month: Month): LocalDate? {
        val ne = LocalDate.of(now.year, this.birthdate.month, this.birthdate.dayOfMonth)
        val newDate = ne.with(TemporalAdjusters.next(DayOfWeek.SATURDAY))
        return if (newDate.month == month) newDate else null
    }

    /**
     * isAfter in the calendar year
     */
    fun isAfter(other: LocalDate): Boolean {
        return compareTo0(other) > 0
    }

    /**
     * is before in the calendar year
     */
    fun isBefore(other: LocalDate): Boolean {
        return compareTo0(other) < 0
    }

    private fun compareTo0(otherDate: LocalDate): Int {
        var cmp: Int = this.birthdate.month.ordinal - otherDate.month.ordinal
        if (cmp == 0) {
            cmp = this.birthdate.dayOfMonth - otherDate.dayOfMonth
        }
        return cmp
    }

}