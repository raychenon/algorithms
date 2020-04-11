package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 10/4/2020
 * https://leetcode.com/problems/backspace-string-compare
 */
class BackspaceStringCompareTest {

    @Test
    fun example1Test() {
        TestCase.assertEquals(true, BackspaceStringCompare.backspaceCompare("ab#c", "ad#c"))
    }

    @Test
    fun example2Test() {
        TestCase.assertEquals(true, BackspaceStringCompare.backspaceCompare("ab##", "c#d#"))
    }

    @Test
    fun example3Test() {
        TestCase.assertEquals(true, BackspaceStringCompare.backspaceCompare("a##c", "#a#c"))
    }

    @Test
    fun example4Test() {
        TestCase.assertEquals(false, BackspaceStringCompare.backspaceCompare("a#c", "b"))
    }

    @Test
    fun example5Test() {
        TestCase.assertEquals(true, BackspaceStringCompare.backspaceCompare("a#c", "#c"))
    }
}