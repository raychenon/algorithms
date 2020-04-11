package com.raychenon.leetcode;

import java.util.Stack;

/**
 * User: raychenon
 * Date: 9/4/2020
 * https://leetcode.com/problems/backspace-string-compare
 */
public class BackspaceStringCompare {

    public boolean backspaceCompare(String S, String T) {
        String bs = backspaced(S);
        String bt = backspaced(T);
        System.out.println("bs = " + bs + ", bt = " + bt);
        return bt.equals(bs);
    }

    private String backspaced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '#') {
                stack.add(c);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        return stack.toString();
    }

}
