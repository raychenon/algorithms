package com.raychenon.kotlin.birthday

import java.time.LocalDate
import java.time.format.DateTimeFormatter

/**
 * User: raychenon
 * Date: 18/2/2020
 */
object BirthdayPartyCalendar {

    val dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd")

    fun findNextBirthdays(paragraph: String, date: LocalDate): List<String> {
        val birthdays =
            parseBirthdateLines(paragraph)
//        val filteredNextMonth = birthdays.filter { p -> p.first.after() }
        return listOf()
    }

    fun getEndOfNextMonth(localDate: LocalDate): LocalDate {
        val nextLocalDate = localDate.plusMonths(1)
        val result = nextLocalDate.withDayOfMonth(
            nextLocalDate.getMonth().length(nextLocalDate.isLeapYear())
        )
        return result
    }

    fun parseBirthdateLines(paragraph: String): List<Birthday> {
        return paragraph.split("\n")
            .fold(listOf<Birthday>()) { list, line ->
                with(line.split(" ")) {
                    list + Birthday(LocalDate.parse(this[0],
                        dateFormat
                    ), this[1])
                }
            }
    }

}