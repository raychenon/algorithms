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
        // the only case of Sunday is 1st of month OR the birthday is on a Sunday in the last week
        val ne = LocalDate.of(now.year, this.birthdate.month, this.birthdate.dayOfMonth)
        if(ne.month == month && (ne.dayOfWeek == DayOfWeek.SATURDAY ||
                    (ne.dayOfWeek == DayOfWeek.SUNDAY && ne.dayOfMonth == 1))){
            return ne
        }
        var newDate = ne.with(TemporalAdjusters.next(DayOfWeek.SATURDAY))
        // 4)If possible, the party should happen on Saturday, otherwise Sunday
        if (newDate.month != month) {
            newDate = newDate?.with(TemporalAdjusters.next(DayOfWeek.SUNDAY))
        }
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