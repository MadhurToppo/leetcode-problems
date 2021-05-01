package com.madhurtoppo.leetcode.arrays;

public class StockMaxProfit {
    public int kadane(int[] prices) {
        var current = 0;
        var max = 0;

        for (var i = 0; i < prices.length - 1; i++) {
            current = Math.max(0, current + (prices[i + 1] - prices[i]));
            max = Math.max(max, current);
        }

        return max;
    }
}
