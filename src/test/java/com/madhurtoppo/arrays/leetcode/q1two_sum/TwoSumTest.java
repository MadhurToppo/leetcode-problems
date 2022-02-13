package com.madhurtoppo.arrays.leetcode.q1two_sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    TwoSum twoSum;
    int[] nums;
    int target;

    @BeforeEach
    void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    void brute() {
        nums = new int[]{2,7,8,11};
        target = 9;
        assertArrayEquals(new int[]{0, 1}, twoSum.brute(nums, target));
    }

    @Test
    void onePass() {
        nums = new int[]{2,7,8,11};
        target = 9;
        assertArrayEquals(new int[]{0, 1}, twoSum.onePass(nums, target));
    }
}