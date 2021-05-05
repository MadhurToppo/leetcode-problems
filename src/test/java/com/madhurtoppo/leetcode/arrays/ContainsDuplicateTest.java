package com.madhurtoppo.leetcode.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    private ContainsDuplicate containsDuplicate;
    private int[] nums;

    @BeforeEach
    void setUp() {
        containsDuplicate = new ContainsDuplicate();
    }

    @Test
    void sorting() {
        nums = new int[]{1,2,3,1};

        Boolean actual = containsDuplicate.sorting(nums);
        Boolean expected = true;

        assertEquals(actual, expected);
    }

    @Test
    void hashSet() {
        nums = new int[]{4,2,3,4};

        Boolean actual = containsDuplicate.hashSet(nums);
        Boolean expected = true;

        assertEquals(actual, expected);
    }
}