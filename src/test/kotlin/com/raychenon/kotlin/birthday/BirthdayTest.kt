package com.raychenon.kotlin.birthday

import org.junit.Assert
import org.junit.Test
import java.time.LocalDate

/**
 * User: raychenon
 * Date: 20/2/2020
 */
class BirthdayTest {

    val b1 = Birthday(LocalDate.of(2020, 6, 1), "Ray")
    val b2 = Birthday(LocalDate.of(2000, 6, 10), "Guga")

    @Test
    fun isBeforeTest() {
        Assert.assertEquals(true, b1.isBefore(b2.birthdate))
        Assert.assertEquals(false, b1.birthdate.isBefore(b2.birthdate))
    }

    @Test
    fun isAfterTest() {
        Assert.assertEquals(true, b2.isAfter(b1.birthdate))
        Assert.assertEquals(false, b2.birthdate.isAfter(b1.birthdate))
    }

    @Test
    fun isAfterEndYearTest() {
        val b1 = Birthday(LocalDate.of(2019, 12, 1), "Adele")
        val b2 = Birthday(LocalDate.of(2020, 1, 10), "Amelie")

        val projected = LocalDate.of(2019, 12, 3)
        Assert.assertEquals(false, b2.isAfter(projected))
        Assert.assertEquals(true, b2.birthdate.isAfter(b1.birthdate))
    }

    @Test
    fun birthdayInJanuaryTest() {
        val endPeriod = LocalDate.of(2019, 12, 15).getEndOfNextMonth()
        val b1 = Birthday(LocalDate.of(1985, 1, 9), "Alix")
        val nextBirthday = b1.nextDateToCelebrate(endPeriod)

        Assert.assertEquals(LocalDate.of(2020, 1, 11), nextBirthday)
    }
}