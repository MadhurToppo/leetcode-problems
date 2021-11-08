package com.madhurtoppo.heapsandmaps.leetcode.q215kth_largest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    private Question question;
    private int[] nums;
    private int k;

    @BeforeEach
    void setUp() {
        question = new Question();
    }

    @Test
    void findKthLargestElement() {
        nums = new int[]{3,2,1,5,6,4};
        k = 2;
        int actual = question.findKthLargestElement(nums, k);
        int expected = 5;
        assertEquals(expected, actual);
    }
}