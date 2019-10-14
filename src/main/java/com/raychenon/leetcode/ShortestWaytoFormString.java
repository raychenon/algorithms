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
     *  Inverted index data structure
     *  dictIndex[i][c - 'a'] represents the earliest index >= i where character c occurs in source.
     *  
     * time complexity:  O(S + T) , where S: length of source and T: length of target
     * @param source
     * @param target
     * @return
     */
    public int shortestWayInvertedIndex(String source, String target) {
        char[] s = source.toCharArray();
        char[] t = target.toCharArray();
        int M = s.length;
        int N = t.length;
        int[][] dictIndex = new int[M][26];
        Arrays.fill(dictIndex[M-1], -1); // -1 means no that char in source
        dictIndex[M - 1][s[M - 1] - 'a'] = M - 1;
        for(int x = M - 2; x >= 0; --x) {
            dictIndex[x] = Arrays.copyOf(dictIndex[x + 1], 26);
            dictIndex[x][s[x] - 'a'] = x;
        }
        int ans = 0;
        int idx = 0;
        for(char c: t) {
            if(dictIndex[0][c - 'a'] == -1) return -1;
            if(dictIndex[idx][c - 'a'] == -1) {
                ++ans;
                idx = 0;
            }

            idx = dictIndex[idx][c - 'a'] + 1;
            if(idx == M) {
                ++ans;
                idx = 0;
            }
        }
        return ans + (idx == 0 ? 0 : 1);
    }
}
