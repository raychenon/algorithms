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
        Assert.assertEquals(true, b1.isBefore(b2))
        Assert.assertEquals(false, b1.birthdate.isBefore(b2.birthdate))
    }

    @Test
    fun isAfterTest() {
        Assert.assertEquals(true, b2.isAfter(b1))
        Assert.assertEquals(false, b2.birthdate.isAfter(b1.birthdate))
    }

}