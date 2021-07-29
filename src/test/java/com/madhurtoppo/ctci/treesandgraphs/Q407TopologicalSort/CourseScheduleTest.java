package com.madhurtoppo.ctci.treesandgraphs.Q407TopologicalSort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseScheduleTest {

    private CourseSchedule courseSchedule;
    private int numCourses;
    private int[][] prerequisites;
    private int[] expected;
    private int[] actual;

    @BeforeEach
    void setUp() {
        courseSchedule = new CourseSchedule();
    }

    @Test
    void findOrderTest1() {
        numCourses = 2;
        prerequisites = new int[][]{
                {1,0}
        };
        actual = courseSchedule.findOrder(numCourses, prerequisites);
        expected = new int[]{0,1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findOrderTest2() {
        numCourses = 4;
        prerequisites = new int[][]{
                {1,0},
                {2,0},
                {3,1},
                {3,2}
        };
        actual = courseSchedule.findOrder(numCourses, prerequisites);
        expected = new int[]{0,1,2,3};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findOrderTest3() {
        numCourses = 1;
        prerequisites = new int[][]{
        };
        actual = courseSchedule.findOrder(numCourses, prerequisites);
        expected = new int[]{0};
        assertArrayEquals(expected, actual);
    }
}