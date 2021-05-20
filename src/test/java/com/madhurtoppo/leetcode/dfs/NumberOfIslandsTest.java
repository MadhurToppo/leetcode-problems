package com.madhurtoppo.leetcode.dfs;

import com.madhurtoppo.leetcode.dfs.NumberOfIslands;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfIslandsTest {

    private NumberOfIslands numberOfIslands;
    private char[][] grid;
    private int actual;
    private int expected;

    @BeforeEach
    void setUp() {
        numberOfIslands = new NumberOfIslands();
    }

    @Test
    void numIslands() {
        grid = new char[][]{
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'},
        };
        actual = numberOfIslands.numIslands(grid);
        expected = 3;
        assertEquals(expected, actual);
    }
}