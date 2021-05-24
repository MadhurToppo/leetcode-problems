package com.madhurtoppo.leetcode.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationOfStringTest {

    private PermutationOfString permutationOfString;
    private String s1;
    private String s2;
    private boolean condition;

    @BeforeEach
    void setUp() {
        permutationOfString = new PermutationOfString();
    }

    @Test
    void checkInclustionTest1() {
        s1 = "ab";
        s2 = "eidbaooo";
        condition = permutationOfString.checkInclustion(s1, s2);
        assertTrue(condition);
    }

    @Test
    void checkInclustionTest2() {
        s1 = "ab";
        s2 = "eidboaoo";
        condition = permutationOfString.checkInclustion(s1, s2);
        assertFalse(condition);
    }
}