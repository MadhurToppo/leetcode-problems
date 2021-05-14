package com.madhurtoppo.leetcode.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RotateMatrixTest {

    private RotateMatrix rotateMatrix;

    private int[][] matrix;
    private int[][] actual;
    private int[][] expected;

    @BeforeEach
    void setUp() {
        rotateMatrix = new RotateMatrix();
    }

    @Test
    void rotate() {
        matrix = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        rotateMatrix.rotate(matrix);
        actual = matrix;

        expected = new int[][]{
                {7,4,1},
                {8,5,2},
                {9,6,3}
        };

        assertArrayEquals(expected, actual);
    }
}