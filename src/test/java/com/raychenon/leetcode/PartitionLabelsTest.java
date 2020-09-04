package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

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
        assertEquals(new int[]{8, 7, 9}, instance.partitionLabels("ababcbacadefegdehijhklij"));
    }

    @Test
    public void ababcbadefegdehijhklijopopTest() {
        assertEquals(new int[]{7, 7, 8, 4}, instance.partitionLabels("ababcbadefegdehijhklijopop"));
    }

    @Test
    public void abcdefghijklTest() {
        assertEquals(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, instance.partitionLabels("abcdefghijkl"));
    }


}
