package com.raychenon.leetcode;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;


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
        List<List<String>> expectedResult = Arrays.asList(Arrays.asList("bat"), Arrays.asList("nat", "tan"), Arrays.asList("ate", "eat", "tea"));
        List<List<String>> result = groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});

        assertEquals(expectedResult.size(), result.size());
        // to test the equality without order, assert that all elements are contained in a list and vice versa
        for (int i = 0; i < result.size(); i++) {
            Assert.assertTrue(expectedResult.get(i).containsAll(result.get(i)));
            Assert.assertTrue(result.get(i).containsAll(expectedResult.get(i)));
        }
    }

    @Test
    public void groupShortAnagramsTest() {
        List<List<String>> result = groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "ate", "bat"});
        List<List<String>> expectedResult = Arrays.asList(Arrays.asList("eat", "tea", "ate"), Arrays.asList("bat"));

        Assert.assertTrue(expectedResult.containsAll(result));
    }
}
