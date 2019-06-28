package com.raychenon.leetcode;

import org.jetbrains.annotations.NotNull;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

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
    public void assertAdditionDifferentListSize1() {

        compareListNode(createListNode(2, 2, 0), addTwoNumbers.addTwoNumbers(createListNode(1, 0, 0), createListNode(1, 2)));
    }

    @Test
    public void assertAdditionDifferentListSize2() {

        compareListNode(createListNode(1, 0, 1), addTwoNumbers.addTwoNumbers(createListNode(1), createListNode(0, 0, 1)));
    }

    @Test
    public void assertSumSameListSize() {

        assertEquals(Arrays.asList(8, 0, 7), addTwoNumbers.addTwoNumbersList(Arrays.asList(3, 4, 2), Arrays.asList(4, 6, 5)));

        compareListNode(createListNode(7, 0, 8), addTwoNumbers.addTwoNumbers(createListNode(3, 4, 2), createListNode(4, 6, 5)));
    }

    @Test
    public void assertAdditionCarryOverflow() {

        compareListNode(createListNode(1, 7, 1), addTwoNumbers.addTwoNumbers(createListNode(9, 8), createListNode(2, 8)));
    }

    @Test
    public void assertCompareListNode() {
        compareListNode(createListNode(1, 2, 3), createListNode(1, 2, 3));
    }

    private void compareListNode(ListNode l1, ListNode l2) {

        System.out.println("---------------");
        while (l1 != null || l2 != null) {

            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            System.out.println(String.format("L1 = %d , L2 = %d", val1, val2));

            assertEquals(val1, val2);

            l1 = l1.next;
            l2 = l2.next;
        }
    }

    private ListNode createListNode(@NotNull int value, int... a) {
        ListNode head = new ListNode(value);
        ListNode node = head;
        for (int e : a) {
            node.next = new ListNode(e);
            node = node.next;
        }

//        ListNode curr = head;
//        System.out.println("------- createListNode --------");
//        while (curr != null) {
//            System.out.println("Curr = " + curr.val);
//            curr = curr.next;
//        }

        return head;
    }
}