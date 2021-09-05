package com.madhurtoppo.treesandgraphs.leetcode;

import com.madhurtoppo.treesandgraphs.leetcode.MinimumHeightTrees;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MinimumHeightTreesTest {

    private MinimumHeightTrees minimumHeightTrees;
    private int n;
    private int[][] edges;
    private List<Integer> actual;
    private List<Integer> expected;

    @BeforeEach
    void setUp() {
        minimumHeightTrees = new MinimumHeightTrees();
    }

    @Test
    void findMinHeightTreesTest1() {
        n = 4;
        edges = new int[][]{{1,0}, {1,2}, {1,3}};
        actual = minimumHeightTrees.findMinHeightTrees(n, edges);
        expected = new ArrayList<>(Arrays.asList(1));
        assertEquals(expected, actual);
    }

    @Test
    void findMinHeightTreesTest2() {
        n = 6;
        edges = new int[][]{{3,0}, {3,1}, {3,2}, {3,4}, {5,4}};
        actual = minimumHeightTrees.findMinHeightTrees(n, edges);
        expected = new ArrayList<>(Arrays.asList(3, 4));
        assertEquals(expected, actual);
    }
}