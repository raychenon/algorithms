package com.raychenon.kotlin.birthday

import java.time.LocalDate
import java.time.Month
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.collections.HashMap

/**
 * User: raychenon
 * Date: 18/2/2020
 */
object BirthdayPartyCalendar {

    val dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd")

    fun findNextBirthdayDates(paragraph: String, now: LocalDate): String {
        val birthdays = parseBirthdateLines(paragraph)
        val endPeriod = getEndOfNextMonth(now)
        val selectedBirthdays = birthdays.filter { b -> b.isAfter(now) && b.isBefore(endPeriod) }

        return applyPartyCalendarRules(selectedBirthdays, now, endPeriod.month)
    }

    fun applyPartyCalendarRules(birthdaysList: List<Birthday>, now: LocalDate, endMonth: Month): String {

        // Birthday parties can only take place on weekends (weekend is Saturday and Sunday).
        // If several birthday parties take place on the same weekend, they are combined. There can only be one party per weekend.
        val map = HashMap<LocalDate, TreeSet<String>>()
        for (birthday in birthdaysList) {
            val validDate = birthday.nextDateToCelebrate(now, month = endMonth)
            validDate.let {
                map.getOrDefault(validDate, TreeSet<String>()).add(birthday.name)
            }
        }

        val sortedMap = map.toSortedMap()
        val str = StringBuffer()
        for ((k, v) in sortedMap) {
            val list = v.sorted()
            str.append(k).append(list.joinToString { it }).append("\n")
        }

        return str.toString()
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
                    list + Birthday(
                        LocalDate.parse(
                            this[0],
                            dateFormat
                        ), this[1]
                    )
                }
            }
    }

}