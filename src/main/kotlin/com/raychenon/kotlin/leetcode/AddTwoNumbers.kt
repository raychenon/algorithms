package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-07-02
 * https://leetcode.com/problems/add-two-numbers/
 */
object AddTwoNumbers {

    fun addTwoNumbers(ln1: ListNode?, ln2: ListNode?): ListNode? {
        val head = ListNode(0)
        var l1 = ln1
        var l2 = ln2
        var curr: ListNode? = head
        var carry: Int = 0

        while (l1 != null || l2 != null) {
            val x = if (l1 != null) l1!!.`val` else 0
            val y = if (l2 != null) l2!!.`val` else 0
            val sum = carry + x + y
            carry = sum / 10
            curr!!.next = ListNode(sum % 10)
            curr = curr!!.next

            if (l1 != null) l1 = l1!!.next
            if (l2 != null) l2 = l2!!.next

            print("carry = $carry \n")
        }
        if (carry > 0) {
            curr!!.next = ListNode(carry)
        }

        return head.next
    }
}
