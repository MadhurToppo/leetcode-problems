package com.madhurtoppo.dpandrecursion.tccig.q813climbing_stairs;

public class Question {
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
        int[] cache = new int[n + 1];
        cache[1] = 1;
        cache[2] = 2;
        for (int i = 3; i < n + 1; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[n];
    }
}
