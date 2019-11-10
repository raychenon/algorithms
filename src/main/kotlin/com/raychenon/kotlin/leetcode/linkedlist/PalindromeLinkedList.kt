package com.raychenon.kotlin.leetcode.linkedlist

import com.raychenon.leetcode.linkedlist.ListNode

/**
 * User: raychenon
 * Date: 2019-11-10
 * https://leetcode.com/problems/palindrome-linked-list
 */
object PalindromeLinkedList {

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     * Idea : Reverse the 2nd half and compare the two halves
     *
     * 1 -> 2 -> 3 -> 2 -> 1 -> null
     *           |         |
     *      slowPointer  fastPointer
     * <p>
     * fastPointer moves twice as fast as slowPointer, when fastPointer reaches the end, slowPointer is at the middle.
     *
     * @param head
     * @return
     */
    fun isPalindrome(head: ListNode?): Boolean {

        var fast = head
        var slow = head
        while (fast != null && fast?.next != null) {
            fast = fast?.next?.next
            slow = slow?.next
        }

        // odd nodes: let right half smaller
        if (fast != null) {
            slow = slow?.next
        }

        /**
         * ..... 1 -> 2 -> 3 -> 2 -> 1 -> null
         * ..... |         |
         * ..... |     slowPointer
         *  fastPointer
         */
        slow = reverse(slow)
        fast = head

        while (slow != null) {
            if (fast?.`val` != slow?.`val`) return false
            fast = fast?.next
            slow = slow?.next
        }

        return true
    }

    private fun reverse(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var cur = head
        while (cur != null) {
            var nextTemp = cur?.next
            cur?.next = prev
            prev = cur
            cur = nextTemp
        }
        return prev
    }
}