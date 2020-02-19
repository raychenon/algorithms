package com.raychenon.kotlin

import org.junit.Assert
import org.junit.Test
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.Period
import java.time.temporal.ChronoUnit




/**
 * User: raychenon
 * Date: 18/2/2020
 * Time: 10:34 PM
 */
class BirthdayPartyCalendarTest {

    val format = SimpleDateFormat("yyyy-MM-dd")

//    @Test
//    fun birthdaysInAprilTest() {
//
//        val date = Date()
//
//        Assert.assertEquals(
//            listOf(
//                "2018-04-01 Alice, Bob",
//                "2018-04-07 Carol"
//            ), BirthdayPartyCalendar.findNextBirthdays(
//                listOf(
//                    "1995-03-29 Alice",
//                    "1988-04-01 Bob",
//                    "2005-04-06 Carol",
//                    "1979-05-10 Dave"
//                ), date
//            )
//        )
//    }


    @Test
    fun getEndOfNextMonthTest() {

        val nextLocalDate = BirthdayPartyCalendar.getEndOfNextMonth(
            format.parse("2020-02-18")
        )
        
        Assert.assertEquals(nextLocalDate, LocalDate.of(2020, 3, 31))
    }

    @Test
    fun parseLinesTest() {

        val pairs = BirthdayPartyCalendar.parseBirthdateLines(
            "1995-03-29 Alice\n" +
                    "1988-04-01 Bob\n" +
                    "2005-04-06 Carol"
        )

        Assert.assertEquals(pairs[0].first, format.parse("1995-03-29"))
        Assert.assertEquals(pairs[0].second, "Alice")
        Assert.assertEquals(pairs[1].second, "Bob")
        Assert.assertEquals(pairs[2].second, "Carol")
    }
}