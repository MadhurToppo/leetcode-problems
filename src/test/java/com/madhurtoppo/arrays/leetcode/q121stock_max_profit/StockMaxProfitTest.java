package com.madhurtoppo.arrays.leetcode.q121stock_max_profit;

import com.madhurtoppo.arrays.leetcode.q121stock_max_profit.StockMaxProfit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockMaxProfitTest {

    @Test
    void kadane() {
        StockMaxProfit stockMaxProfit = new StockMaxProfit();

        int actual = stockMaxProfit.kadane(new int[]{7,1,5,3,6,4});
        int expected = 5;

        assertEquals(expected, actual);
    }
}