package com.madhurtoppo.leetcode.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectedComponentsTest {

    private ConnectedComponents connectedComponents;
    private int n;
    private int[][] edges;
    private int actual;
    private int expected;

    @BeforeEach
    void setUp() {
        connectedComponents = new ConnectedComponents();
    }

    @Test
    void countComponentsTest1() {
        n = 5;
        edges = new int[][]{{0,1}, {1,2}, {2,0}, {3,4}};
        actual = connectedComponents.countComponents(n,  edges);
        expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void countComponentsTest2() {
        n = 6;
        edges = new int[][]{{0,1}, {2,3}, {4,5}};
        actual = connectedComponents.countComponents(n,  edges);
        expected = 3;
        assertEquals(expected, actual);
    }
}