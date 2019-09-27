package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test
import java.util.*

/**
 * User: raychenon
 * Date: 2019-09-27
 * https://leetcode.com/problems/group-anagrams/
 */
class GroupAnagramsTest {

    @Test
    fun groupAnagramsTest() {
        val expectedResult =
            Arrays.asList(Arrays.asList("ate", "eat", "tea"), Arrays.asList("bat"), Arrays.asList("nat", "tan"))
        val result = GroupAnagrams.groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))

        // to test the equality without order, assert that all elements are contained in a list and vice versa
        Assert.assertTrue(expectedResult[0].containsAll(result.get(0)))
        Assert.assertTrue(result.get(1).containsAll(expectedResult[1]))
    }

    @Test
    fun groupShortAnagramsTest() {
        val result = GroupAnagrams.groupAnagrams(arrayOf("eat", "tea", "ate", "bat"))
        val expectedResult = Arrays.asList(Arrays.asList("eat", "tea", "ate"), Arrays.asList("bat"))
        Assert.assertTrue(expectedResult.containsAll(result))
    }

}