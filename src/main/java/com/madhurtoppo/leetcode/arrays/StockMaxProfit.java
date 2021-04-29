package com.madhurtoppo.leetcode.arrays;
// {7,1,5,3,6,4}
// Buy@1, Sell@6, Output: 6-1 = 5

public class StockMaxProfit {
    public int kadane(int[] prices) {
        int current = 0;
        int max = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            current = Math.max(0, current += prices[i + 1] - prices[i]);
            max = Math.max(max, current);
        }

        return max;
    }
}
