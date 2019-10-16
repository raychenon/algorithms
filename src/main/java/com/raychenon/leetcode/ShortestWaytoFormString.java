package com.raychenon.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

    public int shortestWayMap(String source, String target) {
        char[] sArr = source.toCharArray();
        char[] tArr = target.toCharArray();
        int S = sArr.length;
        Map<Character, Integer>[] dictIndex = new HashMap[S];
        /**
         * dicIndex is the Inverted Index of string "source"
         * For any index in source, each letter is mapped to its index.
         * If there are duplicate letters, the letter is mapped to its leftmost index
         * source: aaab
         * [0] = [a ->0 , b->3]
         * [1] = [a ->1 , b->3]
         * [2] = [a ->2 , b->3]
         * [3] = [b->3]
         */
        for (int x = 0; x < S; x++) {
            Map<Character, Integer> map = new HashMap<>();
            for (int i = x; i < S; i++) {
                map.put(sArr[i], i);
            }
            dictIndex[x] = map;
            // for repeated letters, set the left most index
            dictIndex[x].put(sArr[x], x);
        }
        int count = 0;
        int idx = 0;
        for (char c : tArr) {
            if (!dictIndex[0].containsKey(c)) return -1;

            if (!dictIndex[idx].containsKey(c)) {
                ++count;
                idx = 0;
            }

            idx = dictIndex[idx].getOrDefault(c, 0) + 1;
            if (idx == S) {
                ++count;
                idx = 0;
            }
        }
        return count + (idx == 0 ? 0 : 1);
    }
}
