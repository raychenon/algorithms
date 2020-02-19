package com.raychenon.kotlin

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.ZoneId
import java.util.*
import kotlin.text.Typography.paragraph

/**
 * User: raychenon
 * Date: 18/2/2020
 */
object BirthdayPartyCalendar {

    val dateFormat = SimpleDateFormat("yyyy-MM-dd")

    fun findNextBirthdays(paragraph: String, date: Date): List<String> {
        val birthdays = parseBirthdateLines(paragraph)
//        val filteredNextMonth = birthdays.filter { p -> p.first.after() }
        return listOf()
    }

    fun getEndOfNextMonth(date: Date): LocalDate {
        var localDate = date.toInstant()
            .atZone(ZoneId.systemDefault())
            .toLocalDate()
        localDate = localDate.plusMonths(1)
        val result = localDate.withDayOfMonth(
            localDate.getMonth().length(localDate.isLeapYear())
        )
        return result
    }

    fun parseBirthdateLines(paragraph: String): List<Pair<Date, String>> {
        return paragraph.split("\n")
            .fold(listOf<Pair<Date, String>>()) { list, line ->
            with(line.split(" ")) {
                list + Pair(dateFormat.parse(this[0]), this[1])
            }
        }
    }
        
}