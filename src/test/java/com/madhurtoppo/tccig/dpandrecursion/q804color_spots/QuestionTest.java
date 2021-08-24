package com.madhurtoppo.tccig.dpandrecursion.q804color_spots;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    private Question question;
    private int cols;
    private int rows;
    private int[][] a;
    private int expected;
    private int actual;

    @BeforeEach
    void setUp() {
        question = new Question();
    }

    @Test
    void test1() {
        cols = 5;
        rows = 5;
        a = new int[][]{
                {1,2,3,3,2},
                {2,1,2,3,3},
                {2,3,3,3,3},
                {3,2,1,1,3},
                {1,3,2,3,3}
        };
        actual = question.determineBiggestColorSpot(cols, rows, a);
        expected = 11;
        assertEquals(expected, actual);
    }
}