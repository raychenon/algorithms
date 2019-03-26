package com.raychenon.hackerrank.linkedlist;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 25/3/19
 * https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle/problem
 */
public class LinkedListCycleDetectionTest {

    private LinkedListCycleDetection linkedListCycleDetection;

    @Before
    public void setUp() {
        linkedListCycleDetection = new LinkedListCycleDetection();
    }

    @Test
    public void assertCycleDetectionForNullNode() {
        SinglyLinkedListNode nullNode = null;
        assertEquals(linkedListCycleDetection.hasCycle(nullNode), false);
    }


    @Test
    public void assertCycleDetectionWhenOnlyList() {

        SinglyLinkedListNode head = new SinglyLinkedListNode(1, null);
        SinglyLinkedListNode node2 = new SinglyLinkedListNode(2, head);
        SinglyLinkedListNode node3 = new SinglyLinkedListNode(3, node2);
        assertEquals(linkedListCycleDetection.hasCycle(head), false);
    }


    @Test
    public void assertCycleDetection() {

        SinglyLinkedListNode node1 = new SinglyLinkedListNode(1, null);
        SinglyLinkedListNode node2 = new SinglyLinkedListNode(2, node1);
        SinglyLinkedListNode node3 = new SinglyLinkedListNode(3, node2);
        SinglyLinkedListNode head = new SinglyLinkedListNode(0, node3);
        node1.next = head;

        assertEquals(linkedListCycleDetection.hasCycle(head), true);
    }


}
