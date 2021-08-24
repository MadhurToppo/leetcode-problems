package com.madhurtoppo.tccig.dpandrecursion.q815word_break;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    private Question question;
    private String s;
    private List<String> wordDict;
    private boolean condition;

    @BeforeEach
    void setUp() {
        question = new Question();
    }

    @Test
    void test1() {
        s = "leetcode";
        wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        condition = question.wordBreak(s, wordDict);
        assertTrue(condition);
    }

    @Test
    void test2() {
        s = "applepenapple";
        wordDict = new ArrayList<>();
        wordDict.add("apple");
        wordDict.add("pen");
        condition = question.wordBreak(s, wordDict);
        assertTrue(condition);
    }

    @Test
    void test3() {
        s = "catsandod";
        wordDict = new ArrayList<>();
        wordDict.add("cats");
        wordDict.add("dog");
        wordDict.add("sand");
        wordDict.add("and");
        wordDict.add("cat");
        condition = question.wordBreak(s, wordDict);
        assertFalse(condition);
    }

}