package com.raychenon.leetcode;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;


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
        List<List<String>> expectedResult = Arrays.asList(Arrays.asList("ate", "eat", "tea"), Arrays.asList("bat"), Arrays.asList("nat", "tan"));
        List<List<String>> result = groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        Assert.assertTrue(CollectionUtils.isEqualCollection(expectedResult, result));
    }

    @Test
    public void groupShortAnagramsTest() {
        List<List<String>> result = groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "ate", "bat"});
        List<List<String>> expectedResult = Arrays.asList(Arrays.asList("eat", "tea", "ate"), Arrays.asList("bat"));
        Assert.assertTrue(CollectionUtils.isEqualCollection(expectedResult, result));
        assertThat(expectedResult, containsInAnyOrder(result));
    }
}
