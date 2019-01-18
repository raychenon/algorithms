package com.raychenon.hackerrank;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 18/1/19
 * Under "Dictionaries and Hashmaps"
 * https://www.hackerrank.com/challenges/sherlock-and-anagrams
 */
public class SherlockAndAnagramsTest {

    @Test
    public void assert_abba() {
        assertEquals(SherlockAndAnagrams.sherlockAndAnagrams("abba"), 4);
    }

    @Test
    public void assert_abcd() {
        assertEquals(SherlockAndAnagrams.sherlockAndAnagrams("abcd"), 0);
    }
    
    @Test
    public void assert_ifailuhkqq() {
        assertEquals(SherlockAndAnagrams.sherlockAndAnagrams("ifailuhkqq"), 3);
    }

    @Test
    public void assert_kkkk() {
        assertEquals(SherlockAndAnagrams.sherlockAndAnagrams("kkkk"), 10);
    }
    
}

