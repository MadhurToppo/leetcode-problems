package com.madhurtoppo.arrays.leetcode.q1two_sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    TwoSum twoSum;
    int[] actual;
    int[] expected;

    @BeforeEach
    void setUp() {
        twoSum = new TwoSum();
        actual = twoSum.brute(new int[]{2,7,8,11}, 9);
        expected = new int[]{0, 1};
    }

    @Test
    void brute() {
        assertArrayEquals(expected, actual);
    }

    @Test
    void onePass() {
        assertArrayEquals(expected, actual);
    }
}