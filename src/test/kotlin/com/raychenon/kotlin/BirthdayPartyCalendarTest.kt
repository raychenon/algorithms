package com.raychenon.kotlin

import com.raychenon.kotlin.birthday.BirthdayPartyCalendar
import org.junit.Assert
import org.junit.Test
import java.time.LocalDate
import java.time.format.DateTimeFormatter


/**
 * User: raychenon
 * Date: 18/2/2020
 * Time: 10:34 PM
 */
class BirthdayPartyCalendarTest {

    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")

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

        val localDate = LocalDate.parse("2020-02-18", formatter)
        val nextLocalDate = BirthdayPartyCalendar.getEndOfNextMonth(localDate)

        Assert.assertEquals(nextLocalDate, LocalDate.of(2020, 3, 31))
        Assert.assertTrue(nextLocalDate.isAfter(localDate))
    }
                                                                                     
    @Test
    fun parseLinesTest() {

        val pairs = BirthdayPartyCalendar.parseBirthdateLines(
            "1995-03-29 Alice\n" +
                    "1988-04-01 Bob\n" +
                    "2005-04-06 Carol"
        )

        Assert.assertEquals(pairs[0].birthdate, LocalDate.parse("1995-03-29", formatter))
        Assert.assertEquals(pairs[0].name, "Alice")
        Assert.assertEquals(pairs[1].name, "Bob")
        Assert.assertEquals(pairs[2].name, "Carol")
    }
}