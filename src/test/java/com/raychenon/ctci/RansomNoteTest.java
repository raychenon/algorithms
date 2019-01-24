package com.raychenon.ctci;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 24/1/19
 * https://www.hackerrank.com/challenges/ctci-ransom-note/problem
 */
public class RansomNoteTest {

    @Test
    public void evaluteRansomValid1() {
        assertEquals(RansomNote.checkMagazine(new String[] {"give", "me", "one","grand","today","night"},
                new String[]{"give", "one","grand","today"} ),true);
    }

    @Test
    public void evaluteRansomValidNoteisEqualToMagazine() {
        assertEquals(RansomNote.checkMagazine(new String[]{"some"},
                new String[]{"some"}), true);
    }

    @Test
    public void evaluteRansom2(){
        assertEquals(RansomNote.checkMagazine(new String[]{"two" ,"times", "three", "is", "not", "four"},
                new String[]{"two" ,"times", "two", "is", "four"}), false);
    }

    @Test
    public void evaluteRansom3(){
        assertEquals(RansomNote.checkMagazine(new String[]{"ive" ,"got", "a", "lovely", "bunch", "of","coconuts"},
                new String[]{"ive" ,"got", "some", "coconuts"}), false);
    }

    @Test
    public void evaluteRansomEmpty(){
        assertEquals(RansomNote.checkMagazine(new String[]{"any"},
                new String[]{}), false);
    }

    @Test
    public void evaluteRansomBiggerThanMagazine(){
        assertEquals(RansomNote.checkMagazine(new String[]{},
                new String[]{"a","b","c"}), false);
    }

}
