package com.raychenon.kotlin.ctci

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 23/1/19
 * https://www.hackerrank.com/challenges/ctci-ransom-note/problem
 */
class RansomNoteTest {

    @Test
    fun evaluateRansom1() {
        assertValidity(
            arrayOf("give", "me", "one", "grand", "today", "night"),
            arrayOf("give", "one", "grand", "today"), true
        )
    }

    @Test
    fun evaluateRansom1_1() {
        assertValidity(arrayOf("some"), arrayOf("some"), true)
    }

    @Test
    fun evaluateRansom2() {
        assertValidity(
            arrayOf("two", "times", "three", "is", "not", "four"),
            arrayOf("two", "times", "two", "is", "four"), false
        )
    }

    @Test
    fun evaluateRansom3() {
        assertValidity(
            arrayOf("ive", "got", "a", "lovely", "bunch", "of", "coconuts"),
            arrayOf("ive", "got", "some", "coconuts"), false
        )
    }

    @Test
    fun evaluateRansom_NoteIsEmpty() {
        assertValidity(arrayOf("any"), arrayOf<String>(), true)
    }

    @Test
    fun evaluateRansomBiggerThanMagazine() {
        assertValidity(arrayOf<String>(), arrayOf("a", "b", "c"), false)
    }

    private fun assertValidity(magazine: Array<String>, note: Array<String>, expectedResult: Boolean) {
        Assert.assertEquals(expectedResult, checkMagazine(magazine, note))
        Assert.assertEquals(expectedResult, checkMagazineFP(magazine, note))
    }
}