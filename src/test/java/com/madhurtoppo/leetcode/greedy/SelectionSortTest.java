package com.madhurtoppo.leetcode.greedy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    private SelectionSort selectionSort;
    private int[] actual;
    private int[] expected;

    @BeforeEach
    void setUp() {
        selectionSort = new SelectionSort();
    }

    @Test
    void selection() {
        actual = selectionSort.selection(new int[]{64,25,12,22,11});
        expected = new int[]{11,12,22,25,64};
        assertArrayEquals(expected, actual);
    }
}