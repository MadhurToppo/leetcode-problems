package com.madhurtoppo.leetcode.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumTest {

    private CombinationSum combinationSum;
    private int[] candidates;
    private int target;
    private List<List<Integer>> actual;
    private List<List<Integer>> expected;

    @BeforeEach
    void setUp() {
        combinationSum = new CombinationSum();
    }

    @Test
    void combinationTest1() {
        candidates = new int[]{2,3,6,7};
        target = 7;

        actual = combinationSum.combination(candidates, target);
        expected = new ArrayList<>();
        expected.add(Arrays.asList(2, 2, 3));
        expected.add(Arrays.asList(7));

        assertEquals(expected, actual);
    }

    @Test
    void combinationTest2() {
        candidates = new int[]{2,3,5};
        target = 8;

        actual = combinationSum.combination(candidates, target);
        expected = new ArrayList<>();
        expected.add(Arrays.asList(2, 2, 2, 2));
        expected.add(Arrays.asList(2, 3, 3));
        expected.add(Arrays.asList(3, 5));

        assertEquals(expected, actual);
    }
}