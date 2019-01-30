package com.raychenon.kotlin.hackerrank

/**
 * User: raychenon
 * Date: 30/1/19
 * https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list/problem
 */

class DoublyLinkedListNode(
    var data: Int,
    var next: DoublyLinkedListNode?,
    var prev: DoublyLinkedListNode?
){}


object ReverseDoublyLinkedListNodeKotlin {

    fun reverse(llist: DoublyLinkedListNode?): DoublyLinkedListNode? {
        var temp: DoublyLinkedListNode? = llist
        var current: DoublyLinkedListNode? = llist

        while(temp != null){
            var prev: DoublyLinkedListNode? = temp.prev
            temp!!.prev = temp.next
            temp!!.next = prev
            current = temp
            temp = temp.prev
        }
        return current
    }
}