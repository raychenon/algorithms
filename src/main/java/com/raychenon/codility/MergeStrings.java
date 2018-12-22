package com.raychenon.codility;

/**
 * https://www.hackerrank.com/tests/3majmoden4d/questions/a1pngfq2k73
 */
public class MergeStrings {


    public static void main(String[] args) {
        System.out.println("mergeStrings " + mergeStrings("abc", "def") + "  expected adbecf");
        System.out.println("mergeStrings " + mergeStrings("ab", "zsd") + "  expected azbsd");
    }

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
