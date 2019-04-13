package com.raychenon.hackerrank.warmup;

import java.util.*;

/**
 * User: raychenon
 * Date: 13/4/19
 * https://www.hackerrank.com/challenges/repeated-string/problem
 */
public class RepeatedString {

    /**
     * repeat the String s to the length of n
     * return the number of 'a' in the string
     * @param s contains only lower case characters
     * @param n
     * @return number of 'a' in the repeated string
     */
    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        StringBuffer str = new StringBuffer(s);
        while(str.length() < n){
            str.append(s);
        }

        int length = (int) n;
        return str.substring(0,length).chars().filter(e -> e =='a').count();
    }
}
