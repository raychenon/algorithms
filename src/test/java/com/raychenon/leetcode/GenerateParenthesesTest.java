package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 2019-11-05
 * https://leetcode.com/problems/generate-parentheses/
 */
public class GenerateParenthesesTest {

    private static GenerateParenthesis instance;

    @BeforeClass
    public static void setUp() {
        instance = new GenerateParenthesis();
    }

    @Test
    public void size1Test() {
        List<String> expectedResults = Arrays.asList("()");
        assertEquals(expectedResults, instance.generateParenthesis(1));
    }

    @Test
    public void size3Test() {
        List<String> expectedResults = Arrays.asList("((()))",
                "(()())",
                "(())()",
                "()(())",
                "()()()");
        assertEquals(expectedResults, instance.generateParenthesis(3));
    }


}
