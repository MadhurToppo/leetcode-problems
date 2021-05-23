package com.madhurtoppo.leetcode.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringTest {

    private LongestSubstring longestSubstring;
    private String s;
    private int actual;
    private int expected;

    @BeforeEach
    void setUp() {
        longestSubstring = new LongestSubstring();
    }

    @Test
    void lengthOfLongestSubstringTest1() {
        s = "abcabcbb";
        actual = longestSubstring.lengthOfLongestSubstring(s);
        expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void lengthOfLongestSubstringTest2() {
        s = "pwwkew";
        actual = longestSubstring.lengthOfLongestSubstring(s);
        expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void lengthOfLongestSubstringTest3() {
        s = "";
        actual = longestSubstring.lengthOfLongestSubstring(s);
        expected = 0;
        assertEquals(expected, actual);
    }
}