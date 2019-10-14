package com.raychenon.leetcode;

import java.util.Arrays;

/**
 * User: raychenon
 * Date: 2019-10-13
 * https://leetcode.com/problems/shortest-way-to-form-string/
 */
public class ShortestWaytoFormString {

    /**
     * time complexity: O(S*T) , where S: length of source and T: length of target
     *
     * @param source
     * @param target
     * @return
     */
    public int shortestWayPointers(String source, String target) {
        char[] cs = source.toCharArray(), ts = target.toCharArray();
        int res = 0;
        for (int i = 0; i < ts.length; ) {
            int oriI = i;
            for (int j = 0; j < cs.length; j++) {
                if (i < ts.length && cs[j] == ts[i])
                    i++;
            }
            if (i == oriI) return -1;
            res++;
        }
        return res;
    }

    /**
     * Inverted index data structure
     * dictIndex[i][c - 'a'] represents the earliest index >= i where character c occurs in source.
     * <p>
     * time complexity:  O(S+T) , where S is the length of source and T is the length of target
     * space complexity: O(S)
     *
     * @param source
     * @param target
     * @return
     */
    public int shortestWayInvertedIndex(String source, String target) {
        char[] sArr = source.toCharArray();
        char[] tArr = target.toCharArray();
        int S = sArr.length;
        int[][] dictIndex = new int[S][26];
        Arrays.fill(dictIndex[S - 1], -1); // -1 means no that char in source
        dictIndex[S - 1][sArr[S - 1] - 'a'] = S - 1;
        for (int x = S - 2; x >= 0; --x) {
            dictIndex[x] = Arrays.copyOf(dictIndex[x + 1], 26);
            dictIndex[x][sArr[x] - 'a'] = x;
        }
        int ans = 0;
        int idx = 0;
        for (char c : tArr) {
            if (dictIndex[0][c - 'a'] == -1) return -1;
            if (dictIndex[idx][c - 'a'] == -1) {
                ++ans;
                idx = 0;
            }

            idx = dictIndex[idx][c - 'a'] + 1;
            if (idx == S) {
                ++ans;
                idx = 0;
            }
        }
        return ans + (idx == 0 ? 0 : 1);
    }
}
