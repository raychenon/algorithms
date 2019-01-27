package com.raychenon.hackerrank;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 27/1/19
 */
public class ReverseDoublyLinkedListNodeTest {

    public static void main(String [ ] args) {
        
        readDoublyLinkedList(createLinkedList(1,2,3,4));
    }

    @Test
    public void assertReverseDoublyLinkedListNode() {

        ReverseDoublyLinkedListNode.DoublyLinkedListNode node = createLinkedList(1,2,3,4);
        ReverseDoublyLinkedListNode.DoublyLinkedListNode nodeReversed = createLinkedList(4,3,2,1);
        readDoublyLinkedList(node);
        readDoublyLinkedList(nodeReversed);
        
        assertEquals(ReverseDoublyLinkedListNode.reverse(node),
                nodeReversed
        );
    }

    static  ReverseDoublyLinkedListNode.DoublyLinkedListNode createLinkedList(int ... args){
        List<Integer> list = new LinkedList<Integer>();
        for(int i : args){
            list.add(i);
        }
        return createLinkedList(list);
    }
    
    static ReverseDoublyLinkedListNode.DoublyLinkedListNode createLinkedList(List<Integer> data) {
        if(data.size() == 0){
            return null;
        }

        ReverseDoublyLinkedListNode.DoublyLinkedListNode head = new ReverseDoublyLinkedListNode.DoublyLinkedListNode();
        ReverseDoublyLinkedListNode.DoublyLinkedListNode temp = new ReverseDoublyLinkedListNode.DoublyLinkedListNode();

        for(int i=0;i<data.size();i++){
            ReverseDoublyLinkedListNode.DoublyLinkedListNode current = new ReverseDoublyLinkedListNode.DoublyLinkedListNode();
            current.data = data.get(i);
            current.prev = temp;
            temp.next = current;
            if (i == 0){
                head = current;
            }
            temp = current;
        }

        return head;
    }

    static void readDoublyLinkedList(ReverseDoublyLinkedListNode.DoublyLinkedListNode node){
        ReverseDoublyLinkedListNode.DoublyLinkedListNode temp = node;

        while(temp != null){
            System.out.println("Data  " + temp.data + ", next = " + temp.next + ", prev = " + temp.prev);
            temp = temp.next;
        }
    }
}
