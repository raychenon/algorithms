package com.raychenon.hackerrank;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MergeStringsTest {

    @Test
    public void assertMergeStrings() {
        assertEquals(MergeStrings.mergeStrings("abc", "def"), "adbecf");
        assertEquals(MergeStrings.mergeStrings("ab", "zsd"), "azbsd");
    }

}
