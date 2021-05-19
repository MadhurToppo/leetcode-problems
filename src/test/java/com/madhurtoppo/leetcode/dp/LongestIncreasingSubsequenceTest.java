package com.madhurtoppo.leetcode.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestIncreasingSubsequenceTest {

    private LongestIncreasingSubsequence longestIncreasingSubsequence;
    private int[] nums;
    private int actual;
    private int expected;

    @BeforeEach
    void setUp() {
        longestIncreasingSubsequence = new LongestIncreasingSubsequence();
    }

    @Test
    void lengthOfLIS() {
        nums = new int[]{10,9,2,5,3,7,101,18};
        actual = longestIncreasingSubsequence.lengthOfLIS(nums);
        expected = 4;
        assertEquals(expected, actual);
    }
}