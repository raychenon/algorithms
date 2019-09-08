package com.raychenon.leetcode;

import java.util.Stack;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

/**
 * User: raychenon
 * Date: 2019-09-04
 * https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParentheses {

    /**
     * time complexity : O(n)
     * space complexity : O(n) for only opening parentheses
     * The trick is to store the different parentheses in FIFO structure: Stack
     * An opening parenthese must be closed by its closing counterpart.
     */
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
                // If more closing parenthese, can already fast-exit.
                // De Morgan's laws, complement of (!stack.isEmpty() && map.getValue(c) == stack.peek())
                if (stack.isEmpty() || map.get(c) != stack.peek()) {
                    return false;
                } else {
                    stack.pop();
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
