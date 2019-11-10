package com.raychenon.leetcode.linkedlist;

import org.junit.BeforeClass;
import org.junit.Test;

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

        ListNode root = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);
        root.next = node2;
        node2.next = node3;
        node3.next = node4;

        assertEquals(true, instance.isPalindrome(root));
    }

}
