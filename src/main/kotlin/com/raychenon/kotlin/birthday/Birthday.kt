package com.raychenon.kotlin.birthday

import java.time.LocalDate
import java.time.chrono.ChronoLocalDate

/**
 * User: raychenon
 * Date: 20/2/2020
 */
data class Birthday(
    val birthdate: LocalDate,
    val name: String
) {

    /**
     * isAfter in the calendar year
     */
    fun isAfter(other: Birthday): Boolean {
        return   compareTo0(other.birthdate ) > 0
    }

    /**
     * is before in the calendar year
     */
    fun isBefore(other: Birthday): Boolean {
        return   compareTo0(other.birthdate ) < 0
    }

    private fun compareTo0(otherDate: LocalDate): Int {
        var cmp: Int = this.birthdate.month.ordinal - otherDate.month.ordinal
        if (cmp == 0) {
            cmp = this.birthdate.dayOfMonth - otherDate.dayOfMonth
        }
        return cmp
    }

}