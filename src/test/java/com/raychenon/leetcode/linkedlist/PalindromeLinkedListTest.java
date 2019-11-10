package com.raychenon.leetcode.linkedlist;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 2019-11-10
 * https://leetcode.com/problems/palindrome-linked-list/
 */
public class PalindromeLinkedListTest {

    private static PalindromeLinkedList instance;

    @BeforeClass
    public static void setUp() {
        instance = new PalindromeLinkedList();
    }

    @Test
    public void palindromeLinkedListTest() {
        ListNode root = ListNode.createList(Arrays.asList(1, 2, 2, 1));
        assertEquals(true, instance.isPalindrome(root));
    }

    @Test
    public void palindromeSizeOddTest() {
        ListNode root = ListNode.createList(Arrays.asList(1, 2, 3, 2, 1));
        assertEquals(true, instance.isPalindrome(root));
    }

    @Test
    public void notPalindromeTest() {
        ListNode root = ListNode.createList(Arrays.asList(1, 2));
        assertEquals(false, instance.isPalindrome(root));
    }

}
