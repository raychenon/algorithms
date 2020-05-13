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

    fun nextDateToCelebrate(endPeriod: LocalDate): LocalDate? {
        // the only case of Sunday is 1st of month
        val month = endPeriod.month
        // 2) Birthday parties can only take place on weekends (weekend is Saturday and Sunday).
        var birthdayThisYear = LocalDate.of(endPeriod.year, this.birthdate.month, this.birthdate.dayOfMonth)
        if (birthdayThisYear.isAfter(endPeriod)) { // case month is december, the returned cannot be after the end period
            birthdayThisYear = LocalDate.of(endPeriod.year - 1, this.birthdate.month, this.birthdate.dayOfMonth)
        }
        if (birthdayThisYear.month == month && (birthdayThisYear.dayOfWeek == DayOfWeek.SATURDAY ||
                    (birthdayThisYear.dayOfWeek == DayOfWeek.SUNDAY && birthdayThisYear.dayOfMonth == 1))
        ) {
            return birthdayThisYear
        }
        var partyDate = birthdayThisYear.with(TemporalAdjusters.next(DayOfWeek.SATURDAY))
        // 4)If possible, the party should happen on Saturday, otherwise Sunday
        if (partyDate.month != month) { // the only case of Sunday is 1st of month
            partyDate = partyDate?.with(TemporalAdjusters.next(DayOfWeek.SUNDAY))
        }
        return if (partyDate.month == month) partyDate else null
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