package com.raychenon.leetcode;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


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

        // to test the equality without order, assert that all elements are contained in a list and vice versa
        Assert.assertTrue(expectedResult.get(0).containsAll(result.get(0)));
        Assert.assertTrue(result.get(0).containsAll(expectedResult.get(0)));

        Assert.assertTrue(result.get(1).containsAll(expectedResult.get(1)));
    }

    @Test
    public void groupShortAnagramsTest() {
        List<List<String>> result = groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "ate", "bat"});
        List<List<String>> expectedResult = Arrays.asList(Arrays.asList("eat", "tea", "ate"), Arrays.asList("bat"));

        Assert.assertTrue(expectedResult.containsAll(result));
    }
}
