package com.madhurtoppo.tccig.dpandrecursion.q805coin_change;

import java.util.Arrays;

public class Question {
    public int change(int amount, int[] coins) {
        int[][] cache = new int[coins.length + 1][amount + 1];
        for (int[] row : cache) {
            Arrays.fill(row, -1);
        }
        return change(amount, 0, coins, cache);
    }

    private int change(int amount, int i, int[] coins, int[][] cache) {
        if (amount == 0) {
            return 1;
        }
        if (amount < 0 || i == coins.length) {
            return 0;
        }
        if (cache[i][amount] != -1) {
            return cache[i][amount];
        }
        return cache[i][amount] = change(amount - coins[i], i, coins, cache) + change(amount, i + 1, coins, cache);
    }
}
