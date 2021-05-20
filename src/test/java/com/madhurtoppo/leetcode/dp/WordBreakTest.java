package com.madhurtoppo.leetcode.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordBreakTest {

    private WordBreak wordBreak;
    private String s;
    private List<String> wordDict;
    private boolean condition;

    @BeforeEach
    void setUp() {
        wordBreak = new WordBreak();
    }

    @Test
    void wbRecursiveTest1() {
        s = "leetcode";
        wordDict = new ArrayList<>(Arrays.asList("leet", "code"));
        condition = wordBreak.wbRecursive(s, wordDict);
        assertTrue(condition);
    }

    @Test
    void wbRecursiveTest2() {
        s = "applepenapple";
        wordDict = new ArrayList<>(Arrays.asList("apple", "pen"));
        condition = wordBreak.wbRecursive(s, wordDict);
        assertTrue(condition);
    }

    @Test
    void wbRecursiveTest3() {
        s = "catsandog";
        wordDict = new ArrayList<>(Arrays.asList("cats", "dog", "sand", "and", "cat"));
        condition = wordBreak.wbRecursive(s, wordDict);
        assertFalse(condition);
    }

    @Test
    void wbIterativeTest1() {
        s = "leetcode";
        wordDict = new ArrayList<>(Arrays.asList("leet", "code"));
        condition = wordBreak.wbIterative(s, wordDict);
        assertTrue(condition);
    }

    @Test
    void wbIterativeTest2() {
        s = "applepenapple";
        wordDict = new ArrayList<>(Arrays.asList("apple", "pen"));
        condition = wordBreak.wbIterative(s, wordDict);
        assertTrue(condition);
    }

    @Test
    void wbIterativeTest3() {
        s = "catsandog";
        wordDict = new ArrayList<>(Arrays.asList("cats", "dog", "sand", "and", "cat"));
        condition = wordBreak.wbIterative(s, wordDict);
        assertFalse(condition);
    }
}