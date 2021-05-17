package com.madhurtoppo.leetcode.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsTest {

    private Permutations permutations;
    private int[] nums;
    private List<List<Integer>> actual;
    private List<List<Integer>> expected;

    @BeforeEach
    void setUp() {
        permutations = new Permutations();
    }

    @Test
    void permute() {
        nums = new int[]{1,2,3};

        actual = permutations.permute(nums);

        expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 3));
        expected.add(Arrays.asList(1, 3, 2));
        expected.add(Arrays.asList(2, 1, 3));
        expected.add(Arrays.asList(2, 3, 1));
        expected.add(Arrays.asList(3, 1, 2));
        expected.add(Arrays.asList(3, 2, 1));

        assertEquals(expected, actual);
    }
}