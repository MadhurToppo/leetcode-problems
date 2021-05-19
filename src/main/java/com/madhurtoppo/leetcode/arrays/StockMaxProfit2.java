package com.madhurtoppo.leetcode.arrays;

public class StockMaxProfit2 {
    public int kadane(int[] prices) {
        var max = 0;

        for (var i = 0; i < prices.length - 1; i++) {
            max = Math.max(max, max + (prices[i + 1] - prices[i]));
        }

        return max;
    }
}
