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
    fun evaluteRansom1(){
        Assert.assertEquals(checkMagazine(arrayOf("give", "me", "one","grand","today","night"),
            arrayOf("give", "one","grand","today")),true)
    }

    @Test
    fun evaluteRansom1_1(){
        Assert.assertEquals(checkMagazine(arrayOf("some"),
            arrayOf("some")),true)
    }

    @Test
    fun evaluteRansom2(){
        Assert.assertEquals(checkMagazine(arrayOf("two" ,"times", "three", "is", "not", "four"),
            arrayOf("two" ,"times", "two", "is", "four")),false)
    }

    @Test
    fun evaluteRansom3(){
        Assert.assertEquals(checkMagazine(arrayOf("ive" ,"got", "a", "lovely", "bunch", "of","coconuts"),
            arrayOf("ive" ,"got", "some", "coconuts")),false)
    }
    
    @Test
    fun evaluteRansomEmpty(){
        Assert.assertEquals(checkMagazine(arrayOf("any"),
            arrayOf<String>()),false)
    }

    @Test
    fun evaluteRansomBiggerThanMagazine(){
        Assert.assertEquals(checkMagazine(arrayOf<String>(),
            arrayOf("a","b","c")),false)
    }
}