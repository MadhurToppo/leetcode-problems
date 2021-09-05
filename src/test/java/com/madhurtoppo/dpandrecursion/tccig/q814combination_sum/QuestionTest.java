package com.madhurtoppo.dpandrecursion.tccig.q814combination_sum;

import com.madhurtoppo.dpandrecursion.tccig.q814combination_sum.Question;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    private Question question;
    private int[] candidates;
    private int target;
    private List<List<Integer>> actual;
    private List<List<Integer>> expected;

    @BeforeEach
    void setUp() {
        question = new Question();
    }

    @Test
    void combinationTest1() {
        candidates = new int[]{2,3,6,7};
        target = 7;
        actual = question.combination(candidates, target);

        expected = new ArrayList<>();
        expected.add(Arrays.asList(2, 2, 3));
        expected.add(Arrays.asList(7));

        assertEquals(expected, actual);
    }

    @Test
    void combinationTest2() {
        candidates = new int[]{2,3,5};
        target = 8;
        actual = question.combination(candidates, target);

        expected = new ArrayList<>();
        expected.add(Arrays.asList(2, 2, 2, 2));
        expected.add(Arrays.asList(2, 3, 3));
        expected.add(Arrays.asList(3, 5));

        assertEquals(expected, actual);
    }
}