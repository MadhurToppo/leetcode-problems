package com.madhurtoppo.leetcode.arrays;

//{7,1,5,3,6,4}
//4,
public class StockMaxProfit2 {
    public int kadane(int[] prices) {
        int max = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            max = Math.max(max, max += prices[i + 1] - prices[i]);
        }

        return max;
    }
}
