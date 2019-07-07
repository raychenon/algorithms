package com.raychenon.leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * User: raychenon
 * Date: 2019-06-27
 * https://leetcode.com/problems/add-two-numbers/
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbers {

    public List<Integer> addTwoNumbersList(List<Integer> l1, List<Integer> l2) {

        List<Integer> result = new LinkedList<>();
        int carryNext = 0;
        for (int i = 0; i < l1.size(); i++) {

            int sum = l1.get(i) + l2.get(i);
            int carry = 0;
            if (sum >= 10) {
                carry = sum / 10;
                sum = sum - carry * 10;
            } else {
                carry = 0;
            }
            result.add(sum + carryNext);
            carryNext = carry;
        }
        Collections.reverse(result);
        return result;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

}
