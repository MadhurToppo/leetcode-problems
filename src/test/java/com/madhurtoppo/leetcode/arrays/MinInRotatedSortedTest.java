package com.madhurtoppo.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinInRotatedSortedTest {

    @Test
    void method2() {

        MinInRotatedSorted minInRotatedSorted = new MinInRotatedSorted();

        int actual = minInRotatedSorted.method2(new int[]{7,8,0,1,2,3,4,5,6});
        int expected = 0;

        int actual2 = minInRotatedSorted.method2(new int[]{4,5,6,7,1,2,3});
        int expected2 = 1;

        assertEquals(expected, actual);
        assertEquals(expected2, actual2);
    }
}