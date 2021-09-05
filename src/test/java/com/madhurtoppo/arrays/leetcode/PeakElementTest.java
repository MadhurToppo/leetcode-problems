package com.madhurtoppo.arrays.leetcode;

import com.madhurtoppo.arrays.leetcode.PeakElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeakElementTest {

    @Test
    void method2() {
        PeakElement peakElement = new PeakElement();

        int actual = peakElement.method2(new int[]{1,2,3,1});
        int expected = 2;

        int actual2 = peakElement.method2(new int[]{1,0,1,3,5,6,4});
        int expected2 = 5;

        assertEquals(expected, actual);
        assertEquals(expected2, actual2);
    }
}