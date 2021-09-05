package com.madhurtoppo.dpandrecursion.tccig.q812curly_braces;

import com.madhurtoppo.dpandrecursion.tccig.q812curly_braces.Question;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    private Question question;
    private int n;
    private List<String> expected;
    private List<String> actual;

    @BeforeEach
    void setUp() {
        question = new Question();
    }

    @Test
    void test1() {
        n = 3;
        expected = new ArrayList<>();
        expected.add("((()))");
        expected.add("(()())");
        expected.add("(())()");
        expected.add("()(())");
        expected.add("()()()");
        actual = question.generateParenthesis(n);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        n = 1;
        expected = new ArrayList<>();
        expected.add("()");
        actual = question.generateParenthesis(n);
        assertEquals(expected, actual);
    }
}