package com.raychenon.kotlin.birthday

import org.junit.Assert
import org.junit.Test
import java.time.LocalDate
import java.time.format.DateTimeFormatter

/**
 * User: raychenon
 * Date: 25/2/2020
 */
class BirthdayPartyCalendarUtilsTest {

    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")

    @Test
    fun selectBirthdaysEndOfYearTest() {

        val date = LocalDate.of(2019, 12, 15)
        val (selected, endPeriod) = BirthdayPartyCalendar.selectBirthdays(
            """
                    1995-01-07 Raymond
                    1991-01-09 Alix
                    2005-06-12 Guy
                    1984-08-15 Ainhoa
                    1984-10-07 Auguste
                    1991-12-05 Gerald
                """.trimIndent(),
            date
        )

        Assert.assertEquals(LocalDate.of(2020, 1, 31), endPeriod)
    }


    @Test
    fun selectBirthdaysTest() {
        val date = LocalDate.of(2020, 2, 14)
        val (selected, endPeriod) = BirthdayPartyCalendar.selectBirthdays(
            """
                    1995-01-07 Raymond
                    1991-02-11 Heloise
                    1991-02-17 Alexis
                    2005-06-12 Guy
                    1984-08-15 Ainhoa
                    1984-10-07 Auguste
                    1991-12-05 Gerald
                """.trimIndent(),
            date
        )

        Assert.assertEquals(LocalDate.of(2020, 3, 31), endPeriod)
        Assert.assertEquals(
            listOf(
                Birthday(LocalDate.of(1991, 2, 17), "Alexis")
            ), selected
        )
    }


    @Test
    fun getEndOfNextMonthTest() {

        val localDate = LocalDate.parse("2020-02-18", formatter)
        val nextLocalDate = localDate.getEndOfNextMonth()

        Assert.assertEquals(nextLocalDate, LocalDate.of(2020, 3, 31))
        Assert.assertTrue(nextLocalDate.isAfter(localDate))
        Assert.assertTrue(localDate.isBefore(nextLocalDate))
    }

    @Test
    fun parseLinesTest() {
        val pairs = BirthdayPartyCalendar.parseBirthdateLines(
            """
                1995-03-29 Alice
                1988-04-01 Bob
                2005-04-06 Carol
            """.trimIndent()
        )

        Assert.assertEquals(pairs[0].birthdate, LocalDate.parse("1995-03-29", formatter))
        Assert.assertEquals(pairs[0].name, "Alice")
        Assert.assertEquals(pairs[1].name, "Bob")
        Assert.assertEquals(pairs[2].name, "Carol")
    }
}