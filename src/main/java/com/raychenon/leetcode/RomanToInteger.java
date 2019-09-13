package com.raychenon.leetcode;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * User: raychenon
 * Date: 2019-09-13
 * https://leetcode.com/problems/roman-to-integer
 */
public class RomanToInteger {

    private Map<Character, Integer> romanToIntMap =
            Stream.of(new Object[][]{
                    {'I', 1},
                    {'V', 5},
                    {'X', 10},
                    {'L', 50},
                    {'C', 100},
                    {'D', 500},
                    {'M', 1000}
            }).collect(Collectors.toMap(data -> (Character) data[0], data -> (Integer) data[1]));

    public int romanToInt(String s) {
        int sum = 0;

        int size = s.length();
        for (int i = 0; i < size; i++) {
            Character chr = s.charAt(i);
            int value = romanToIntMap.getOrDefault(chr, 0);
            // Trick: if the next Char has a bigger value then the current int value is negative
            // ex : IV = 4 = -1+5
            // IX = -1+10 = 9
            if (((i + 1 < size) && value < romanToIntMap.getOrDefault(s.charAt(i + 1), 0))) {
                sum = sum - value;
            } else {
                sum = sum + value;
            }
        }
        return sum;
    }
}
