package com.madhurtoppo.leetcode.dp;

import java.util.Arrays;

public class CoinChange {
    public int memoize(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        Arrays.fill(memo, amount + 1);
        memo[0] = 0;

        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    memo[i] = Math.min(memo[i], memo[i - coins[j]] + 1);
                }
            }
        }
        return memo[amount] > amount ? -1 : memo[amount];
    }
}
