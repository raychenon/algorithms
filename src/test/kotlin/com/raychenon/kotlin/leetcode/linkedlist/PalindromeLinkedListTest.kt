package com.raychenon.kotlin.leetcode.linkedlist

import com.raychenon.leetcode.linkedlist.ListNode
import junit.framework.Assert.assertEquals
import org.junit.Test
import java.util.*

/**
 * User: raychenon
 * Date: 2019-11-10
 * https://leetcode.com/problems/palindrome-linked-list
 */
class PalindromeLinkedListTest {

    @Test
    fun palindromeLinkedListTest() {
        val root = ListNode.createList(Arrays.asList(1, 2, 2, 1))
        assertEquals(true, PalindromeLinkedList.isPalindrome(root))
    }

    @Test
    fun palindromeSizeOddTest() {
        val root = ListNode.createList(Arrays.asList(1, 2, 3, 2, 1))
        assertEquals(true, PalindromeLinkedList.isPalindrome(root))
    }

    @Test
    fun notPalindromeTest() {
        val root = ListNode.createList(Arrays.asList(1, 2))
        assertEquals(false, PalindromeLinkedList.isPalindrome(root))
    }

}