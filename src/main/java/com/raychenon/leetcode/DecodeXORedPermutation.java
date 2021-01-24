package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 24/1/2021
 * Explanations
 * https://leetcode.com/problems/decode-xored-permutation/discuss/1031840/Explanations-XOR-and-1st-element-Java-Kotlin-Python
 */
public class DecodeXORedPermutation {
    /**
     * @param encoded
     * @return
     */
    public int[] decode(int[] encoded) {
        int first = 0;
        int n = encoded.length + 1;
        for (int i = 1; i <= n; i++) first ^= i;

        for (int i = 1; i < n - 1; i += 2) first ^= encoded[i];

        int[] perm = new int[n];
        perm[0] = first;
        for (int i = 0; i < n - 1; i++) {
            perm[i + 1] = perm[i] ^ encoded[i];
        }
        return perm;
    }
}
