package com.madhurtoppo.tccig.dpandrecursion.q803josephus;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    private Question question;
    private int n;
    private int k;
    private int expected;
    private int actual;

    @BeforeEach
    void setUp() {
        question = new Question();
    }

    @Test
    void test1() {
        n = 15;
        k = 3;
        expected = 5;
        actual = question.josephus(n, k);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        n = 5;
        k = 2;
        expected = 3;
        actual = question.josephus(n, k);
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        n = 47;
        k = 5;
        expected = 4;
        actual = question.josephus(n, k);
        assertEquals(expected, actual);
    }
}