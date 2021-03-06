package com.raychenon.hackerrank.linkedlist;

/**
 * User: raychenon
 * Date: 25/3/19
 * https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle/problem
 */
public final class LinkedListCycleDetection {

    public LinkedListCycleDetection() {
    }

    /**
     * Slow and fast pointers
     * https://en.wikipedia.org/wiki/Cycle_detection#Floyd.27s_Tortoise_and_Hare
     * In one cycle, the Hare does 2 steps,the Tortoise does 1 step.
     * At some point, they will reach the same index in the List.
     *
     * @param head
     * @return boolean
     */
     boolean hasCycle(SinglyLinkedListNode head) {
        if (head == null) {
            return false;
        }

        SinglyLinkedListNode tortoise = head;
        SinglyLinkedListNode hare = head.next;

        while (tortoise != hare) {
            if (hare == null || hare.next == null) {
                return false;
            }
            tortoise = tortoise.next;
            hare = hare.next.next;
        }

        return true;
    }

}
