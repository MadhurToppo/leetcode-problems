package com.madhurtoppo.arrays.leetcode.q122stock_max_profit2;

import com.madhurtoppo.arrays.leetcode.q122stock_max_profit2.StockMaxProfit2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockMaxProfit2Test {

    @Test
    void kadane() {
        StockMaxProfit2 stockMaxProfit2 = new StockMaxProfit2();

        int actual = stockMaxProfit2.kadane(new int[]{7,1,5,3,6,4});
        int expected = 7;

        assertEquals(actual, expected);
    }
}