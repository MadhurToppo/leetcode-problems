package com.madhurtoppo.arrays.leetcode;

import com.madhurtoppo.arrays.leetcode.MaxProduct;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProductTest {

    private MaxProduct maxProduct;
    private int actual;
    private int expected;

    @BeforeEach
    void setUp() {
        maxProduct = new MaxProduct();
    }

    @Test
    void kadaneTest1() {
        actual = maxProduct.kadane(new int[]{2,3,-2,4});
        expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void kadaneTest2() {
        actual = maxProduct.kadane(new int[]{2,-3,5,-2,-4});
        expected = 60;
        assertEquals(expected, actual);
    }
}