package com.raychenon.kotlin

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.ZoneId
import java.util.*

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
        val result =  localDate.withDayOfMonth(
            localDate.getMonth().length(localDate.isLeapYear())
        )
        return result
    }

    fun parseBirthdateLines(paragraph: String): List<Pair<Date, String>> {
        val lines = paragraph.split("\n")

        return lines.map { l -> Pair(dateFormat.parse(l.split(" ")[0]), l.split(" ")[1]) }

//        var results = mutableListOf<Pair<Date, String>>()
//        for (line in lines) {
//            val content = line.split(" ")
//            val date: Date = dateFormat.parse(content[0])
//            val firstName = content[1]
//            results.add(Pair(date,firstName))
//        }
//        return results
    }
}