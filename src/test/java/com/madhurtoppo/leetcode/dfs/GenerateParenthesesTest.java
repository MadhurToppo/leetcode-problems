package com.madhurtoppo.leetcode.dfs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesTest {

    private GenerateParentheses generateParentheses;
    private int n;
    private List<String> actual;
    private List<String> expected;

    @BeforeEach
    void setUp() {
        generateParentheses = new GenerateParentheses();
    }

    @Test
    void generateParenthesis() {
        n = 3;
        actual = generateParentheses.generateParenthesis(n);
        expected = new ArrayList<>(Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()"));
        assertEquals(expected, actual);
    }
}