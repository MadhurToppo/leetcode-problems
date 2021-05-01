package com.madhurtoppo.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    void sorting() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        Boolean actual = containsDuplicate.sorting(new int[]{1,2,3,1});
        Boolean expected = true;

        assertEquals(actual, expected);
    }

    @Test
    void hashSet() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        Boolean actual = containsDuplicate.hashSet(new int[]{1,2,3,1});
        Boolean expected = true;

        assertEquals(actual, expected);
    }
}