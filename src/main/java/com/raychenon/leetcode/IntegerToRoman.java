package com.raychenon.leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * User: raychenon
 * Date: 2019-09-12
 * https://leetcode.com/problems/integer-to-roman/
 */
public class IntegerToRoman {

    private List<Tuple> romanList = Arrays.asList(
            new Tuple(1000, "M"),
            new Tuple(900, "CM"),
            new Tuple(500, "D"),
            new Tuple(400, "CD"),
            new Tuple(100, "C"),
            new Tuple(90, "XC"),
            new Tuple(50, "L"),
            new Tuple(40, "IV"),
            new Tuple(10, "X"),
            new Tuple(9, "IX"),
            new Tuple(5, "V"),
            new Tuple(4, "IV"),
            new Tuple(1, "I"));

    static class Tuple {
        Integer integer;
        String roman;

        public Tuple(Integer integer, String roman) {
            this.integer = integer;
            this.roman = roman;
        }
    }

    public String intToRoman(int num) {
        int index = 0;
        StringBuilder str = new StringBuilder();
        while (num != 0) {
            if (num >= romanList.get(index).integer) {
                Tuple tuple = romanList.get(index);
                num = num - tuple.integer;
                str.append(tuple.roman);
            } else {
                index++;
            }
        }
        return str.toString();
    }

}
