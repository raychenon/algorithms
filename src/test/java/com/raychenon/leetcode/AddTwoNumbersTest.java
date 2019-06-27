package com.raychenon.leetcode;

import com.sun.tools.javac.util.List;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Collections;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 2019-06-27
 * https://leetcode.com/problems/add-two-numbers/
 */
public class AddTwoNumbersTest {


    private static AddTwoNumbers addTwoNumbers;

    @BeforeClass
    public static void setUp() {
        addTwoNumbers = new AddTwoNumbers();
    }

 
    @Test
    public void assertSumSameListSize() {

        assertEquals(List.of(8, 0, 7), addTwoNumbers.addTwoNumbersList(List.of(3, 4, 2), List.of(4, 6, 5)));
       
        compareListNode(createListNode(List.of(7,0,8)), addTwoNumbers.addTwoNumbers(createListNode(List.of(3,4,2)),createListNode(List.of(4,6,5))));
    }

    @Test
    public void assertCompareListNode() {
        compareListNode(createListNode(List.of(1, 2,3)), createListNode(List.of(1,2)));
    }

    private void compareListNode(ListNode l1, ListNode l2) {
        while (l1 != null || l2 != null) {

            System.out.println("L1 = " + l1.val + " , L2 = " + l2.val);
            assertEquals(l1.val, l2.val);

            l1 = l1.next;
            l2 = l2.next;
        }
    }

    private ListNode createListNode(List<Integer> list) {
        ListNode head = new ListNode(0);
        ListNode node = head;
        for (Integer e : list) {
            node.val = e;
            node.next = new ListNode(e);
            node = node.next;
        }
        return head;
    }
}