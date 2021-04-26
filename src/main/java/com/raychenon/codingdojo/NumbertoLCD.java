package com.raychenon.codingdojo;

import java.util.List;
import java.util.stream.Collectors;

/**
 * User: raychenon
 * Date: 25/4/2021
 * https://codingdojo.org/kata/NumberToLCD
 */
public class NumbertoLCD {

    static String numberToLcd(long number) {
        return numberToLcd(number, 1);
    }

    static String numberToLcd(long number, int height) {
        var digits = digits(number);
        var result = new StringBuilder();
        for (int line = 0; line < 3; line += 1) {
            for (var digit : digits) {
                result.append(digit[line]);
            }
            result.append("\n");
        }
        return result.toString();
    }

    private static List<String[]> digits(long number) {
        if (number < 0) throw new IllegalArgumentException("number should be >= 0, got: " + number);
        return String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .mapToObj(NumbertoLCD::digitToLcd)
                .collect(Collectors.toList());
    }

    private static final String[][] DIGITS = (new String[][]{
            {" _ ", "   ", " _ ", " _ ", "   ", " _ ", " _ ", " _ ", " _ ", " _ "},
            {"| |", "  |", " _|", " _|", "|_|", "|_ ", "|_ ", "  |", "|_|", "|_|"},
            {"|_|", "  |", "|_ ", " _|", "  |", " _|", "|_|", "  |", "|_|", " _|"},
    });

    private static final String[][] DIGITS_T = {
            {DIGITS[0][0], DIGITS[1][0], DIGITS[2][0]},
            {DIGITS[0][1], DIGITS[1][1], DIGITS[2][1]},
            {DIGITS[0][2], DIGITS[1][2], DIGITS[2][2]},
            {DIGITS[0][3], DIGITS[1][3], DIGITS[2][3]},
            {DIGITS[0][4], DIGITS[1][4], DIGITS[2][4]},
            {DIGITS[0][5], DIGITS[1][5], DIGITS[2][5]},
            {DIGITS[0][6], DIGITS[1][6], DIGITS[2][6]},
            {DIGITS[0][7], DIGITS[1][7], DIGITS[2][7]},
            {DIGITS[0][8], DIGITS[1][8], DIGITS[2][8]},
            {DIGITS[0][9], DIGITS[1][9], DIGITS[2][9]},
    };

    private static String[] digitToLcd(int number) {
        return DIGITS_T[number];
    }
}
