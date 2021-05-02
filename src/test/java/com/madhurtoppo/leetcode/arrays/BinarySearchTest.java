package com.madhurtoppo.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void method1() {
        BinarySearch binarySearch = new BinarySearch();

        int actual = binarySearch.method1(new int[]{-1,0,3,5,9,12}, 9);
        int expected = 4;
        assertEquals(expected, actual);

        int actual2 = binarySearch.method1(new int[]{-1,0,3,5,9,12}, 8);
        int expected2 = -1;
        assertEquals(expected2, actual2);
    }
}