package com.raychenon.codingdojo;

import java.util.List;

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
                .toList();
    }

    private static final String[][] DIGITS = transpose(new String[][] {
            {" _ ", "   ", " _ ", " _ ", "   ", " _ ", " _ ", " _ ", " _ ", " _ "},
            {"| |", "  |", " _|", " _|", "|_|", "|_ ", "|_ ", "  |", "|_|", "|_|"},
            {"|_|", "  |", "|_ ", " _|", "  |", " _|", "|_|", "  |", "|_|", " _|"},
    });
    
}
