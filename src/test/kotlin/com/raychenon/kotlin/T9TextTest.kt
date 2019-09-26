package com.raychenon.kotlin

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-09-19
 * https://github.com/raychenon/algorithms/issues/97
 */
class T9TextTest {

    @Test
    fun typeFewWordsTest() {
        val dictionnary = T9Text.preProcess(listOf("raid", "raie", "aba", "ray"))
        val filtered = T9Text.filterWords(7243, dictionnary)

        print("Map = $dictionnary")
        Assert.assertEquals(filtered, setOf("raie", "raid"))
    }


    @Test
    fun typeAllLettersTest() {
        val dict = T9Text.preProcess(listOf("the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"))
        print("Map = $dict")
        Assert.assertEquals(T9Text.filterWords(27696, dict), setOf("brown"))
        Assert.assertEquals(T9Text.filterWords(12, dict), emptySet<String>())
    }

}