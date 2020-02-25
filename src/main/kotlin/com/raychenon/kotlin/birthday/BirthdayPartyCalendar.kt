package com.raychenon.kotlin.birthday

import java.time.LocalDate
import java.time.Month
import java.time.format.DateTimeFormatter

/**
 * User: raychenon
 * Date: 18/2/2020
 */
object BirthdayPartyCalendar {

    val dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd")

    fun findNextBirthdayDates(paragraph: String, now: LocalDate): String {
        val (selectedBirthdays, endPeriod) = selectBirthdays(paragraph, now)
        return applyPartyCalendarRules(selectedBirthdays, endPeriod)
    }

    internal fun selectBirthdays(paragraph: String, now: LocalDate): Pair<List<Birthday>, LocalDate> {
        val birthdays = parseBirthdateLines(paragraph)
        val endPeriod = now.getEndOfNextMonth()
        val selectedBirthdays = birthdays.filter { b ->
            if (now.month == Month.DECEMBER) {
                b.isAfter(now) || b.isBefore(endPeriod)
            } else {
                b.isAfter(now) && b.isBefore(endPeriod)
            }
        }

        return Pair(selectedBirthdays, endPeriod)
    }

    internal fun applyPartyCalendarRules(birthdaysList: List<Birthday>, endPeriod: LocalDate): String {

        // 2) Birthday parties can only take place on weekends (weekend is Saturday and Sunday).
        // 3) If several birthday parties take place on the same weekend, they are combined. There can only be one party per weekend.
        val map = HashMap<LocalDate, MutableSet<String>>()
        for (birthday in birthdaysList) {
            val validDate = birthday.nextDateToCelebrate(endPeriod)
            validDate?.let { it ->
                val set = map.getOrDefault(it, hashSetOf())
                set.add(birthday.name)
                map.put(it, set)
            }
        }

        val sortedMap = map.toSortedMap()
        val str = StringBuffer()
        for ((k, v) in sortedMap) {
            val list = v.sorted()
            str.append("$k ${list.joinToString(separator = ", ") { it }}\n")
        }
        if (str.length > 1) str.deleteCharAt(str.length - 1)

        return str.toString()
    }

    internal fun parseBirthdateLines(paragraph: String): List<Birthday> {
        try {
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
        } catch (e: Exception) {
            return emptyList()
        }
    }

}
