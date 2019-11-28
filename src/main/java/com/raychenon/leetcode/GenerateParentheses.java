package com.raychenon.leetcode;


import java.util.LinkedList;
import java.util.List;

/**
 * User: raychenon
 * Date: 2019-11-04
 * https://leetcode.com/problems/generate-parentheses/
 */
public class GenerateParentheses {

    public List<String> generateParenthesisBruteForce(int n) {
        List<String> combinations = new LinkedList<>();
        generateAll(new char[2 * n], 0, combinations);
        return combinations;
    }

    private void generateAll(char[] current, int pos, List<String> result) {
        if (pos == current.length) {
            if (isValid(current)) result.add(new String(current));
        } else {
            current[pos] = '(';
            generateAll(current, pos + 1, result);
            current[pos] = ')';
            generateAll(current, pos + 1, result);
        }
    }

    private boolean isValid(char[] current) {
        int balance = 0;
        for (char c : current) {
            if (c == '(') balance++;
            else balance--;
            if (balance < 0) return false;
        }
        return (balance == 0);
    }


    /**
     * Time and Space Complexity: O(4^n/sqrt(n)) similar to Backtracking
     */
    public List<String> generateParenthesisClosureNumber(int n) {
        List<String> ans = new LinkedList<>();
        if (n == 0) {
            ans.add("");
        } else {
            for (int i = 0; i < n; i++) {
                for (String left : generateParenthesisClosureNumber(i)) {
                    for (String right : generateParenthesisClosureNumber(n - 1 - i)) {
                        ans.add("(" + left + ")" + right);
                    }
                }
            }
        }
        return ans;
    }

    /**
     * Time Complexity : O(4^n/sqrt(n)). Each valid sequence has at most n steps during the backtracking procedure.
     * Space Complexity : O(4^n/sqrt(n)), as described above, and using O(n)O(n) space to store the sequence.
     */
    public List<String> generateParenthesisBackTrack(int n) {
        List<String> ans = new LinkedList<>();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    private void backtrack(List<String> ans, String cur, int open, int close, int max) {
        if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }

        if (open < max) backtrack(ans, cur + "(", open + 1, close, max);
        if (close < open) backtrack(ans, cur + ")", open, close + 1, max);
    }

}
