package com.madhurtoppo.leetcode.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumWindowSubstringTest {

    private MinimumWindowSubstring minimumWindowSubstring;
    private String S;
    private String T;
    private String actual;
    private String expected;

    @BeforeEach
    void setUp() {
        minimumWindowSubstring = new MinimumWindowSubstring();
    }

    @Test
    void minWindowTest1() {
        S = "ADOBECODEBANC";
        T = "ABC";
        actual = minimumWindowSubstring.minWindow(S, T);
        expected = "BANC";
        assertEquals(expected, actual);
    }

    @Test
    void minWindowTest2() {
        S = "a";
        T = "a";
        actual = minimumWindowSubstring.minWindow(S, T);
        expected = "a";
        assertEquals(expected, actual);
    }
}