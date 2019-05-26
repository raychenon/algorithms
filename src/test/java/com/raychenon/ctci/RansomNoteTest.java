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
    public void evaluateRansomValid1() {
        assertCheckMagazine(new String[]{"give", "me", "one", "grand", "today", "night"},
                new String[]{"give", "one", "grand", "today"}, true);
    }

    @Test
    public void evaluateRansomValidNoteisEqualToMagazine() {
        assertCheckMagazine(new String[]{"some"}, new String[]{"some"}, true);
    }

    @Test
    public void evaluateRansom2() {
        assertCheckMagazine(new String[]{"two", "times", "three", "is", "not", "four"},
                new String[]{"two", "times", "two", "is", "four"}, false);
    }

    @Test
    public void evaluateRansom3() {
        assertCheckMagazine(new String[]{"ive", "got", "a", "lovely", "bunch", "of", "coconuts"},
                new String[]{"ive", "got", "some", "coconuts"}, false);
    }

    @Test
    public void evaluateRansom_NoteIsEmpty() {
        assertCheckMagazine(new String[]{"any"}, new String[]{}, true);
    }

    @Test
    public void evaluateRansomBiggerThanMagazine() {
        assertCheckMagazine(new String[]{}, new String[]{"a", "b", "c"}, false);
    }

    private void assertCheckMagazine(String[] magazine, String[] note, boolean expectedResult) {

        assertEquals(expectedResult, RansomNote.checkMagazine(magazine, note));
        assertEquals(expectedResult, RansomNote.checkMagazineFP(magazine, note));
    }

}
