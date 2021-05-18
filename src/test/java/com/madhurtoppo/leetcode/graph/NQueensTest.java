package com.madhurtoppo.leetcode.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NQueensTest {

    private NQueens nQueens;
    private int n;
    private List<List<String>> actual;
    private List<List<String>> expected;

    @BeforeEach
    void setUp() {
        nQueens = new NQueens();
    }

    @Test
    void solveNQueens() {
        n = 4;
        actual = nQueens.solveNQueens(n);

        expected = new ArrayList<>();
        expected.add(Arrays.asList("..Q.", "Q...", "...Q", ".Q.."));
        expected.add(Arrays.asList(".Q..", "...Q", "Q...", "..Q."));

        assertEquals(expected, actual);
    }
}