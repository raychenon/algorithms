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
        DoublyLinkedListNode reverseNode = new DoublyLinkedListNode();
        DoublyLinkedListNode temp = new DoublyLinkedListNode();
        while(head.next != null){
            reverseNode.data = head.data;
            reverseNode.prev = head.next;
            temp = reverseNode.prev;
           
            reverseNode.next = temp;
        }
        return reverseNode;
    }

}
