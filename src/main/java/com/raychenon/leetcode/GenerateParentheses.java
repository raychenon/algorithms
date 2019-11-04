package com.raychenon.leetcode;


import java.util.LinkedList;
import java.util.List;

/**
 * User: raychenon
 * Date: 2019-11-04
 * https://leetcode.com/problems/generate-parentheses/
 */
public class GenerateParentheses {


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

    public List<String> generateParenthesis(int n) {
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
