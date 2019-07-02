package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-07-02
 * https://leetcode.com/problems/add-two-numbers/
 */
object AddTwoNumbers {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val head = ListNode(0)
        var carry: Int = 0
        var curr = head

        while (l1?.next != null && l2?.next != null) {
            val x = l1?.`val` ?: 0
            val y = l2?.`val` ?: 0
            val sum = carry + x + y
            carry = sum / 100
            curr.next = ListNode(sum % 10)
            curr = curr.next!!
        }

        return head.next
    }
}