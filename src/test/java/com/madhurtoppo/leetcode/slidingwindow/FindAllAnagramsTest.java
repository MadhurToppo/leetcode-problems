package com.madhurtoppo.leetcode.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindAllAnagramsTest {

    private FindAllAnagrams findAllAnagrams;
    private String s;
    private String p;
    private List<Integer> actual;
    private List<Integer> expected;

    @BeforeEach
    void setUp() {
        findAllAnagrams = new FindAllAnagrams();
    }

    @Test
    void findAnagramsTest1() {
        s = "cbaebabacd";
        p = "abc";

        actual = findAllAnagrams.findAnagrams(s, p);
        expected = new ArrayList<>(Arrays.asList(0, 6));
        assertIterableEquals(expected, actual);
    }

    @Test
    void findAnagramsTest2() {
        s = "abab";
        p = "ab";

        actual = findAllAnagrams.findAnagrams(s, p);
        expected = new ArrayList<>(Arrays.asList(0, 1, 2));
        assertIterableEquals(expected, actual);
    }
}