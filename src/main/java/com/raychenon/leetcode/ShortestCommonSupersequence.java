package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 10/6/2020
 * https://leetcode.com/problems/shortest-common-supersequence/
 * <p>
 * https://en.wikipedia.org/wiki/Shortest_common_supersequence_problem
 */
public class ShortestCommonSupersequence {

    /**
     * time complexity : O(s1 * s2)
     * space complexity : O(s1 * s2)
     */
    public String shortestCommonSupersequence(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        int[][] mem = new int[n1 + 1][n2 + 1];
        int i, j;

        for (i = 1; i <= n1; i++) {
            for (j = 1; j <= n2; j++) {
                char ch1 = str1.charAt(i - 1);
                char ch2 = str2.charAt(j - 1);
                if (ch1 == ch2) {
                    mem[i][j] = 1 + mem[i - 1][j - 1];
                } else {
                    mem[i][j] = Math.max(mem[i - 1][j], mem[i][j - 1]);
                }
            }
        }
        i = n1;
        j = n2;
        StringBuilder str = new StringBuilder();
        while (i > 0 && j > 0) {
            if (mem[i][j] == mem[i - 1][j]) {
                str.append(str1.charAt(i - 1));
                i--;
            } else if (mem[i][j] == mem[i][j - 1]) {
                str.append(str2.charAt(j - 1));
                j--;
            } else {
                str.append(str1.charAt(i - 1));
                i--;
                j--;
            }
        }
        while (i-- > 0) {
            str.append(str1.charAt(i));
        }
        while (j-- > 0) {
            str.append(str2.charAt(j));
        }
        return str.reverse().toString();
    }
}
