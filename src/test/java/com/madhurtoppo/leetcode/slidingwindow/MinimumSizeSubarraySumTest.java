package com.madhurtoppo.leetcode.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSizeSubarraySumTest {

    private MinimumSizeSubarraySum minimumSizeSubarraySum;
    private int target;
    private int[] nums;
    private int actual;
    private int expected;

    @BeforeEach
    void setUp() {
        minimumSizeSubarraySum = new MinimumSizeSubarraySum();
    }

    @Test
    void minSubArrayLen() {
        target = 7;
        nums = new int[]{2,3,1,2,4,3};
        actual = minimumSizeSubarraySum.minSubArrayLen(target, nums);
        expected = 2;
        assertEquals(expected, actual);
    }
}