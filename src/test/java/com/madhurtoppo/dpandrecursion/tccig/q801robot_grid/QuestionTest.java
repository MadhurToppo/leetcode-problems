package com.madhurtoppo.dpandrecursion.tccig.q801robot_grid;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuestionTest {

    private Question question;
    private int m;
    private int n;
    private int expected;
    private int actual;

    @BeforeEach
    void setUp() {
        question = new Question();
    }

    @Test
    void test1() {
        m = 3;
        n = 7;
        expected = 28;
        actual = question.uniquePaths(m, n);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        m = 3;
        n = 2;
        expected = 3;
        actual = question.uniquePaths(m, n);
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        m = 7;
        n = 3;
        expected = 28;
        actual = question.uniquePaths(m, n);
        assertEquals(expected, actual);
    }

    @Test
    void test4() {
        m = 3;
        n = 3;
        expected = 6;
        actual = question.uniquePaths(m, n);
        assertEquals(expected, actual);
    }

    @Test
    void test5() {
        m = 0;
        n = 0;
        expected = 0;
        actual = question.uniquePaths(m, n);
        assertEquals(expected, actual);
    }

    @Test
    void test6() {
        m = 0;
        n = 1;
        expected = 0;
        actual = question.uniquePaths(m, n);
        assertEquals(expected, actual);
    }
    @Test
    void test7() {
        m = 1;
        n = 0;
        expected = 0;
        actual = question.uniquePaths(m, n);
        assertEquals(expected, actual);
    }

    @Test
    void test8() {
        m = 1;
        n = 1;
        expected = 1;
        actual = question.uniquePaths(m, n);
        assertEquals(expected, actual);
    }
}