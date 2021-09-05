package com.madhurtoppo.slidingwindow.leetcode;

import com.madhurtoppo.slidingwindow.leetcode.MinimumSizeSubarraySum;
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
    void minSubArrayLenTest1() {
        target = 7;
        nums = new int[]{2,3,1,2,4,3};
        actual = minimumSizeSubarraySum.minSubArrayLen(target, nums);
        expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void minSubArrayLenTest2() {
        target = 11;
        nums = new int[]{1,1,1,1,1,1,1};
        actual = minimumSizeSubarraySum.minSubArrayLen(target, nums);
        expected = 0;
        assertEquals(expected, actual);
    }
}