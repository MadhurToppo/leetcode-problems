package com.madhurtoppo.tccig.dpandrecursion.q813climbing_stairs;

public class ClimbingStairs {
    public int recursive(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        return recursive(n - 1) + recursive(n - 2);
    }

    public int iterative(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        int[] memo = new int[n + 1];
        memo[1] = 1;
        memo[2] = 2;
        for (int i = 3; i < n + 1; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n];
    }
}
