package com.madhurtoppo.dpandrecursion.leetcode.q72edit_distance;

import com.madhurtoppo.dpandrecursion.leetcode.q72edit_distance.EditDistance;
//import com.madhurtoppo.leetcode.dpandrecursion.EditDistance;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EditDistanceTest {

    private EditDistance editDistance;
    private String word1;
    private String word2;
    private int actual;
    private int expected;

    @BeforeEach
    void setUp() {
        editDistance  = new EditDistance();
    }

    @Test
    void recursiveTest1() {
        word1 = "horse";
        word2 = "ros";
        actual = editDistance.recursive(word1, word2);
        expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void recursiveTest2() {
        word1 = "intention";
        word2 = "execution";
        actual = editDistance.recursive(word1, word2);
        expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void iterativeTest1() {
        word1 = "horse";
        word2 = "ros";
        actual = editDistance.iterative(word1, word2);
        expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void iterativeTest2() {
        word1 = "intention";
        word2 = "execution";
        actual = editDistance.iterative(word1, word2);
        expected = 5;
        assertEquals(expected, actual);
    }
}