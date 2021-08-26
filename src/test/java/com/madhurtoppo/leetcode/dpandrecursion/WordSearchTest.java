package com.madhurtoppo.leetcode.dpandrecursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordSearchTest {

    private WordSearch wordSearch;
    private char[][] board;
    private String word;
    private boolean condition;

    @BeforeEach
    void setUp() {
        wordSearch = new WordSearch();
    }

    @Test
    void existTest1() {
        board = new char[][]{
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        word = "ABCCED";
        condition = wordSearch.exist(board, word);
        assertTrue(condition);
    }

    @Test
    void existTest2() {
        board = new char[][]{
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        word = "SEE";
        condition = wordSearch.exist(board, word);
        assertTrue(condition);
    }

    @Test
    void existTest3() {
        board = new char[][]{
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        word = "ABCB";
        condition = wordSearch.exist(board, word);
        assertFalse(condition);
    }
}