package com.raychenon.hackerrank.warmup;

/**
 * User: raychenon
 * Date: 13/4/19
 * https://www.hackerrank.com/challenges/repeated-string/problem
 */
public class RepeatedString {

    /**
     * repeat the String s to the length of n
     * return the number of 'a' in the string
     *
     * @param s contains only lower case characters
     * @param n
     * @return number of 'a' in the repeated string
     */
    // Complete the repeatedString function below.
    long repeatedString(String s, long n) {

        long nbA = s.chars().filter(e -> e == 'a').count();

        if (nbA == 0) {
            return 0;
        }

        long nbS = n / s.length();
        long remainder = n % s.length();

        return s.length() > n ? remainderCounter(s, n) : nbS * nbA + remainderCounter(s, remainder);
    }


    private long remainderCounter(String s, long end) {
        int limit = (int) end;
        String sub = s.substring(0, limit);
        return sub.chars().filter(e -> e == 'a').count();
    }

}
