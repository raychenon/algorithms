package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-07-02
 * https://leetcode.com/problems/add-two-numbers/
 */
class AddTwoNumbersTest {


    @Test
    fun evaluateReserveEmptyNode() {
    }


    private fun createListNode(ts: List<Int>): ListNode {
        var head = ListNode(ts.get(0))
        var node = head
        for (el in ts) {
            node.next = ListNode(el)
            node.next?.let { it -> node = it }
        }

        return head
    }

}