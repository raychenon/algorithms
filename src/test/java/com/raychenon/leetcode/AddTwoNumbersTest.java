package com.raychenon.leetcode;

import com.sun.tools.javac.util.List;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 2019-06-27
 * https://leetcode.com/problems/add-two-numbers/
 */
public class AddTwoNumbersTest {


    private static AddTwoNumbers addTwoNumbers;

    @BeforeClass
    public static void setUp() {
        addTwoNumbers = new AddTwoNumbers();
    }

    @Test
    public void assertSumSameListSize() {

        assertEquals(List.of(8, 0, 7), addTwoNumbers.addTwoNumbers(List.of(3, 4, 2), List.of(4, 6, 5)));
    }
}