package com.madhurtoppo.leetcode.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseScheduleTest {

    private CourseSchedule courseSchedule;
    private int numCourses;
    private int[][] prerequisites;
    private boolean condition;

    @BeforeEach
    void setUp() {
        courseSchedule = new CourseSchedule();
    }

    @Test
    void canFinishTest1() {
        numCourses = 2;
        prerequisites = new int[][]{{1,0}};
        condition = courseSchedule.canFinish(numCourses, prerequisites);
        assertTrue(condition);
    }

    @Test
    void canFinishTest2() {
        numCourses = 5;
        prerequisites = new int[][]{{1,0}, {1,2}, {3,2}, {4,3}, {2,4}};
        condition = courseSchedule.canFinish(numCourses, prerequisites);
        assertFalse(condition);
    }

    @Test
    void canFinishTest3() {
        numCourses = 5;
        prerequisites = new int[][]{{1,0}, {1,2}, {3,2}, {2,4}};
        condition = courseSchedule.canFinish(numCourses, prerequisites);
        assertTrue(condition);
    }
}