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
    fun evaluateListNodeAddition_99_plus_1() {
        val resultNode = AddTwoNumbers.addTwoNumbers(createListNode(listOf(9, 9)), createListNode(listOf(1)))
        compareListNodes(createListNode(listOf(1, 0, 0)), resultNode)
    }

    @Test
    fun evaluateListNodeAddition_9_plus_2() {
        val resultNode = AddTwoNumbers.addTwoNumbers(createListNode(listOf(2)), createListNode(listOf(9)))
        compareListNodes(createListNode(listOf(1, 1)), resultNode)
    }

    @Test
    fun evaluateListNodeAddition_342_plus_465() {
        val resultNode = AddTwoNumbers.addTwoNumbers(createListNode(listOf(3, 4, 2)), createListNode(listOf(4, 6, 5)))
        compareListNodes(createListNode(listOf(8, 0, 7)), resultNode)
    }

    @Test
    fun evaluateListNodeAdditionToEmptyList() {
        val resultNode = AddTwoNumbers.addTwoNumbers(createListNode(listOf(1, 0, 0)), createListNode(emptyList()))
        compareListNodes(createListNode(listOf(1, 0, 0)), resultNode)
    }

    @Test
    fun evaluateCompareListNodes() {
        compareListNodes(createListNode(listOf(1, 2)), createListNode(listOf(1, 2)))

        compareListNodes(createListNode(listOf(3)), createListNode(listOf(3)))

        compareListNodes(ListNode(1), ListNode(1))
    }


    @Test
    fun assertAddition_when_l1_longer() {
        val resultNode = AddTwoNumbers.addTwoNumbers(createListNode(listOf(1, 9, 0, 0)), createListNode(listOf(8, 4)))
        compareListNodes(createListNode(listOf(1, 9, 8, 4)), resultNode)
    }

    @Test
    fun assertAddition_when_l2_longer() {
        val resultNode = AddTwoNumbers.addTwoNumbers(createListNode(listOf(1)), createListNode(listOf(1, 0, 0)))
        compareListNodes(createListNode(listOf(1, 0, 1)), resultNode)
    }

    private fun compareListNodes(l1: ListNode?, l2: ListNode?): Unit {

        println("---------------")
        var ln1: ListNode? = l1
        var ln2: ListNode? = l2
        while (ln1 != null || ln2 != null) {

            val val1 = ln1?.`val` ?: 0
            val val2 = ln2?.`val` ?: 0


            Assert.assertEquals(val1, val2)

            ln1 = ln1?.next
            ln2 = ln2?.next
            println(String.format("L1 = %d , L2 = %d", val1, val2))
        }

    }

    private fun createListNode(ts: List<Int>): ListNode {
        if (ts.isNullOrEmpty()) return ListNode(0)
        val size = ts.size
        var head = ListNode(ts.get(size - 1))
        var node = head
        for (i in (size - 2) downTo 0) {
            val el = ts.get(i)
            node.next = ListNode(el)
            node.next?.let { it -> node = it }

        }

        return head
    }

}