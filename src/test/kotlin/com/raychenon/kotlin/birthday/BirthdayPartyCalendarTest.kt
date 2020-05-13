package com.raychenon.kotlin.birthday

import org.junit.Assert
import org.junit.Test
import java.time.LocalDate


/**
 * User: raychenon
 * Date: 18/2/2020
 * Time: 10:34 PM
 */
class BirthdayPartyCalendarTest {


    @Test
    fun birthdaysInAprilTest() {

        val date = LocalDate.of(2018, 3, 14)

        Assert.assertEquals(
            """
                2018-04-01 Alice, Bob
                2018-04-07 Carol
            """.trimIndent()
            , BirthdayPartyCalendar.findNextBirthdayDates(
                """
                    1995-03-29 Alice
                    1988-04-01 Bob
                    2005-04-06 Carol
                    1979-05-10 Dave
                """.trimIndent(),
                date
            )
        )
    }


    @Test
    fun birthdaysCalendarFirstSundayOfMonthTest() {

        val date = LocalDate.of(2020, 2, 23)

        // 1st March 2020 is Sunday
        Assert.assertEquals(
            """
                2020-03-01 Alice
                2020-03-07 Bob
            """.trimIndent()
            , BirthdayPartyCalendar.findNextBirthdayDates(
                """
                    1995-02-29 Alice
                    1988-03-02 Bob
                    2005-04-06 Carol
                    1979-05-10 Dave
                """.trimIndent(),
                date
            )
        )
    }


    @Test
    fun birthdayPartyNeverHappenBeforeBirthdayTest() {

        val date = LocalDate.of(2020, 2, 23)

        // 1) Birthday party has to happen during the week of the birthday but never before the
        // birthday (for the purpose of this task consider that the week starts on Monday).
        Assert.assertEquals(
            """
                2020-03-01 Albin, Auguste
                2020-03-14 Justine
                2020-03-21 Herbert
            """.trimIndent()
            , BirthdayPartyCalendar.findNextBirthdayDates(
                """
                    1995-02-29 Auguste
                    1988-03-20 Herbert
                    2005-03-12 Justine
                    1979-03-01 Albin
                """.trimIndent(),
                date
            )
        )
    }


    @Test
    fun birthdayPartyExtremeMonthTest() {

        val date = LocalDate.of(2020, 2, 25)

        // 1) Birthday party has to happen during the week of the birthday but never before the
        // birthday (for the purpose of this task consider that the week starts on Monday).
        Assert.assertEquals(
            """
                2020-03-01 Romain
            """.trimIndent()
            , BirthdayPartyCalendar.findNextBirthdayDates(
                """
                    1995-01-07 Raymond
                    1988-02-28 Romain
                    1976-04-03 Richard
                    1956-05-25 Sophie
                    2005-06-12 Guy
                """.trimIndent(),
                date
            )
        )
    }


    @Test
    fun noBirthdayPartyMatchingTest() {

        val date = LocalDate.of(2020, 2, 25)

        Assert.assertEquals(
            ""
            , BirthdayPartyCalendar.findNextBirthdayDates(
                """
                    1995-01-07 Raymond
                    2005-06-12 Guy
                    1984-08-15 Ainhoa
                    1984-10-07 Auguste
                    1991-12-05 Gerald
                """.trimIndent(),
                date
            )
        )
    }

    @Test
    fun endOfYearTest() {

        val date = LocalDate.of(2019, 12, 15)

        Assert.assertEquals(
            "2020-01-11 Alix, Raymond"
            , BirthdayPartyCalendar.findNextBirthdayDates(
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
        )
    }


    @Test
    fun endOfYearComplexTest() {

        val date = LocalDate.of(2020, 12, 1)

        Assert.assertEquals(
            """
                2021-01-02 Jean, Roger
                2021-01-09 Alix, Raymond
                2021-01-30 Charlemagne
             """.trimIndent()
            , BirthdayPartyCalendar.findNextBirthdayDates(
                """
                    1995-12-01 Eva
                    1995-12-12 Corentin
                    1992-12-27 Jean
                    1993-12-30 Roger
                    1995-01-07 Raymond
                    1991-01-09 Alix
                    1748-01-28 Charlemagne
                    2005-06-12 Guy
                    1984-08-15 Ainhoa
                    1984-10-07 Auguste
                    1991-12-05 Gerald
                """.trimIndent(),
                date
            )
        )
    }

    @Test
    fun noBirthdayEntriesNoPartyTest() {

        val date = LocalDate.of(2020, 2, 25)

        Assert.assertEquals(
            ""
            , BirthdayPartyCalendar.findNextBirthdayDates(
                """
                """.trimIndent(),
                date
            )
        )
    }

    @Test
    fun printOuputTest() {

        val date = LocalDate.now()
        val input =
            """
                1995-01-07 Raymond
                2007-03-06 Gaston
                2005-06-12 Guy
                1984-08-15 Ainhoa
                1984-10-07 Auguste
                1991-12-05 Gerald
            """.trimIndent()

        val results = BirthdayPartyCalendar.findNextBirthdayDates(input, date)

        print("results  = \n${results}\n")

        // always true
        Assert.assertEquals(
            "", ""
        )
    }
}