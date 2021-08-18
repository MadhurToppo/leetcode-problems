package com.madhurtoppo.tccig.RecursionAndDp.Q802TowerOfHanoi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    private Question question;
    private int n;
    private char origin;
    private char target;
    private char intermediate;

    private List<String> expected;
    private List<String> actual;

    @BeforeEach
    void setUp() {
        question = new Question();
        origin = 'A';
        target = 'C';
        intermediate = 'B';
    }

    @Test
    void test1() {
        n = 2;
        expected = new ArrayList<>();
        expected.add("Disk 1 moved from A to B");
        expected.add("Disk 2 moved from A to C");
        expected.add("Disk 1 moved from B to C");
        actual = question.moveDisks(n, origin, target, intermediate);

        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        n = 3;
        expected = new ArrayList<>();
        expected.add("Disk 1 moved from A to C");
        expected.add("Disk 2 moved from A to B");
        expected.add("Disk 1 moved from C to B");
        expected.add("Disk 3 moved from A to C");
        expected.add("Disk 1 moved from B to A");
        expected.add("Disk 2 moved from B to C");
        expected.add("Disk 1 moved from A to C");
        actual = question.moveDisks(n, origin, target, intermediate);

        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        n = 4;
        expected = new ArrayList<>();
        expected.add("Disk 1 moved from A to B");
        expected.add("Disk 2 moved from A to C");
        expected.add("Disk 1 moved from B to C");
        expected.add("Disk 3 moved from A to B");
        expected.add("Disk 1 moved from C to A");
        expected.add("Disk 2 moved from C to B");
        expected.add("Disk 1 moved from A to B");
        expected.add("Disk 4 moved from A to C");
        expected.add("Disk 1 moved from B to C");
        expected.add("Disk 2 moved from B to A");
        expected.add("Disk 1 moved from C to A");
        expected.add("Disk 3 moved from B to C");
        expected.add("Disk 1 moved from A to B");
        expected.add("Disk 2 moved from A to C");
        expected.add("Disk 1 moved from B to C");

        actual = question.moveDisks(n, origin, target, intermediate);

        assertEquals(expected, actual);
    }
}