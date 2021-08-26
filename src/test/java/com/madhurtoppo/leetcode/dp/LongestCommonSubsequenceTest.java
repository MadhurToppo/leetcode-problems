package com.madhurtoppo.leetcode.dp;

import com.madhurtoppo.leetcode.dpandrecursion.LongestCommonSubsequence;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubsequenceTest {

    private LongestCommonSubsequence longestCommonSubsequence;
    private String text1;
    private String text2;
    private int actual;
    private int expected;

    @BeforeEach
    void setUp() {
        longestCommonSubsequence = new LongestCommonSubsequence();
    }

    @Test
    void recursiveTest1() {
        text1 = "abcde";
        text2 = "abc";
        actual = longestCommonSubsequence.recursive(text1, text2);
        expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void recursiveTest2() {
        text1 = "abcd";
        text2 = "abcd";
        actual = longestCommonSubsequence.recursive(text1, text2);
        expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void iterativeTest1() {
        text1 = "abcde";
        text2 = "abc";
        actual = longestCommonSubsequence.iterative(text1, text2);
        expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void iterativeTest2() {
        text1 = "abcd";
        text2 = "abcd";
        actual = longestCommonSubsequence.iterative(text1, text2);
        expected = 4;
        assertEquals(expected, actual);
    }
}