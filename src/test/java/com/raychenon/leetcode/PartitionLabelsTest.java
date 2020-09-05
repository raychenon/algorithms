package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 4/9/2020
 * https://leetcode.com/problems/partition-labels
 */
public class PartitionLabelsTest {

    private static PartitionLabels instance;

    @BeforeClass
    public static void setUp() {
        instance = new PartitionLabels();
    }

    @Test
    public void ababcbacadefegdehijhklijTest() {
        assertEquals(List.of(9, 7, 8), instance.partitionLabels("ababcbacadefegdehijhklij"));
    }

    @Test
    public void ababcbadefegdehijhklijopopTest() {
        assertEquals(List.of(7, 7, 8, 4), instance.partitionLabels("ababcbadefegdehijhklijopop"));
    }

    @Test
    public void abcdefghijklTest() {
        assertEquals(List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1), instance.partitionLabels("abcdefghijkl"));
    }


}
