package com.madhurtoppo.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    @Test
    void twoPointer() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

        int actual = containerWithMostWater.twoPointer(new int[]{1,8,6,2,5,4,8,3,7});
        int expected = 49;

        assertEquals(expected, actual);

        int actual2 = containerWithMostWater.twoPointer(new int[]{4,3,2,1,4});
        int expected2 = 16;

        assertEquals(expected2, actual2);
    }
}