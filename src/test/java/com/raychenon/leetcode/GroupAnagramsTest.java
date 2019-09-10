package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.assertThat;

/**
 * User: raychenon
 * Date: 2019-09-10
 * https://leetcode.com/problems/group-anagrams/
 */
public class GroupAnagramsTest {

    private static GroupAnagrams groupAnagrams;

    @BeforeClass
    public static void setUp() {
        groupAnagrams = new GroupAnagrams();
    }

    @Test
    public void groupAnagramsTest() {
        List<List<String>> expectedResult = Arrays.asList(
                Arrays.asList("ate", "eat", "tea"),
                Arrays.asList("nat", "tan"),
                Arrays.asList("bat"));
        List<List<String>> result = groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});

//        assertThat(expectedResult, is(result));
        assertThat(expectedResult, containsInAnyOrder(result));
    }
}
