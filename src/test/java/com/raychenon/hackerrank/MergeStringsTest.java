package com.raychenon.hackerrank;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MergeStringsTest {

    @Test
    public void assertMergeStrings() {
        assertEquals(MergeStrings.mergeStrings("abc", "def"), "adbecf");
        assertEquals(MergeStrings.mergeStrings("ab", "zsd"), "azbsd");
    }

    @Test
    public void assertMergeStrings_1char() {

        assertEquals(MergeStrings.mergeStrings("a", "b"), "ab");
        assertEquals(MergeStrings.mergeStrings("a", "bc"), "abc");
        assertEquals(MergeStrings.mergeStrings("ac", "b"), "abc");
    }
}
