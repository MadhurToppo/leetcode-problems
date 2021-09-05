package com.madhurtoppo.arrays.leetcode;

import com.madhurtoppo.arrays.leetcode.RotateMatrix;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    void rotateTest1() {
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

    @Test
    void rotateTest2() {
        matrix = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        rotateMatrix.rotate(matrix);
        actual = matrix;

        expected = new int[][]{
                {13,9,5,1},
                {14,10,6,2},
                {15,11,7,3},
                {16,12,8,4}
        };
        assertArrayEquals(expected, actual);
    }
}