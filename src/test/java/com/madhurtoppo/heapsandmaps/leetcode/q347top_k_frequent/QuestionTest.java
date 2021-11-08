package com.madhurtoppo.heapsandmaps.leetcode.q347top_k_frequent;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    private int[] nums;
    private int k;
    private Question question;

    @BeforeEach
    void setUp() {
        question = new Question();
    }

    @Test
    void topKFrequent() {
        nums = new int[]{1,1,1,2,2,3};
        k = 2;
        int[] actual = question.topKFrequent(nums, k);
        int[] expected = new int[]{2,1};
        assertArrayEquals(expected, actual);
    }
}