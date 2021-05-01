package com.madhurtoppo.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void brute() {
        TwoSum twoSum = new TwoSum();

        int[] actual = twoSum.brute(new int[]{2,7,8,11}, 9);
        int[] expected = {0,1};

        assertArrayEquals(expected, actual);
    }

    @Test
    void onePass() {
        TwoSum twoSum = new TwoSum();

        int[] actual = twoSum.onePass(new int[]{2,8,7,11}, 9);
        int[] expected = new int[]{0,2};

        assertArrayEquals(expected, actual);
    }
}