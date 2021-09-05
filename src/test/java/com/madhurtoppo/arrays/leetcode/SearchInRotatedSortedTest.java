package com.madhurtoppo.arrays.leetcode;

import com.madhurtoppo.arrays.leetcode.SearchInRotatedSorted;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInRotatedSortedTest {

    @Test
    void method2n1() {
        SearchInRotatedSorted searchInRotatedSorted = new SearchInRotatedSorted();

        int actual = searchInRotatedSorted.method2n1(new int[]{4,5,6,7,0,1,2}, 1);
        int expected = 5;
        assertEquals(expected, actual);

        int actual2 = searchInRotatedSorted.method2n1(new int[]{4,5,6,7,8,0,1,2}, 6);
        int expected2 = 2;
        assertEquals(expected2, actual2);

        int actual3 = searchInRotatedSorted.method2n1(new int[]{4,5,6,7,8,0,1,2}, 9);
        int expected3 = -1;
        assertEquals(expected3, actual3);
    }
}