package com.raychenon.leetcode.linkedlist;

/**
 * User: raychenon
 * Date: 2019-11-10
 * https://leetcode.com/problems/palindrome-linked-list/
 */
public class PalindromeLinkedList {

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     * Idea : Reverse the 2nd half and compare the two halves
     * 1 -> 2 -> 3 -> 2 -> 1 -> null
     *           |         |
     *      slowPointer  fastPointer
     * <p>
     * fastPointer moves twice as fast as slowPointer, when fastPointer reaches the end, slowPointer is at the middle.
     *
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;
        }

        // odd nodes: let right half smaller
        if (fast != null) {
            slow = slow.next;
        }

        slow = reverse(slow);
        fast = head;

        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }

        return true;
    }

    private ListNode reverse(ListNode head) {
        // iterative
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode nextTmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextTmp;
        }
        return prev;
    }

}
