package com.madhurtoppo.dpandrecursion.leetcode.q78subsets;

//import com.madhurtoppo.dpandrecursion.leetcode.q78subsets.Subsets;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubsetsTest {

    private Subsets subsets;
    private int[] nums;
    private List<List<Integer>> actual;
    private List<List<Integer>> expected;

    @BeforeEach
    void setUp() {
        subsets = new Subsets();
    }

    @Test
    void subsets() {
        nums = new int[]{1,2,3};
        actual = subsets.getSubsets(nums);

        expected = new ArrayList<>();
        expected.add(Arrays.asList());
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(1, 2, 3));
        expected.add(Arrays.asList(1, 3));
        expected.add(Arrays.asList(2));
        expected.add(Arrays.asList(2, 3));
        expected.add(Arrays.asList(3));

        assertEquals(expected, actual);
    }
}