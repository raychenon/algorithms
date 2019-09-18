package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 2019-09-12
 * https://leetcode.com/problems/integer-to-roman/
 */
public class IntegerToRomanTest {

    private static IntegerToRoman integerToRoman;

    @BeforeClass
    public static void setUp() {
        integerToRoman = new IntegerToRoman();
    }

    @Test
    public void test9() {
        assertEquals("IX", integerToRoman.intToRoman(9));
    }

    @Test
    public void test40() {
        assertEquals("XL", integerToRoman.intToRoman(40));
    }

    @Test
    public void test58() {
        assertEquals("LVIII", integerToRoman.intToRoman(58));
    }

    @Test
    public void test1994() {
        assertEquals("MCMXCIV", integerToRoman.intToRoman(1994));
    }

    @Test
    public void test3999() {
        assertEquals("MMMCMXCIX", integerToRoman.intToRoman(3999));
    }

}
