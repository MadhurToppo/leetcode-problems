package com.madhurtoppo.dpandrecursion.tccig.q805coin_change;

import com.madhurtoppo.dpandrecursion.tccig.q805coin_change.Question;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    private Question question;
    private int[] coins;
    private int amount;
    private int expected;
    private int actual;

    @BeforeEach
    void setUp() {
        question = new Question();
    }

    @Test
    void test1() {
        amount = 5;
        coins = new int[]{1, 2, 5};
        expected = 4;
        actual = question.change(amount, coins);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        amount = 3;
        coins = new int[]{2};
        expected = 0;
        actual = question.change(amount, coins);
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        amount = 10;
        coins = new int[]{10};
        expected = 1;
        actual = question.change(amount, coins);
        assertEquals(expected, actual);
    }
}