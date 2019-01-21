package com.raychenon.hackerrank;

/**
 * https://www.hackerrank.com/tests/3majmoden4d/questions/a1pngfq2k73
 */
public final class MergeStrings {
    
    static String mergeStrings(String a, String b) {

        StringBuffer mergedString = new StringBuffer();
        int la = a.length();
        int lb = b.length();
        int max = Math.max(la, lb);
        for (int i = 0; i < max; i++) {
            if (i < la) {
                mergedString.append(a.charAt(i));
            }
            if (i < lb) {
                mergedString.append(b.charAt(i));
            }
        }
        return mergedString.toString();
    }

}
