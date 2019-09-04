package com.raychenon.leetcode;

import java.util.*;

/**
 * User: raychenon
 * Date: 2019-09-04
 * https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) return true;

        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');
        map.put('>', '<');

        Set<Character> openingSet = new HashSet<Character>(Arrays.asList('(', '{', '[', '<'));

        Stack<Character> stack = new Stack<Character>();
        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (!stack.isEmpty() && map.get(c) == stack.peek()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
            if (openingSet.contains(c)) {
                stack.push(c);
            }
        }
        // the amount of closing nullify the count of opening parentheses , stack should be empty
        return stack.isEmpty();
    }
}
