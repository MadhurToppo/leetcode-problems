package com.madhurtoppo.leetcode.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    private BinarySearch binarySearch;
    private int[] nums;
    private int target;

    @BeforeEach
    void setUp() {
        binarySearch = new BinarySearch();
    }

    @Test
    void method1test1() {
        nums = new int[]{-1,0,3,5,9,12};
        target = 9;

        int actual = binarySearch.method1(nums, target);
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void method1test2() {
        nums = new int[]{-1,0,3,5,9,12};
        target = 8;

        int actual = binarySearch.method1(nums, target);
        int expected = -1;

        assertEquals(expected, actual);
    }
}