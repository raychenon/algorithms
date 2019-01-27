package com.raychenon.hackerrank;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 27/1/19
 */
public class ReverseDoublyLinkedListNodeTest {

    @Test
    public void assertReverseDoublyLinkedListNode() {
        assertEquals(ReverseDoublyLinkedListNode.reverse(
                createLinkedList(Arrays.asList(1,2,3,4))),
                createLinkedList(Arrays.asList(4,3,2,1))
        );
    }
    
    static ReverseDoublyLinkedListNode.DoublyLinkedListNode createLinkedList(List<Integer> data) {
        if(data.size() > 0){
            return null;
        }

        ReverseDoublyLinkedListNode.DoublyLinkedListNode head = new ReverseDoublyLinkedListNode.DoublyLinkedListNode();
        ReverseDoublyLinkedListNode.DoublyLinkedListNode current = new ReverseDoublyLinkedListNode.DoublyLinkedListNode();
        head.data = data.get(0);
        head.next = current.prev;
        head.prev = null;

        ReverseDoublyLinkedListNode.DoublyLinkedListNode next = new ReverseDoublyLinkedListNode.DoublyLinkedListNode();

        for(Integer item: data.subList(1,data.size()-1)){
            current.data = item;
            
            current.next = next.prev;
        }
        next.next = null;

        return head;
    }
}
