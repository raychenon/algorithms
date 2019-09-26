package com.raychenon;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

/**
 * User: raychenon
 * Date: 2019-09-19
 * https://github.com/raychenon/algorithms/issues/97
 */
public class T9TextTest {

    private static T9Text t9Text;

    @BeforeClass
    public static void setUp() {
        t9Text = new T9Text();
    }

    @Test
    public void typeFewWordsTest() {
        t9Text.preProcess(Arrays.asList("raid", "raie", "aba", "ray"));
        Assert.assertEquals(new HashSet<>(Arrays.asList("raie", "raid")), t9Text.filterWords(7243));
    }

    @Test
    public void typeAllLettersTest() {
        t9Text.preProcess(Arrays.asList("the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"));

        Assert.assertEquals(new HashSet<>(Arrays.asList("brown")), t9Text.filterWords(27696));
        Assert.assertEquals(new HashSet<>(), t9Text.filterWords(1));
    }

}
