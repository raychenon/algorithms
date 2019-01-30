package com.raychenon.kotlin.hackerrank

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 30/1/19
 * https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list/problem
 */
class ReverseDoublyLinkedListNodeTest {

    @Test
    fun evaluateReserveEmptyNode(){
        val emptyNode = null
        Assert.assertEquals(ReverseDoublyLinkedListNodeKotlin.reverse(emptyNode),emptyNode)
    }


    @Test
    fun evaluateReserveSingleNode(){
        val node = DoublyLinkedListNode(1,null,null)
        Assert.assertEquals(ReverseDoublyLinkedListNodeKotlin.reverse(node),node)
    }
    
}