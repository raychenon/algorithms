package com.raychenon.leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * User: raychenon
 * Date: 2019-06-27
 * https://leetcode.com/problems/add-two-numbers/
 *
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbers {

    public List<Integer> addTwoNumbers(List<Integer> l1, List<Integer> l2) {

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

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
