package com.raychenon.hackerrank;

/**
 * User: raychenon
 * Date: 27/1/19
 * https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list/problem
 */
public class ReverseDoublyLinkedListNode {

    static class DoublyLinkedListNode {
        int data;
        DoublyLinkedListNode next;
        DoublyLinkedListNode prev;
    }

    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        DoublyLinkedListNode current = head;
        DoublyLinkedListNode temp = head;

        while(temp != null){
            DoublyLinkedListNode prev = temp.prev;
            temp.prev = temp.next;
            temp.next = prev;
            current = temp;
            temp = temp.prev;
//            temp = current.next;
//            current.next = temp.prev;
//            current.prev = temp;
//            current = current.next;
        }
        return current;
    }

}
