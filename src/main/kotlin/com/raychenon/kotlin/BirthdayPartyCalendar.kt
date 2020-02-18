package com.raychenon.kotlin

import java.text.SimpleDateFormat
import java.util.*

/**
 * User: raychenon
 * Date: 18/2/2020
 */
object BirthdayPartyCalendar {

    val dateFormat = SimpleDateFormat("yyyy-MM-dd")

    fun findNextBirthdays(input: List<String>, date: Date): List<String> {
        return listOf()
    }

    fun parseBirthdateLines(paragraph: String): List<Pair<Date, String>> {
        val lines = paragraph.split("\n")
        var results = mutableListOf<Pair<Date, String>>()
        for (line in lines) {
            val content = line.split(" ")
            val date: Date = dateFormat.parse(content[0])
            val firstName = content[1]
            results.add(Pair(date,firstName))
        }
        return results
    }
}