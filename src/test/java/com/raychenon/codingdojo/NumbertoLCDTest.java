package com.raychenon.codingdojo;

import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Nested;

import static com.raychenon.codingdojo.NumbertoLCD.numberToLcd;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * User: raychenon
 * Date: 25/4/2021
 * https://codingdojo.org/kata/NumberToLCD
 */
public class NumbertoLCDTest {


    @Test
    void one() {
        assertThat(NumbertoLCD.numberToLcd(1)).isEqualTo("""
                      \s
                      |
                      |
                    """);
    }

    @Test
    void two() {
        assertThat(numberToLcd(2)).isEqualTo("""
                     _\s
                     _|
                    |_\s
                    """);
    }

    @Test
    void three() {
        assertThat(numberToLcd(3)).isEqualTo("""
                     _\s
                     _|
                     _|
                    """);
    }

    @Test
    void four() {
        assertThat(numberToLcd(4)).isEqualTo("""
                      \s
                    |_|
                      |
                    """);
    }

    @Test
    void five() {
        assertThat(numberToLcd(5)).isEqualTo("""
                     _\s
                    |_\s
                     _|
                    """);
    }

    @Test
    void six() {
        assertThat(numberToLcd(6)).isEqualTo("""
                     _\s
                    |_\s
                    |_|
                    """);
    }

    @Test
    void seven() {
        assertThat(numberToLcd(7)).isEqualTo("""
                     _\s
                      |
                      |
                    """);
    }

    @Test
    void eight() {
        assertThat(numberToLcd(8)).isEqualTo("""
                     _\s
                    |_|
                    |_|
                    """);
    }

    @Test
    void nine() {
        assertThat(numberToLcd(9)).isEqualTo("""
                     _\s
                    |_|
                     _|
                    """);
    }

    @Test
    void zero() {
        assertThat(numberToLcd(0)).isEqualTo("""
                     _\s
                    | |
                    |_|
                    """);
    }


    @Nested
    class Several_Digits {

        @Test
        void ten() {
            assertThat(numberToLcd(10)).isEqualTo("""
                        _\s
                      || |
                      ||_|
                    """);
        }

        @Test
        void eleven() {
            assertThat(numberToLcd(11)).isEqualTo("""
                         \s
                      |  |
                      |  |
                    """);
        }

        @Test
        void twelve() {
            assertThat(numberToLcd(12)).isEqualTo("""
                        _\s
                      | _|
                      ||_\s
                    """);
        }

        @Test
        void one_hundred() {
            assertThat(numberToLcd(100)).isEqualTo("""
                        _  _\s
                      || || |
                      ||_||_|
                    """);
        }

        @Test
        void one_hundred_twenty_three() {
            assertThat(numberToLcd(123)).isEqualTo("""
                        _  _\s
                      | _| _|
                      ||_  _|
                    """);
        }

        @Test
        void all_digits() {
            assertThat(numberToLcd(1234567890)).isEqualTo("""
                        _  _     _  _  _  _  _  _\s
                      | _| _||_||_ |_   ||_||_|| |
                      ||_  _|  | _||_|  ||_| _||_|
                    """);
        }
    }

    @Nested
    class Scaling_one_digit {

        @Disabled
        @Test
        void one() {
            assertThat(numberToLcd(1, 2)).isEqualTo("""
                      \s
                      |
                      |
                      |
                      |
                    """);
        }
    }


}
