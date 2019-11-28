package com.raychenon.kotlin.leetcode

import junit.framework.TestCase.assertEquals
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-11-06
 * https://leetcode.com/problems/custom-sort-string/
 */
class CustomSortStringTest {

    @Test
    fun sort_cbad_Test() {
        assertEquals("cbad", CustomSortString.customSortString("cba", "abcd"))
    }

    @Test
    fun sort_cbaaxxzzyy_Test() {
        assertEquals("cbaaxxzzyy", CustomSortString.customSortString("cba", "bxzyacaxyz"))
    }

}                                                                        