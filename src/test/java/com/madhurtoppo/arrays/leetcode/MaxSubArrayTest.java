package com.madhurtoppo.arrays.leetcode;

import com.madhurtoppo.arrays.leetcode.MaxSubArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSubArrayTest {

    @Test
    void maxSubArray() {
        MaxSubArray maxSubArray = new MaxSubArray();

        int actual1 = maxSubArray.kadane(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        int expected1 = 6;

        int actual2 = maxSubArray.kadane(new int[]{5,4,-1,7,8});
        int expected2 = 23;

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }
}