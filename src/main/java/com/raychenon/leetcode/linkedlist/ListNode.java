package com.raychenon.leetcode.linkedlist;

import java.util.List;

/**
 * User: raychenon
 * Date: 2019-11-10
 * https://leetcode.com/problems/palindrome-linked-list/
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    static ListNode createList(List<Integer> items) {

        ListNode head = new ListNode(items.get(0));
        ListNode cur = head;
        for (int i = 1; i < items.size(); ++i) {
            ListNode nextNode = new ListNode(items.get(i));
            cur.next = nextNode;
            cur = cur.next;
        }
        return head;
    }
}