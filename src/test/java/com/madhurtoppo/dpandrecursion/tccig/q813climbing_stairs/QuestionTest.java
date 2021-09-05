package com.madhurtoppo.dpandrecursion.tccig.q813climbing_stairs;

import com.madhurtoppo.dpandrecursion.tccig.q813climbing_stairs.Question;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    private Question question;

    private int n;
    private int expected;
    private int actual;


    @BeforeEach
    void setUp() {
        question = new Question();
    }

    @Test
    void recursiveTest1() {
        n = 2;
        expected = 2;
        actual = question.recursive(n);
        assertEquals(expected, actual);
    }

    @Test
    void recursiveTest2() {
        n = 3;
        expected = 3;
        actual = question.recursive(n);
        assertEquals(expected, actual);
    }

    @Test
    void iterativeTest1() {
        n = 2;
        expected = 2;
        actual = question.iterative(n);
        assertEquals(expected, actual);
    }

    @Test
    void iterativeTest2() {
        n = 3;
        expected = 3;
        actual = question.iterative(n);
        assertEquals(expected, actual);
    }
}